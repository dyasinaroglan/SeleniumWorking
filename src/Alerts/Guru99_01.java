package Alerts;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class Guru99_01 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("http://www.demo.guru99.com/test/delete_customer.php");

        WebElement customerId = driver.findElement(By.xpath("//input[@type='text']"));
        customerId.sendKeys("sadsads");

        WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
        submit.click();

        Thread.sleep(2000);

        driver.switchTo().alert().accept();

        Assert.assertEquals("Customer Successfully Delete!", driver.switchTo().alert().getText());
        Thread.sleep(1000);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();

        driver.quit();
    }
}
