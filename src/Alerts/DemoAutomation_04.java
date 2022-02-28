package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class DemoAutomation_04 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://demo.automationtesting.in/Alerts.html");

        WebElement alertWithTextBox = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
        alertWithTextBox.click();

        WebElement clickTheButton = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
        clickTheButton.click();

        Thread.sleep(1000);

        driver.switchTo().alert().sendKeys("yasin");
        Thread.sleep(1000);
        driver.switchTo().alert().accept();

        Thread.sleep(1000);

        driver.quit();


    }
}
