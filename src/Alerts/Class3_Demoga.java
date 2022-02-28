package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseStaticDriver;

public class Class3_Demoga extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://demoqa.com/alerts");

        WebElement button4 = driver.findElement(By.id("promtButton"));
        button4.click();

        WebDriverWait wait = new WebDriverWait(driver,3);
        wait.until(ExpectedConditions.alertIsPresent());
        Thread.sleep(1000);

        System.out.println(driver.switchTo().alert().getText());

        driver.switchTo().alert().sendKeys("yasin");
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
    }
}
