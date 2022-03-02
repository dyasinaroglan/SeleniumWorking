package Waits;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseStaticDriver;

import java.time.Duration;

public class _03WaitExample extends BaseStaticDriver {

    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.demoblaze.com/index.html");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        WebElement samsungS6 = driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']"));
        samsungS6.click();

        WebElement addToCard = driver.findElement(By.xpath("//a[text()='Add to cart']"));
        addToCard.click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.alertIsPresent());

        String message = driver.switchTo().alert().getText();
        System.out.println("messagee : " + message);
        Assert.assertEquals("Product added",message);

        driver.switchTo().alert().accept();

        Thread.sleep(1000);
        driver.quit();

    }
}
