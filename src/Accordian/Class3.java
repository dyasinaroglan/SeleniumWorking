package Accordian;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class Class3 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("https://demoqa.com/accordian");
        WebElement button3 = driver.findElement(By.xpath("//div[@class='card'][3]/div[2]"));
        String text = button3.getAttribute("class");
        System.out.println(text);

        driver.findElement(By.id("section3Heading")).click();
        text = button3.getAttribute("class");
        System.out.println(text);

        Thread.sleep(1000);
        text = button3.getAttribute("class");
        System.out.println(text);

        driver.quit();


    }
}
