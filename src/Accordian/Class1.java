package Accordian;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class Class1 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://demoqa.com/accordian");
        WebElement firsCard = driver.findElement(By.xpath("//div[@class='card'][1]/div[2]"));
        String className = firsCard.getAttribute("class");
        System.out.println(className);
        driver.findElement(By.id("section1Heading")).click();
        className = firsCard.getAttribute("class");
        System.out.println(className);

        Thread.sleep(1000);
        className = firsCard.getAttribute("class");
        System.out.println(className);

    }
}
