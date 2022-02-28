package PracticeFormDemoga;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;

public class Class1 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        /*
Ödev:
            https://demoqa.com/automation-practice-form   bu siteye gidin.
todo        SADECE aşağıda bahsedilen kısımları doldurunuz !
1.  Name
2.    LastName
3.      Email
4.      Gender:
5.      Hobbies
6.      Current adress
7.      submit butona tıkla
8.      Ekrandaki mesajı dogrula
9.      2 Saniye bekledikten sonra close butonuna bas
10.   2 saniye bekleyip sistemi kapat.

             Bilgi mesajı : Thanks for submitting the form

            Test başarıyla tamamlandıysa konsolda "Formu doldurdugunuz için teşekkür ederiz..." mesajı yazsın.

        todo   NOT: CSS SELECTOR ile arama yaparken input, button, label gibi tag leri de iyi inceleyin.
            Bu test ısınma içindir. CSS selector pazartesi günü daha detaylı görülecektir.

 */

        driver.get("https://demoqa.com/automation-practice-form");
        WebElement firstName = driver.findElement(By.cssSelector("input[id='firstName']"));
        firstName.sendKeys("yasin");

        WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
        lastName.sendKeys("aroglan");

        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("yasinargln@gmail.com");

        WebElement gender = driver.findElement(By.cssSelector("label[for='gender-radio-1']"));
        gender.click();

        WebElement mobile = driver.findElement(By.cssSelector("input[id*='userN']"));
        mobile.sendKeys("456484984");

        WebElement date = driver.findElement(By.cssSelector("input[id*='da']"));
        date.click();

        /*
        Thread.sleep(1000);
        WebElement subjects = driver.findElement(By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']"));
        subjects.sendKeys("bu bir testtir.");
        */


        WebElement hobbies = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']"));
        hobbies.click();

        WebElement picture = driver.findElement(By.cssSelector("input[id='uploadPicture']"));
        picture.sendKeys("C:\\Users\\yasin\\Desktop\\not.jfif");

        WebElement currentAdress = driver.findElement(By.id("currentAddress"));
        currentAdress.sendKeys("bu bir otomasyon testidir.");

        driver.quit();
    }
}
