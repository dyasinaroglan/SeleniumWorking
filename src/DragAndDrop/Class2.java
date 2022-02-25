package DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

public class Class2 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        WebElement oslo = driver.findElement(By.id("box1"));
        WebElement norvec = driver.findElement(By.id("box101"));

        System.out.println("oslo taşınmadan önce : " + oslo.getCssValue("background-color"));

        Actions builder = new Actions(driver);
        Action tasıma1 = builder.clickAndHold(oslo).moveToElement(norvec).release().build();
        tasıma1.perform();

        System.out.println("oslo taşındıktan sonra : " + oslo.getCssValue("background-color"));
        //2.yol
        System.out.println("*******************");

        /*
        Action tasıma2 = builder.dragAndDrop(oslo,norvec).build();
        tasıma2.perform();

         */

        WebElement rome = driver.findElement(By.id("box6"));
        WebElement ıtaly = driver.findElement(By.id("box106"));
        System.out.println("rome taşınmadan önce : " + rome.getCssValue("background-color"));

        Action tasımaItaly = builder.clickAndHold(rome).moveToElement(ıtaly).release().build();
        tasımaItaly.perform();
        System.out.println("rome taşındıktan sonra : " + rome.getCssValue("background-color"));
        /*
        2.yol
        Action tasıma2Italy = builder.dragAndDrop(rome,ıtaly).build();
        tasıma2Italy.perform();

         */
        System.out.println("********************");

        WebElement madrid = driver.findElement(By.id("box7"));
        WebElement spain = driver.findElement(By.id("box107"));
        System.out.println("madrid taşımadan önce : " + madrid.getCssValue("background-color"));
        Action tasımaSpain = builder.clickAndHold(madrid).moveToElement(spain).release().build();
        tasımaSpain.perform();
        System.out.println("madrid taşındıktan sonra : " + madrid.getCssValue("background-color"));
        /*
        2.yol
        Action tasıma2Madrid = builder.dragAndDrop(madrid,spain).build();
        tasıma2Madrid.perform();
         */
        WebElement stockholm = driver.findElement(By.id("box2"));
        WebElement sweden = driver.findElement(By.id("box102"));

        Action tasımaSweden = builder.dragAndDrop(stockholm,sweden).build();
        tasımaSweden.perform();

        WebElement washington = driver.findElement(By.id("box3"));
        WebElement abd = driver.findElement(By.id("box103"));

        Action tasımaAbd = builder.clickAndHold(washington).moveToElement(abd).release().build();
        tasımaAbd.perform();

        WebElement copenhagen = driver.findElement(By.id("box4"));
        WebElement denmark = driver.findElement(By.id("box104"));

        Action tasımaDenmark = builder.dragAndDrop(copenhagen,denmark).build();
        tasımaDenmark.perform();

        WebElement seoul = driver.findElement(By.id("box5"));
        WebElement kore = driver.findElement(By.id("box105"));
        Action tasımaKore = builder.dragAndDrop(seoul,kore).build();
        tasımaKore.perform();

        Thread.sleep(2000);
        driver.quit();

    }
}
