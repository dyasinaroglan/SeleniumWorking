package YahooTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2_Yahoo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\chromeDriver\\chromedriver.exe");
        //setProperty-->hang, aracın test edileceğini belirlemek.sistem özelliklerini tanımlamak
        WebDriver driver = new ChromeDriver();  //driver oluşturuyoruz
        driver.get("https://login.yahoo.com/");
        driver.manage().window().maximize(); //driveri yönet pencereyi aç ve maksimize et
        Thread.sleep(2000);
        Thread.sleep(2000);
        driver.findElement(By.id("createacc")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("usernamereg-firstName")).sendKeys("ahmetg");
        Thread.sleep(2000);
        driver.findElement(By.id("usernamereg-lastName")).sendKeys("12232.ff");
        Thread.sleep(2000);
        driver.findElement(By.id("usernamereg-yid")).sendKeys("yasinargln@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("usernamereg-phone")).sendKeys("5445437834");
        driver.quit();




    }
}
