package SaucedemoTest;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class Class7_NavigateTo extends BaseStaticDriver {

    public static void main(String[] args) throws InterruptedException {
        //Class6_TryCatch.login("standard_user","secret_sauce");  methodun içinde driver get özelliğini
        //kullandığımız için bu methodu kullanamayız.
        driver.navigate().to("https://www.saucedemo.com/");
        WebElement userName = driver.findElement(By.cssSelector("input[id='user-name']"));
        userName.sendKeys("standard_user");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        WebElement login = driver.findElement(By.cssSelector("input[id='login-button']"));
        login.click();

        WebElement urun = driver.findElement(By.cssSelector("img[alt='Sauce Labs Backpack']"));
        urun.click();
        Thread.sleep(2000);

        driver.navigate().back();  //navigate--gezinmek
        String backSite = driver.getCurrentUrl();  //mevcut açık olan sayfa
        String expected1 = "https://www.saucedemo.com/inventory.html"; //gelmesini beklediğimiz yer
        Assert.assertEquals("YANLIŞ URL", expected1,backSite);  //expected--beklenen
        Thread.sleep(2000);


        driver.navigate().forward();
        String forwardSite = driver.getCurrentUrl(); //en son açık olan sayfayı baz alıyor
        String expected2 = "https://www.saucedemo.com/inventory-item.html?id=4";        //https://www.saucedemo.com/inventory.html
        Assert.assertEquals("yanlış URL",expected2,forwardSite);
        Thread.sleep(2000);
        driver.quit();




    }
}
