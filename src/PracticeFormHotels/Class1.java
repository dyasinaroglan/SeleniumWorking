package PracticeFormHotels;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseStaticDriver;

import java.time.Duration;

public class Class1 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
         /*
            1.driver.get("https://www.hotels.com/");  sayfasına gidin
            2. arama kısmına "Istanbul " yazıp Enter yapın.
            3.Fiyat aralıgını $355 to $500    olarak değiştirin.
            4.Fiyatların aralıga uygun olup olmadıgını check edin ve konsola fiyatları yazdırın.
            5. ipucu: Try catch
         */
        driver.get("https://www.hotels.com/");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        WebElement search = driver.findElement(By.cssSelector("input[placeholder='örneğin İstanbul']"));
        search.sendKeys("Istanbul");
        search.sendKeys(Keys.RETURN);
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='örneğin İstanbul']")));

        WebElement ara = driver.findElement(By.xpath("//button[@type='submit']"));
        Thread.sleep(1000);
        ara.sendKeys(Keys.ENTER);

        WebElement solButton = driver.findElement(By.xpath("(//div[@data-type='down'])[1]"));
        WebElement sagButton = driver.findElement(By.xpath("(//div[@data-type='up'])[1]"));

        Actions builder = new Actions(driver);
        Action solButtonArttır = builder.dragAndDropBy(solButton,80,0).build(); //arttırdığımız için x ekseni pozitif değeri aldı
        solButtonArttır.perform();

        Action sagButtonAzalt = builder.dragAndDropBy(sagButton,-77,0).build();  //azalttığımız için x ekseni negatif değer aldı
        sagButtonAzalt.perform();

        String minText = "320 TL-680 TL";
        String actual = driver.findElement(By.xpath("//span[text()='320 TL-680 TL']")).getText();
        System.out.println(actual);

        Assert.assertEquals(minText,actual);
        if(minText.equals(actual)){
            System.out.println("fiyat aralığı doğrudur...");
        }
    }
}
