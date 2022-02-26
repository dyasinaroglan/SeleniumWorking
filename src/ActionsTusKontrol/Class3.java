package ActionsTusKontrol;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

public class Class3 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.google.com/");

        WebElement google = driver.findElement(By.cssSelector("input.gLFyf.gsfi"));
        google.click();
        google.sendKeys("Selenium");
        Thread.sleep(5000);

        Actions builder = new Actions(driver);
        Action action = builder.sendKeys(Keys.SPACE).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build();
        action.perform();

        Thread.sleep(2000);

        action = builder.sendKeys(Keys.ARROW_UP).sendKeys(Keys.ENTER).build();
        action.perform();

        Thread.sleep(2000);
       // driver.quit();
    }
}
