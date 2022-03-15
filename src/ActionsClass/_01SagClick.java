package ActionsClass;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _01SagClick {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\SELENIUM\\Drivers\\chromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://demoqa.com/buttons");

        WebElement rightClickMe = driver.findElement(By.id("rightClickBtn"));

        Actions actions = new Actions(driver);
        actions.contextClick(rightClickMe).perform();

        WebElement rightClickMessage = driver.findElement(By.id("rightClickMessage"));
        System.out.println(rightClickMessage.getText());
        String actual = rightClickMe.getText();
        String expected = "You have done a right click";


        Assert.assertEquals(expected,actual);
        System.out.println("test başarılı bir şekilde tamamlandı");

    }
}
