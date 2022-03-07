package Scroll;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseStaticDriver;

import java.time.Duration;

public class _04_Scrolling extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().deleteAllCookies();
        driver.get("https://techno.study/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("window.scrollBy(0,5000)");
       // js.executeScript("window.scrollBy(0,5000)"); rakamdan sonra noktalı virgül yok
        Thread.sleep(1000);
        //js.executeScript("scroll(0,4500);"); // tüm sayfada konumlanmasını istediğimiz yer
        js.executeScript("window.scrollBy(0,-2500)");

    }
}
