package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class DemoAutomation_03 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("http://demo.automationtesting.in/Alerts.html");

        WebElement alertWithButton = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
        alertWithButton.click();

        WebElement clicTheButton = driver.findElement(By.cssSelector("button[class='btn btn-primary']"));
        clicTheButton.click();
        Thread.sleep(1500);

        //driver.switchTo().alert().accept();
        driver.switchTo().alert().dismiss();
    }
}