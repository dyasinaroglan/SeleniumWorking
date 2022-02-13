package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\SELENIUM\\chromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();


        driver.findElement(By.id("userName")).sendKeys("asdjasdskdj");

        WebElement nameText = driver.findElement(new By.ByCssSelector("input.mr-sm-2[placeholder=\"name@example.com\"]"));
        nameText.click();
        WebElement emailText = driver.findElement(new By.ByCssSelector("input.mr-sm-2[placeholder=\"name@example.com\"]"));
        emailText.sendKeys("yasinargln@gmail.com");
        WebElement adressText = driver.findElement(new By.ByCssSelector(".form-control[placeholder='Current Address']"));
        adressText.sendKeys("istanbul türkiye");

        WebElement currentAdressText = driver.findElement(new By.ByCssSelector(".form-control[placeholder='Current Address']"));
        currentAdressText.sendKeys("ASDSDSADMSADMSADSDMSD");

        WebElement permanentAdressText = driver.findElement(new By.ByCssSelector(".form-control[id='permanentAddress']"));
        permanentAdressText.sendKeys("BU ŞEKİLDE DE YAPILABİLİR");

        driver.findElement(By.xpath("//div/button[@id='submit']")).click();

        WebElement strnameText = driver.findElement(By.xpath("//div/p[@id='name']"));
        String name = strnameText.getText();
        System.out.println(name);

        WebElement strEmailText = driver.findElement(By.xpath("//div/p[@id='email']"));
        String email = strEmailText.getText();
        System.out.println(email);





    }
}
