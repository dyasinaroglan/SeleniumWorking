package PracticeFormDragAndDropBy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

import java.time.Duration;

public class Class1 extends BaseStaticDriver {


    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.hotels.com/");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement search = driver.findElement(By.cssSelector("input[placeholder='örneğin İstanbul']"));
        search.click();
        search.sendKeys("Frankfurt");
        search.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        WebElement ara = driver.findElement(By.xpath("//button[@class='_3pFoIe eLsxCc']"));
        ara.click();
        Thread.sleep(1000);
        WebElement solButton = driver.findElement(By.xpath("(//div[@class='Foq5En'])[1]"));
        WebElement sagButton = driver.findElement(By.xpath("(//div[@data-type='up'])[1]"));

        WebElement kaydırıcıCubugu = driver.findElement(By.xpath("(//span[@class='aPhL7p'])[1]"));
        int cubukUzunluk = kaydırıcıCubugu.getSize().getWidth();  //cubuğun genişiliğine olan uzunluğunu veriyor.
        System.out.println("fiyat çubuğunun uzunluğu = " + cubukUzunluk);

        int maxFiyat = 500;
        int minFiyat = 0;
        //fiyat aralığını 100$ - 400$ yapmak istiyorum.
        int altFiyat = 100;
        int ustFiyat = -100;  //500 den 400 e azaltmam lazım.

        int kaydırmaOranı1 = (altFiyat*cubukUzunluk)/(maxFiyat-minFiyat);
        int kaydırmaOranı2 = (ustFiyat*cubukUzunluk)/(maxFiyat-minFiyat);

        Actions builder = new Actions(driver);

        Action action = builder.dragAndDropBy(solButton,kaydırmaOranı1,0).build();
        action.perform();

        Action action1 = builder.dragAndDropBy(sagButton,kaydırmaOranı2,0).build();
        action1.perform();

        Thread.sleep(2000);
        driver.quit();

    }
}
