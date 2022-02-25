package DragAndDrogBy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

public class Class1 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,500)");

        WebElement solButton = driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-state-default ui-corner-all'])[1]"));
        Thread.sleep(1000);
        Actions builder = new Actions(driver);
        Action solButtonSolKaydır = builder.dragAndDropBy(solButton,-80,0).build();
        // TODO: 25.02.2022 negatif deger veriyoruz çünkü sola kaydırıcaz
        solButtonSolKaydır.perform();

        WebElement sagButton =driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-state-default ui-corner-all'])[2]"));
        Thread.sleep(1000);
        Action sagButtonSagKydır = builder.dragAndDropBy(sagButton,120,0).build();
        sagButtonSagKydır.perform();

    }
}
