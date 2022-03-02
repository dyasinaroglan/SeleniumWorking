package Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.time.Duration;

public class _01Wait extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));  //sayfa açılımında, driver ilk açıldığında
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));  //her element için
        // elementi bulduğu an beklemeyi durdurur. 30 saniyenin tamamını beklemez.

        WebElement clickMe = driver.findElement(By.xpath("//button[@onclick='timedText()']"));
        clickMe.click();

        WebElement webDriver = driver.findElement(By.xpath("//p[text()='WebDriver']"));  //button a click yapıldıktan sonra oluşan lokasyon
        //implicity aktif olmasaydı driver bu lokasyonun gelmesini beklemeyeceği için hata verecekti.
        System.out.println("webDriver = " + webDriver.getText());
    }
}
