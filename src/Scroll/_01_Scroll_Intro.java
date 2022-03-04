package Scroll;

import org.openqa.selenium.JavascriptExecutor;
import utils.BaseStaticDriver;

import java.time.Duration;

public class _01_Scroll_Intro extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().deleteAllCookies();
        driver.get("https://triplebyte.com/");
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)"); //bulunduğu konumdan verdiğimiz ölçğ kadar aşağıya scroll yapar.
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,2000)"); //
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,-2000)"); //yukarı scroll yapar
        Thread.sleep(2000);
        js.executeScript("scroll(0,3000)"); //sayfanın tamamnında konumlanmasaını istediğimiz yere scroll yapıyor


    }
}
