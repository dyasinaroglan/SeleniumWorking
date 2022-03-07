package WindowHandles;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;

import java.time.Duration;
import java.util.Set;

public class _06_CloseWindow extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().deleteAllCookies();

        driver.get("https://techno.study/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String anasayfaID = driver.getWindowHandle();

        WebElement getFreeConsultation = driver.findElement(By.linkText("Get free consultation"));
        getFreeConsultation.click();

        Set<String> windowID = driver.getWindowHandles(); //açılan tüm ıd leri set içine attık. bunları tek tek döndürmemiz lazım ve yeni açılan sayfanın
        //id sine ulaşmamız lazım.
        for (String webElement : windowID) {
            if(!windowID.equals(anasayfaID)){ //windowıd anasayfa ıd si değilse demek ki yeni açılan sayfanın ıd sidir
                driver.switchTo().window(webElement);
                WebElement email = driver.findElement(By.xpath("(//input[@autocomplete='email'])[3]"));
                email.sendKeys("sasads@gmail.com");
        }

        }
        Thread.sleep(1000);
        WebElement email = driver.findElement(By.xpath("(//input[@autocomplete='email'])[3]"));
        email.sendKeys("sasads@gmail.com");
        driver.close();
        driver.switchTo().window(anasayfaID);

        WebElement home = driver.findElement(By.xpath("(//a[@rel='noopener noreferrer'])[1]"));
        Thread.sleep(1000);
        js.executeScript("arguments[0].scrollIntoView(true);",home);
        Thread.sleep(1000);
        home.click();

        driver.quit();



    }


}
