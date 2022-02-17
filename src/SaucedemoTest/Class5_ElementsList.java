package SaucedemoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Class5_ElementsList {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\chromeDriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");

        WebElement password = driver.findElement(By.cssSelector("input[placeholder='Password']"));
        password.sendKeys("secret_sauce");

        WebElement login = driver.findElement(By.id("login-button"));
        login.click();

        List<WebElement> urunListesi = driver.findElements(By.className("inventory_item_name"));
        for (WebElement webElement : urunListesi) {
            webElement.getText();
        }
        List<WebElement> addTocard = driver.findElements(By.cssSelector("button[class='btn btn_primary btn_small btn_inventory']"));
        for (WebElement webElement : addTocard) {
            webElement.click();
        }
    }
}
