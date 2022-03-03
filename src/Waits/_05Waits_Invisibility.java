package Waits;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseStaticDriver;

import java.time.Duration;

public class _05Waits_Invisibility extends BaseStaticDriver {
    public static void main(String[] args) {

        /*
        https://the-internet.herokuapp.com/dynamic_controls  siteye gidiniz
        Remove buttonuna basiniz
        wait loading kaybolana kadar bekletin
        Sonrada "It's back! " bu yazini görünürlügünü onaylayin
         */

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement remove = driver.findElement(By.cssSelector("button[onclick='swapCheckbox()']"));
        remove.click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        boolean loading = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("(//div[@style='display: none;'])[1]")));
        // TODO: 3.03.2022 invisibility boolean değişkenine alınabiliyor.
        System.out.println("loading : " + loading);

        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("p#message")));
        // TODO: 3.03.2022 visibility webElement değişkenine alınabiliyor. 
        System.out.println("mesaj : " + message.isEnabled());
    }
}
