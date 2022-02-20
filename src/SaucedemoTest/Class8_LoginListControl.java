package SaucedemoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.util.List;

public class Class8_LoginListControl extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        /*
         1- https://www.saucedemo.com/  sitesini acin
     2- Ekranda gorunen usernameleri bir string diziye atiniz
     3- Bu username ve passwordlarını hepsinin login olup olamadığını
        login olduktan sonraki sayfada Products kelimesinin kontrol ederek
        doğrulayınız.
        diğer login kontrolleri için navigate.back kullanınız.
     4- Login olamayan userları ve hata bilgisini yazdırınız.
         */
        driver.navigate().to("https://www.saucedemo.com/");
        WebElement users = driver.findElement(By.cssSelector("div[id='login_credentials']"));
        String userText = users.getText();
        System.out.println(userText); //bu userText leri userNames adında String bir diziye atalım. ve her userdan sonra
        //bir alt satıra geçtiği için bunları alt satıra geçen "\n" işareti ile split yapalım
        String[] userNames = userText.split("\n");
        for (int i = 1; i < userNames.length; i++) {
            Thread.sleep(1000);
            //sonra bu for döngüsünün içinde her defasında user ve password u girsin.

            WebElement kullanıcıAdı = driver.findElement(By.cssSelector("input[id='user-name']"));
            kullanıcıAdı.clear(); //clear yapmamızın sebebi tekrar geri dönüp başka kullanıcı adlarını gireceği için
            //bir önceki kullanıcı girişlerinin orada kalması ve yenisinin üstüne yazması tehlikesidir
            kullanıcıAdı.sendKeys(userNames[i]);

            WebElement sifre = driver.findElement(By.cssSelector("input[id='password']"));
            sifre.clear();
            sifre.sendKeys("secret_sauce"); //zaten bir tane var.

            WebElement login = driver.findElement(By.cssSelector("input[id='login-button']"));
            login.click();

            List<WebElement> products = driver.findElements(By.cssSelector("span[class='title']"));
            if(products.size()==1){
                System.out.println(userNames[i] + " bu userNamea ile login olundu");
                Thread.sleep(1000);
                driver.navigate().back();
            }else {
                WebElement error =driver.findElement(By.cssSelector("div[class='error-message-container error']"));
                System.out.println(userNames[i] + " bu userNames ile login olunamadı....");
            }


            
        }

    }
}
