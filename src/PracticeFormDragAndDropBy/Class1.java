package PracticeFormDragAndDropBy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class Class1 extends BaseStaticDriver {


    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.hotels.com/");

        WebElement search = driver.findElement(By.xpath("//input[@name='q-destination']"));
        search.click();
        search.sendKeys("Frankfurt");
        search.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        WebElement ara = driver.findElement(By.xpath("//button[@class='_3pFoIe eLsxCc']"));
        ara.click();
        Thread.sleep(1000);
        WebElement solButton = driver.findElement(By.xpath("(//div[@data-type='down'])[1]"));
        WebElement sagButton = driver.findElement(By.xpath("(//div[@data-type='up'])[1]"));

        WebElement kaydırıcıCubugu = driver.findElement(By.xpath("(//span[@class='aPhL7p'])[1]"));
        int cubukUzunluk = kaydırıcıCubugu.getSize().getWidth();  //cubuğun genişiliğine olan uzunluğunu veriyor.
        System.out.println("fiyat çubuğunun uzunluğu = " + cubukUzunluk);

    }
}
