package Accordian;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class Class2 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("https://demoqa.com/accordian");

        WebElement button2 = driver.findElement(By.xpath("//div[@class='card'][2]/div[2]"));
        String text = button2.getAttribute("class");
        System.out.println(text);
        driver.findElement(By.id("section2Heading")).click();

        text = button2.getAttribute("class");
        System.out.println(text);

        Thread.sleep(1000);
        text = button2.getAttribute("class");
        System.out.println(text);

        driver.quit();



    }
}
