package Scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.time.Duration;
import java.util.Set;

public class _05SwitchTheWindow extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        /*
        https://www.selenium.dev/ bu sayfaya gidiniz
        github linki click yapılacak
        githubda Wiki click yapılacak
         */

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().deleteAllCookies();

        driver.get("https://www.selenium.dev/");

        String anaSayfaID = driver.getWindowHandle(); //sayfa açıldığı anda buranın ID sini kaydet.
        WebElement github = driver.findElement(By.xpath("(//a[@target='_blank'])[9]"));
        github.click();

        Set<String> listID = driver.getWindowHandles();

        for (String  windowID : listID) {
            if(!windowID.equals(anaSayfaID)){
                driver.switchTo().window(windowID);
                System.out.println("geçiş sonrası id : " + windowID);
                System.out.println("getTitle : " + driver.getTitle());

                WebElement wiki = driver.findElement(By.cssSelector("span[data-content='Wiki']"));
                wiki.click();
                Thread.sleep(1000);
                driver.close();
            }
        }
        driver.switchTo().window(anaSayfaID); //close yapıp kapatsakta ana sayfaya geçiş yapmamız lazım.

        WebElement slack = driver.findElement(By.xpath("(//a[@target='_blank'])[10]"));
        slack.click();
        System.out.println("getTitle : " + driver.getTitle());
    }
}
