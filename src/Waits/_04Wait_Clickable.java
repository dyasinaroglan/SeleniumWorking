package Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseStaticDriver;

import java.time.Duration;

public class _04Wait_Clickable extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.demoblaze.com/index.html");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement samsungS6 = driver.findElement(By.linkText("Samsung galaxy s6"));
        samsungS6.click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[onclick='addToCart(1)']")));

        WebElement addToCard = driver.findElement(By.linkText("Add to cart"));
        addToCard.click();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        driver.quit();
    }
}
