package Scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.time.Duration;

public class _03Scroll_IntoView extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().deleteAllCookies();
        driver.get("https://triplebyte.com/");
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement element = driver.findElement(By.cssSelector("a[data-question-slug='filters']"));

       // js.executeScript("arguments[0].scrollIntoView(true);",element); //istediğim lokasyona scroll yap diyorum.(ELEMENT)
        //TRUE olduğu için ilk başta yani default değeri olarak ana sayfanın üst kısmında konuçlanıyor.

        js.executeScript("arguments[0].scrollIntoView(false);",element);  // yine burada da bulduğum lokasyona scroll yap diyorum.
        //FALSE --- olduğu için ilk başta yani default değeri olarak ana sayfanın alt kısmında konuçlanıyor. bulmasını istediğim lokasyon aşağıda kalıyor

        js.executeScript("arguments[0].scrollIntoView();",element); //buda true ile aynı ana sayfanın üst kısmında konuçlanıyor

        driver.quit();

    }
}
