package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseStaticDriver;

public class Class1_Demoga extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://demoqa.com/alerts");

        //önce tıklama yapalım
        WebElement button1 = driver.findElement(By.id("alertButton"));
        button1.click();

        WebDriverWait wait = new WebDriverWait(driver,3); //3 saniye bekleyecek
        wait.until(ExpectedConditions.alertIsPresent());  // bu elart var mı onu bekleyecek.
        Thread.sleep(1000);

        driver.switchTo().alert().accept();

        WebElement button2 = driver.findElement(By.id("timerAlertButton"));
        button2.click();
        //tıkladıktan sonra 5 saniye bekleteceğiz.
        WebDriverWait wait1 = new WebDriverWait(driver,5);
        wait1.until(ExpectedConditions.alertIsPresent());
        Thread.sleep(1000);
        driver.switchTo().alert().accept();

        // TODO: 28.02.2022 accept() ---- kabul  etme. dismiss(); ---cancel tuşuna basma, reddetme
        // TODO: 28.02.2022  sendKeys() --- çıkan metni yazdırmamızı sağlar.

    }
}
