package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseStaticDriver;

public class Class4_Demoga extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("https://demoqa.com/alerts");

        WebElement button = driver.findElement(By.id("promtButton"));
        button.click();

        WebDriverWait wait = new WebDriverWait(driver,2);
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();

        System.out.println(alert.getText());
        Thread.sleep(1000);
        alert.sendKeys("yasin");
        Thread.sleep(1000);
        alert.accept();

    }
}
