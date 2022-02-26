package ActionsTusKontrol;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

public class Class1 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://demoqa.com/auto-complete");
        WebElement textControl = driver.findElement(By.xpath("//div[@class='auto-complete__value-container css-1hwfws3']"));
        Actions builder = new Actions(driver);

        Action action = builder.moveToElement(textControl).click().keyDown(Keys.SHIFT).sendKeys("k")
                .keyUp(Keys.SHIFT).sendKeys("raft").build();
        action.perform();
        // TODO: 26.02.2022 tuşa basılı kalmasını istediğimzde keyDown kullanıyoruz.

        driver.quit();
    }
}
