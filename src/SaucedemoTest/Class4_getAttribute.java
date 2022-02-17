package SaucedemoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class4_getAttribute {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\SELENIUM\\chromeDriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");

        WebElement password = driver.findElement(By.cssSelector("input[placeholder='Password']"));
        String attribute = password.getAttribute("autocorrect");
        System.out.println(attribute);
        password.sendKeys("secret_sauce");

        WebElement login = driver.findElement(By.id("login-button"));

        String attributeClass = login.getAttribute("class");
        String attributeType = login.getAttribute("type");
        System.out.println(attributeClass);
        System.out.println(attributeType);
        login.click();





    }
}
