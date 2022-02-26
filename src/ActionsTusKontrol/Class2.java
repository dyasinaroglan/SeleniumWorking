package ActionsTusKontrol;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

public class Class2 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://google.com");
        WebElement search = driver.findElement(By.name("q"));
        Thread.sleep(1000);
      //  search.sendKeys("webDriver" + Keys.ENTER);
        Actions builder = new Actions(driver);
        Thread.sleep(2000);
       /* Action action = builder.moveToElement(search).keyDown(Keys.CONTROL).sendKeys("selenium").build();
        action.perform();

        */


        /*Action keydown = builder.moveToElement(search).keyDown(Keys.CONTROL).sendKeys("a").build();
         keydown.perform();

         */
        Thread.sleep(2000);
        Action keyDown = builder.moveToElement(search).keyDown(Keys.SHIFT).sendKeys("qwerty").keyUp(Keys.SHIFT)
                .sendKeys("qwerty").build();             //BÜYÜTTÜ        ---  YAZDIRDI   ----   KÜÇÜLTTÜ  --- YAZDIRDI
        keyDown.perform();
        driver.quit();


    }
}
