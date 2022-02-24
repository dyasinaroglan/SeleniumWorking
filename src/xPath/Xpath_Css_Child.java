package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.util.List;

public class Xpath_Css_Child extends BaseStaticDriver {
    public static void main(String[] args) {
        /**
         * Css
         * ul li ---- ul tagname in altında il verir
         * ul>li   ----- ul tagname altında li olanları verir.
         * ul.social li:first-child  ---- listenin ilk childi alır
         * ul.social li:last-child   ----listenin son child ini alır.
         * ul.social li:nth-child(2)   -----listeden indeksle child seçme.
         *
         *
         *
         */

        /**
         * XPath
         * //ul/li   --- ul tagname ın altında  li olanları veriyor.
         * //ul/li[1] ---- listenin ilk child i almak için
         * //ul[@class='social']/li[1]    ->listenin ilk child almak icin
         * //ul[@class='social']/li[last()]   ->listenin son child almak icin
         * //ul[@class='social']/li[2]         ->listede indeksli child secmek icin
         *
         */
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");
        WebElement password = driver.findElement(By.cssSelector("input[placeholder='Password']"));
        password.sendKeys("secret_sauce");
        WebElement login = driver.findElement(By.id("login-button"));
        login.click();

        WebElement twitter = driver.findElement(By.xpath("//ul[@class='social']/li[1]"));
        System.out.println("twitter : " + twitter.getText());

        WebElement facebook = driver.findElement(By.cssSelector("ul.social li:nth-child(2)"));
        System.out.println("facebook : " + facebook.getText());

        List<WebElement> social = driver.findElements(By.cssSelector("ul>li"));
        for (WebElement webElement : social) {
            System.out.print(webElement.getText() + " ");

        }

    }
}
