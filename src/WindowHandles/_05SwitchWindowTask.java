package WindowHandles;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.time.Duration;
import java.util.Set;

public class _05SwitchWindowTask extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().deleteAllCookies();

        String anaSayfaId = driver.getWindowHandle();

        driver.get("https://techno.study/");
        Thread.sleep(1000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement getFreeConsultation = driver.findElement(By.linkText("Get a free consultation"));
        js.executeScript("arguments[0].scrollIntoView(false);",getFreeConsultation);
        Thread.sleep(1000);

        getFreeConsultation.click();

        Set<String> windowID = driver.getWindowHandles();
        for (String s : windowID) {
            if(!windowID.equals(anaSayfaId)){
                driver.switchTo().window(s);
            }
        }
        String newUrl = driver.getCurrentUrl();
        System.out.println(newUrl);
        Thread.sleep(1000);
        driver.close();

        driver.switchTo().window(anaSayfaId);

        String anaSayfaUrl = driver.getCurrentUrl();
        System.out.println(anaSayfaUrl);
        Thread.sleep(1000);

        driver.quit();


    }
}
