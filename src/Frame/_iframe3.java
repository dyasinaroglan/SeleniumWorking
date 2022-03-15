package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _iframe3 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\SELENIUM\\Drivers\\chromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));



        driver.get("https://chercher.tech/practice/frames");
        driver.switchTo().frame("frame2");

        WebElement selectMenu = driver.findElement(By.cssSelector("select[class='col-lg-3']"));
        wait.until(ExpectedConditions.elementToBeClickable(selectMenu)).click();

        Select select1 = new Select(selectMenu);

        select1.selectByValue("babycat");

        //driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();

        WebElement homeButton = driver.findElement(By.id("head"));
        homeButton.click();

        Thread.sleep(2000);
        driver.quit();

    }
}
