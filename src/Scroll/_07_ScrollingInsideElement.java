package Scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.BaseStaticDriver;

import java.time.Duration;

public class _07_ScrollingInsideElement extends BaseStaticDriver {

    public static void main(String[] args) {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().deleteAllCookies();

        driver.get("http://ressio.github.io/lazy-load-xt/demo/horizontal.htm");
        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement divWrapper = driver.findElement(By.className("wrapper"));
        js.executeScript("arguments[0].scrollBy(0,500)",divWrapper);

    }

}
