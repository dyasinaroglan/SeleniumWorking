package SaucedemoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class Class6_TryCatch extends BaseStaticDriver {
    public static void main(String[] args) {
        login("standard_user","secret_sauce");
        try {
            WebElement urun = driver.findElement(By.linkText("Sauce Labs Backpac")); //linkText ile yaptım--direkt bu isimle 2 tane ççıktı
            //fakat ben metin istediğim için ve diğeri de metin olmadığı için sıkıntı yaşamadım.
            //bilerek hataya sokmak için Backpack yazan kelimenin son harfini sildim
            urun.click();
        }catch (Exception e){
            System.out.println("eleman bulunamadı " + e.getMessage());
        }
    }
    public static void login(String user,String pass){
        driver.get("https://www.saucedemo.com/");
        WebElement userName = driver.findElement(By.cssSelector("input[id='user-name']"));
        userName.sendKeys("standard_user");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        WebElement login = driver.findElement(By.cssSelector("input[id='login-button']"));
        login.click();
    }
}
