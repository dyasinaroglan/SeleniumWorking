package ActionsTusKontrol;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

public class Class4 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://demoqa.com/auto-complete");

        WebElement textBox = driver.findElement(By.xpath("//div[@class='auto-complete__value-container auto-complete__value-container--is-multi css-1hwfws3']"));
        textBox.click();
        Thread.sleep(1000);

        Actions builder = new Actions(driver);
        Action action = builder.moveToElement(textBox).click().sendKeys("a").build();
        action.perform();
        Thread.sleep(3000);
        action = builder.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ENTER)
                .build();
        action.perform();

        driver.quit();
    }
}
