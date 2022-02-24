package SaucedemoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.util.List;

public class Class12_ElementsStatus extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");
        Thread.sleep(1000);
        WebElement wednesday = driver.findElement(By.id("gwt-debug-cwCheckBox-Wednesday-label"));
        System.out.println("seçilmedem önce  = " + wednesday.isSelected()); //seçili değil false
        System.out.println(wednesday.isEnabled());  //tıklanabilir true
        System.out.println(wednesday.isDisplayed()); //görünür true

        wednesday.click();
        System.out.println("seçildikten sonra = " + wednesday.isSelected());
        System.out.println("************************");

        List<WebElement> days = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for (WebElement i : days) {
            System.out.println(i.isDisplayed());
            System.out.println(i.isEnabled());
            System.out.println(i.isSelected());
            System.out.println("******************");
        }
    }
}
