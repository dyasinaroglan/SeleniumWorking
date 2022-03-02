package Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseStaticDriver;

import java.time.Duration;

public class _02ExplicitlyWait extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        /**
         * implicitly  ----> tüm elementler için bekleme süresi
         * explicitly ----> özel olarak tek bir element için bekleme süresi
         *
         * .tıtleIs ---> tıtle bu olana kadar bekle
         * .tıtleContains  ---> title içinde belirttiğimiz kelime geçene kadar bekle
         * .visibilityOfTheElement   ---> element gözükene kadar bekle (elemanın görünürlüğü)
         * .elementToBeClickable  ---> element tıklanabilir olana kadar bekle
         * .elementToBeSelected  ---> element seçilebilir olana kadar bekle
         * .alertIsPresent   ----> alert çıkana kadar bekle
         * .textToBe   ----> element text görünür olana kadar bekle
         * .InvisibilityOfTheElement   ----> element kaybolana kadar bekle (ögenin görünmezliği)
         */

        /*
        implicitly wait in süresini bekliyor, hala bulamadıysa explicity wait ile belirgin elementi bekliyor.
        her iki süre sonunda bulamazsa, hata veriyor.
         */

        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


        WebElement button = driver.findElement(By.cssSelector("button[onclick='timedText()']"));
        button.click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        WebElement clickMe = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
        System.out.println("webDrive = " + clickMe.getText());

        Thread.sleep(1000);
        driver.quit();
    }
}
