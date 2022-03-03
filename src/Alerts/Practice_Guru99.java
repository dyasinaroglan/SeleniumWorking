package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseStaticDriver;

import java.time.Duration;

public class Practice_Guru99 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://www.demo.guru99.com/test/delete_customer.php");

        WebElement customerId = driver.findElement(By.cssSelector("input[type='text']"));
        customerId.sendKeys("omer123");

        WebElement submit = driver.findElement(By.cssSelector("input[type='submit']"));
        submit.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent());

        System.out.println(driver.switchTo().alert().getText());
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        wait.until(ExpectedConditions.alertIsPresent());
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();


    }
}
