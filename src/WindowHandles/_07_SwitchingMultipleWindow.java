package WindowHandles;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class _07_SwitchingMultipleWindow extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().deleteAllCookies();

        driver.get("https://techno.study/");
        JavascriptExecutor js = (JavascriptExecutor) driver;

        List<String> windowHandlesList = new ArrayList<>(); //list oluşturduk
        windowHandlesList.add(driver.getWindowHandle()); //ana sayfanın İD sini arrayList in içine attık.

        WebElement getFreeConsultation = driver.findElement(By.linkText("Get free consultation"));
        getFreeConsultation.click();

        Set<String> windowID = driver.getWindowHandles();
        for (String i : windowID) {  //windowID nin i. elemanı eğer anaSayfaId sine eşit değilse  o i. elemanı windowHandlesList e ekle
            if(!windowHandlesList.contains(i)){
                windowHandlesList.add(i);
            }
        }
        Set<String> windowID1 = driver.getWindowHandles();
        for (String i : windowID1) {
            if(!windowHandlesList.contains(i)){
                windowHandlesList.add(i);
            }
        }
        driver.switchTo().window(windowHandlesList.get(1));
        driver.switchTo().window(windowHandlesList.get(0));
        driver.switchTo().window(windowHandlesList.get(2));
    }
}
