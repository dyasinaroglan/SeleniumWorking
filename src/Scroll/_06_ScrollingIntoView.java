package Scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.BaseStaticDriver;

import java.time.Duration;
import java.util.Base64;

public class _06_ScrollingIntoView extends BaseStaticDriver {

    public static void main(String[] args) throws InterruptedException {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().deleteAllCookies();

        driver.get("https://techno.study/");
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //scrollIntoView --istenilen elementin konumuna gitme.
        WebElement whatWeDo = driver.findElement(By.xpath("(//div[@class='t-section__title t-title t-title_xs'])[3]"));
        Thread.sleep(1000);
        js.executeScript("arguments[0].scrollIntoView(true);",whatWeDo);
        Thread.sleep(1000);
        js.executeScript("arguments[0].scrollIntoView(false);",whatWeDo);
        Thread.sleep(1000);
        js.executeScript("arguments[0].scrollIntoView();",whatWeDo);


        driver.quit();





    }

}
