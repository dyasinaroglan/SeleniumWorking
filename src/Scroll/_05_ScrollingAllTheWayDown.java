package Scroll;

import org.openqa.selenium.JavascriptExecutor;
import utils.BaseStaticDriver;

import java.time.Duration;

public class _05_ScrollingAllTheWayDown extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().deleteAllCookies();

        driver.get("https://techno.study/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)"); //sayfanın en altına konumlanır.
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)"); //sayfanın en üstüne çıkar.


    }
}
