package GalatasarayTest;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class Class1 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.navigate().to("https://www.galatasaray.org/haberler/futbol-2014-2015/43");
        WebElement idman16 = driver.findElement(By.cssSelector("img[alt='İdman Raporu | 16 Şubat Çarşamba']"));
        idman16.click();

        driver.navigate().back(); //ne yöne gideceğimizi belirtiyoruz.
        String backSite = driver.getCurrentUrl();  //mevcut bulunduğumuz yeri tanımlamamız lazım
        String expected = "https://www.galatasaray.org/haberler/futbol-2014-2015/43"; //gitmesi istenilen sayfa
        Assert.assertEquals("yanlış url",expected,backSite);
        Thread.sleep(2000);

        driver.navigate().forward();
        String forwardSite = driver.getCurrentUrl(); //bulunduğumuz en sın işlem yaopılan sayfa
        String expected1 = "https://www.galatasaray.org/haber/futbol/idman-raporu-16-subat-carsamba/50431";
        Assert.assertEquals("yanlış url",expected1,forwardSite);
        Thread.sleep(2000);

        driver.quit();


    }


}
