package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;

import java.util.List;

public class Class1 extends BaseStaticDriver {

    public static void main(String[] args) throws InterruptedException {

        driver.get("https://www.etsy.com/");
        Thread.sleep(2000);


        WebElement languages = driver.findElement(By.xpath("//span[@class='wt-display-inline-block wt-vertical-align-middle']"));
        languages.click();
        Thread.sleep(1000);
        WebElement region = driver.findElement(By.id("locale-overlay-select-region_code"));
        region.click();

        Select select = new Select(region);
        select.selectByVisibleText("Turkey");
        Thread.sleep(1000);
        WebElement language = driver.findElement(By.id("locale-overlay-select-language_code"));
        language.click();

        Select select1 = new Select(region);
        select1.selectByIndex(1);
        Thread.sleep(1000);

        WebElement money = driver.findElement(By.id("locale-overlay-select-currency_code"));
        money.click();

        Select select2 = new Select(money);
        select2.selectByValue("TRY");
        Thread.sleep(1000);

        WebElement save = driver.findElement(By.id("locale-overlay-save"));
        save.click();


        Actions action = new Actions(driver);

        List<WebElement> menu = driver.findElements(By.xpath("//ul[@role='menubar']//li"));

        for (WebElement menuBar:menu) {
            action.moveToElement(menuBar).perform();
            Thread.sleep(1000);
        }

    }
}
