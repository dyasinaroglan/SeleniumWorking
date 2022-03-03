package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.time.Duration;

public class Practices1 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

        driver.switchTo().alert().accept();

        WebElement noThanks = driver.findElement(By.cssSelector("https://demo.seleniumeasy.com/basic-first-form-demo.html"));
        noThanks.click();
    }
}
