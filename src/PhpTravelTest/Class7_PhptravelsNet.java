package PhpTravelTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class7_PhptravelsNet {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\SELENIUM\\chromeDriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.phptravels.net/login");
        driver.manage().window().maximize();

        WebElement email = driver.findElement(By.xpath("//input[@class='form-control']"));
        email.sendKeys("yasin aroglan");

        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password'] "));
        password.sendKeys("Yasin.264264");

        WebElement rememberReset = driver.findElement(By.xpath("//label[@for='rememberchb']"));
        if(rememberReset.isEnabled()){
            try {
                rememberReset.click();
            }catch (Exception e){
                rememberReset.click();
            }
        }
        boolean isRememberReset = rememberReset.isEnabled();
        System.out.println(isRememberReset);

        WebElement logın = driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg btn-block effect ladda-button waves-effect']"));
        boolean isLogın = logın.isEnabled();
        System.out.println(isLogın);

        WebElement phone = driver.findElement(By.xpath("//div/i[@class='la la-phone']"));
        phone.isEnabled();
        WebElement phone1 = driver.findElement(By.cssSelector("div.info-icon.flex-shrink-0.bg-rgb.text-color-2"));
        Thread.sleep(3000);
        phone1.click();










    }
}
