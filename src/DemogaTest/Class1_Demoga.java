package DemogaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1_Demoga {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\chromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("x");
        driver.manage().window().maximize();

        driver.findElement(By.id("firstName")).sendKeys("AHMET");
        Thread.sleep(2000);
        driver.findElement(By.id("lastName")).sendKeys("aroglan");
        Thread.sleep(2000);
        driver.findElement(By.id("userEmail")).sendKeys("yasinargln@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("userNumber")).sendKeys("45454548");
        Thread.sleep(2000);
        driver.close();


    }
}
