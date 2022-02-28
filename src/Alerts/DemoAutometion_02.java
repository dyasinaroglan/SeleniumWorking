package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class DemoAutometion_02 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("http://demo.automationtesting.in/Alerts.html");

        WebElement clickTheButton = driver.findElement(By.cssSelector("button[class='btn btn-danger']"));
        clickTheButton.click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();

    }
}
