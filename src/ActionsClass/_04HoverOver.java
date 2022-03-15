package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.*;

public class _04HoverOver {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\Drivers\\chromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.myntra.com/");

        WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(10));
        Actions actions = new Actions(driver);

        List<WebElement> menuList = driver.findElements(By.xpath("//div[contains(@class,'desktop-navLinks')]"));

            for (WebElement i : menuList) {
                Action action = actions.moveToElement(i).build();
                action.perform();
                Thread.sleep(2000);
            }
        Thread.sleep(1000);
        driver.quit();
        }
    }

