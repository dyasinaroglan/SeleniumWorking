package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BaseStaticDriver {

    public static WebDriver driver;
    public static WebDriverWait wait;
    private static File srcFile;

 static {
     System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\Drivers\\chromeDriver\\chromedriver.exe");
     driver = new ChromeDriver();
     driver.manage().window().maximize();

     wait = new WebDriverWait(driver, Duration.ofSeconds(10));
 }



    public static void sleep(long milis) throws InterruptedException {
        try {
            Thread.sleep(milis);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public static void clickTo(By locator){
        //driver.findElement(locator);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).click();
    }
    public static void sendKeysTo(By locator,String str){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(str);
    }
    public static void takeScreenShot() throws IOException {
        String fileName = "screenShot_" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss"));
        TakesScreenshot scrShot = (TakesScreenshot) driver;
        File scrFile = scrShot.getScreenshotAs(OutputType.FILE); //driver screenShot u burada yapıyor.
        File destFile = new File("screenShots\\" + fileName + ".png"); //yazdırılacak dosya.nereye yazdıralcaksa
        try {
             FileUtils.copyFile(scrFile,destFile);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
