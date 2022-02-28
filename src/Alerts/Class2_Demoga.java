package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseStaticDriver;

public class Class2_Demoga extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        WebElement button3 = driver.findElement(By.id("confirmButton"));
        button3.click();

        WebDriverWait wait = new WebDriverWait(driver,3);
        wait.until(ExpectedConditions.alertIsPresent());
        Thread.sleep(1000);

        System.out.println(driver.switchTo().alert().getText()); //bu da alert in içindeki metini yazdırma

        driver.switchTo().alert().accept();
     //   driver.switchTo().alert().dismiss();  bu reddetme cancel tuşuna basma.

        driver.quit();

    }
}
