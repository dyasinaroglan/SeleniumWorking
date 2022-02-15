package PhpTravelTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class8_PhptravelsNet1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\SELENIUM\\chromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.phptravels.net/contact");

        WebElement yourName = driver.findElement(By.cssSelector("input[class='form-control']"));
        yourName.sendKeys("yasin");

        WebElement yourEmail = driver.findElement(By.cssSelector("input[placeholder='Your Email']"));
        yourEmail.sendKeys("yasinargln@gmail.com");

        WebElement messaage = driver.findElement(By.cssSelector("textarea[class='message-control form-control']"));
        messaage.sendKeys("asdsladsdksdfsdlkfjsdklsdfjdlskfds");

        WebElement checkBox = driver.findElement(By.cssSelector("div[style='width: 100%; height: 100%; position: fixed; top: 0px; left: 0px; z-index: 2000000000; background-color: rgb(255, 255, 255); opacity: 0.05;']"));
        Thread.sleep(1000);
        boolean isEnabled = checkBox.isEnabled();
        System.out.println(isEnabled);
        Thread.sleep(2000);
        WebElement checkboxLabel = driver.findElement(By.cssSelector("label[id='recaptcha-anchor-label']"));
        if(isEnabled) {
            try {
                checkBox.click();
            } catch (Exception e) {
                checkboxLabel.click();
                System.out.println("entered check block");
            }
            boolean isSelected = checkBox.isSelected();
            System.out.println(isSelected);
        }
    }
}
