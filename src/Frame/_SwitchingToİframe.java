package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.time.Duration;

public class _SwitchingToİframe extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().deleteAllCookies();
        driver.get("https://chercher.tech/practice/frames");

        //driver.switchTo().frame("frame1");
        driver.switchTo().frame(0);
        Thread.sleep(1000);
        WebElement topic = driver.findElement(By.tagName("input"));
        topic.sendKeys("hello selenium");

        driver.switchTo().frame(0);

        WebElement checkBox = driver.findElement(By.cssSelector("input[id='a']"));
        System.out.println(checkBox.isSelected());
        checkBox.click();
        System.out.println(checkBox.isSelected());

        //2 tane frame in içine giriyoruz. dolayısıyla 2 tane parentFrame yapmamız lazım.

        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();


        driver.quit();


    }

}
