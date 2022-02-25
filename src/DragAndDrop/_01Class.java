package DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

public class _01Class extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demo.guru99.com/test/drag_drop.html");

        WebElement bank = driver.findElement(By.xpath("//a[text()=' BANK ']"));
        WebElement hedef = driver.findElement(By.id("bank"));

        Actions builder = new Actions(driver);
        Action tasıma = builder.clickAndHold(bank).moveToElement(hedef).release().build();
        tasıma.perform();
        //2.yol
        /*
        Action tasıma1 = builder.dragAndDrop(bank,hedef).build();
        tasıma1.perform();

         */
    }
}
