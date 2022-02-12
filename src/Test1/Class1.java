package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\chromeDriver\\chromedriver.exe");
                                   //key--propertyName                         value
        //"C:\SELENIUM\chromeDriver\chromedriver.exe" CTRL+SHIFT+MOUSE SAĞ TIKLAYIP---yol olarak kopyala dediğimzde geliyor.
        /*
        setProperty--->
        amacı hangi tarayıcın test edileceğine karar vermek ve web uygulaması için
        testleri otomatikleştirmenin ilk adımıdır. sistem özelliklerini tanımlamak
        ve tarayıcı nesnesini başlatmak gerekli hale gelir.
         */
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");  //test edeceğimiz driveri getirdik.
        driver.manage().window().maximize();  //driveri yönet ve pencereye maximize et, büyüt.


        /*
        1.id --- ile element bulma (kimlik)
        2.name---- ile element bulma (ad) (soyad)
        3.className --- ile element bulma (sınıf adı)
        4.LinkText    (bağlantı linki)
        5.partialLinkText kısmi bağlantı linki)
        6.tagName  (etiket adı)
        7.cssSelector  todo tagAdı[@özellikAdı ='deger']
        8.xpath
         */

        driver.findElement(By.id("user-name")).sendKeys("asdsdsd");
        //hangi özelliği ile bulucam By.id--kimliği ile bul
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        //sendKeys--anahtar kelime gönder diyor bana
        driver.findElement(By.id("login-button")).click(); //click tıklayın(tıklamamız lazım)
        Thread.sleep(3000);
        driver.close();
        //


    }
}
