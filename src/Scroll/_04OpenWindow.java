package Scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class _04OpenWindow extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().deleteAllCookies();

        driver.get("https://www.selenium.dev/");
        String anaSayfaID = driver.getWindowHandle();

        List<WebElement> targetLinks = driver.findElements(By.cssSelector("a[target='_blank']"));

        for (WebElement e: targetLinks) {
            e.click();
        }
        driver.getWindowHandles();
        Set<String> getWindowHandles = driver.getWindowHandles();
        for (String id : getWindowHandles) {
            System.out.println("id : " + id);
        }




    }
}
