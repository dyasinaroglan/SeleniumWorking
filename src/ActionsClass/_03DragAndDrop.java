package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _03DragAndDrop {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\SELENIUM\\Drivers\\chromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://demo.guru99.com/test/drag_drop.html");
        //ilk önce kaynak yani neyi sürükleyeceğiz bunu bulmamız lazım
        WebElement bank = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
        //daha sonra hedefi yani nereye sürüklüceksek onun locator'unu bulmamız lazım.
        WebElement hedef = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));

        Actions actions = new Actions(driver);

        actions.dragAndDrop(bank,hedef).pause(1000).release().perform();

        driver.quit();
    }
}
