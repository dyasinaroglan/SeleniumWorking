package WindowHandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.time.Duration;
import java.util.Set;

public class _04SwitchToWindow extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().deleteAllCookies();

        driver.get("https://techno.study/");
        String anaSayfaID = driver.getWindowHandle();
        WebElement getFreeConsultation = driver.findElement(By.linkText("Get free consultation"));
        getFreeConsultation.click();

        Set<String> windowID = driver.getWindowHandles();
        for (String s : windowID) {
            if(!windowID.equals(anaSayfaID)){
                driver.switchTo().window(s);
                Thread.sleep(1000);
            }
        }
        WebElement email = driver.findElement(By.xpath("(//input[@autocomplete='email'])[3]"));
        email.sendKeys("yasinargln264@gmail.com");
        Thread.sleep(1000);
        WebElement name = driver.findElement(By.xpath("(//input[@autocomplete='name'])[3]"));
        name.sendKeys("yasin aroglan");
        Thread.sleep(1000);
        driver.close();

        driver.switchTo().window(anaSayfaID);

        WebElement sdetCourseButton = driver.findElement(By.xpath("(//a[@class='t-menu__link-item'])[1]"));
        sdetCourseButton.click();
        Thread.sleep(1000);
        Set<String> windowId = driver.getWindowHandles();
        for (String i : windowId) {
            if(!windowId.equals(anaSayfaID)){
                driver.switchTo().window(i);
                Thread.sleep(1000);
            }
        }
        driver.switchTo().window(anaSayfaID);
        driver.close();
        Thread.sleep(1000);
        driver.quit();
    }
}
