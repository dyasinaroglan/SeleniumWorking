package TestLeaf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.time.Duration;

public class Class3 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://leaftaps.com/opentaps");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("DemoSalesManager");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("crmsfa");
        WebElement logın = driver.findElement(By.cssSelector("input[class='decorativeSubmit']"));
        Thread.sleep(1000);
        logın.click();

        String title = driver.getTitle(); //en üstteki başlığı verir.
        System.out.println(title);
    }
}
