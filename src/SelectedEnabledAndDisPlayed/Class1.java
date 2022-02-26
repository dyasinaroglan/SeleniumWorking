package SelectedEnabledAndDisPlayed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class Class1 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwBasicButton");
        Thread.sleep(1000);
        WebElement normalButton = driver.findElement(By.cssSelector("button[id='gwt-debug-cwBasicButton-normal']"));
        normalButton.click();

        boolean clickMe = normalButton.isSelected();
        System.out.println(clickMe);

        driver.quit();

    }
}
