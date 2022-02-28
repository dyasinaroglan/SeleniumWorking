package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class nestedFrame extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://demoqa.com/nestedframes");

        driver.switchTo().frame("frame1"); // şu an parent frame deyim.

        WebElement parentBody = driver.findElement(By.tagName("body"));
        System.out.println(parentBody.getText());

        driver.switchTo().frame(0);
        WebElement childBody = driver.findElement(By.tagName("p"));
        System.out.println(childBody.getText());

        driver.switchTo().parentFrame(); //parent frame e geldik
        driver.switchTo().parentFrame(); // en ana sayfaya çıktık. :)
    }
}
