package SaucedemoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class3_PartialByLinkText {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\SELENIUM\\chromeDriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");

        WebElement password = driver.findElement(By.cssSelector("input[placeholder='Password']"));
        password.sendKeys("secret_sauce");

        WebElement login = driver.findElement(By.id("login-button"));
        login.click();

        WebElement partialLinkTextUrun1 = driver.findElement(By.partialLinkText("Backpack"));
        System.out.println("urun1 partialLinkText = " + partialLinkTextUrun1.getText());
        partialLinkTextUrun1.click();


    }
}
