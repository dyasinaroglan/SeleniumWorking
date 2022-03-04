package WindowHandles;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.time.Duration;
import java.util.Set;

public class _03Switch_Ornek extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        /*
    https://www.amazon.com.tr/  siteye gidiniz
    Cerezleri kabul et                                           // input[name='accept']
    arama textbox a "Kitap" yazip ara butonuna click yapalim    // input#twotabsearchtextbox   // input[type='submit']
    Ürün listesinde 40. kitaba e kadar scrool yapalim            (//img[@class='s-image'])[40]
     sonra kitabi click yapalim
     Twitter iconun kadar scroll yapip click yapalim         //  (//a[@target='_blank'])[2]
     name kismina bir text gönderelim                        // input[type='text']
     */
        driver.get("https://www.amazon.com.tr/");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().deleteAllCookies();

        String anaayfaID = driver.getWindowHandle();

        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.click();
        search.sendKeys("kitap");

        WebElement ara = driver.findElement(By.id("nav-search-submit-button"));
        ara.click();

        WebElement cerez = driver.findElement(By.id("sp-cc-accept"));
        cerez.click();

        //şimdi ben kitap listesine geldikten sonra 41. kitabı seçicem. kitabı tıklama yaptığımda ise başka bir pencere açılacak.
        //başka bir pencere açılacapı için yeni bir ıd tanımlanacak.benim o yeni açılan sayfada işlem yapabilmem için switchTo() ile
        //o sayfanın id sine geçiş yapmam lazım

        //ama ondan önce kitabın bulunduğu yere scroll yapayım
        WebElement kitap = driver.findElement(By.cssSelector("img[data-image-index='41']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",kitap);
        kitap.click();

        WebElement facebook = driver.findElement(By.xpath("(//a[@target='_blank'])[3]"));
        js.executeScript("arguments[0].scrollIntoView(false);",facebook);
        Thread.sleep(1000);
        //şimdi ben facebook tıklama yaptığımda ise başka bir pencere açılacak.
        //başka bir pencere açılacapı için yeni bir ıd tanımlanacak.benim o yeni açılan sayfada işlem yapabilmem için switchTo() ile
        //o sayfanın id sine geçiş yapmam lazım.
        facebook.click();

        Set<String> windowId = driver.getWindowHandles();
        for (String i : windowId) {
            if(!windowId.equals(anaayfaID)){
                driver.switchTo().window(i);
                WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
                email.sendKeys("yasinargln@");
                Thread.sleep(1000);
                driver.close();
            }
        }
        driver.switchTo().window(anaayfaID);

        driver.quit();
    }
}
