package Scroll;

import org.openqa.selenium.JavascriptExecutor;
import utils.BaseStaticDriver;

import java.time.Duration;

public class _02Switch_Window extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().deleteAllCookies();
        driver.get("https://triplebyte.com/");
        Thread.sleep(1000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); //+document--->sayfanın  en sonuna gider
        Thread.sleep(1000);
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)"); //-document ---> sayfanın en üstüne çıkar
        Thread.sleep(1000);

        driver.quit();
    }
}
