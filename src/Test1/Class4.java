package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\SELENIUM\\chromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();


        driver.findElement(By.id("userName")).sendKeys("asdjasdskdj");

        driver.findElement(By.cssSelector("input.mr-sm-2[placeholder=\"name@example.com\"]")).click();
        driver.findElement(By.cssSelector("input.mr-sm-2[placeholder=\"name@example.com\"]")).sendKeys("yasinargln@gmail.com");
        driver.findElement(By.cssSelector(".form-control[placeholder='Current Address']")).sendKeys("istanbul türkiye");

        driver.findElement(By.cssSelector(".form-control[placeholder='Current Address']")).sendKeys("ASDSDSADMSADMSADSDMSD");
        driver.findElement(By.id("permanentAddress")).sendKeys("AHAHAHAHHAHAHA");
        driver.findElement(By.cssSelector(".form-control[id='permanentAddress']")).sendKeys("BU ŞEKİLDE DE YAPILABİLİR");

        driver.findElement(By.id("submit")).click();


    }
}
