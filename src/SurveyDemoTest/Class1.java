package SurveyDemoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class Class1 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("https://formsmarts.com/form/yu?mode=h5");
        Thread.sleep(1000);
        WebElement bussiness = driver.findElement(By.cssSelector("input[name='u_Dsr_4586']"));
        bussiness.click();
        /**
         *https://formsmarts.com/form/yu?mode=h5  siteye acin
         *      Business  secelim
         *      Online Advertising - secelim
         *      Every Day    - secelim
         *      Average        - secelim
         *      I'm using XYZ for about a week  - secelim
         *      Message kismina bir yazi gönderelim
         *
         */
        driver.get("https://formsmarts.com/form/yu?mode=h5");
        Thread.sleep(1000);
        WebElement bussiness1 = driver.findElement(By.cssSelector("input[name='u_Dsr_4586']"));
        bussiness1.click();
        Thread.sleep(1000);
        WebElement select = driver.findElement(By.cssSelector("select[name='u_Dsr_4588']"));
        select.click();
        Thread.sleep(1000);
        WebElement onlineAdvertising = driver.findElement(By.cssSelector("option[value='Online Advertising']"));
        onlineAdvertising.click();

        WebElement everyDay = driver.findElement(By.cssSelector("input[name='u_Dsr_89585']"));
        everyDay.click();

        WebElement avarage = driver.findElement(By.cssSelector("input[value='Average']"));
        avarage.click();

        WebElement select1 = driver.findElement(By.cssSelector("select[name='u_Dsr_4597']"));
        select1.click();

        WebElement XYZweek = driver.findElement(By.cssSelector("option[value=\"I'm using XYZ for about a week\"]"));
        XYZweek.click();

        WebElement message = driver.findElement(By.cssSelector("textarea[id='u_Dsr_89597']"));
        message.sendKeys("bu bir selenium testidir.");

        Thread.sleep(2000);
        driver.quit();  Thread.sleep(1000);
        WebElement select2 = driver.findElement(By.cssSelector("select[name='u_Dsr_4588']"));
        select2.click();
        Thread.sleep(1000);
        WebElement onlineAdvertising1 = driver.findElement(By.cssSelector("option[value='Online Advertising']"));
        onlineAdvertising1.click();

        WebElement everyDay1 = driver.findElement(By.cssSelector("input[name='u_Dsr_89585']"));
        everyDay1.click();

        WebElement avarage1 = driver.findElement(By.cssSelector("input[value='Average']"));
        avarage1.click();

        WebElement select5 = driver.findElement(By.cssSelector("select[name='u_Dsr_4597']"));
        select5.click();

        WebElement XYZweek1 = driver.findElement(By.cssSelector("option[value=\"I'm using XYZ for about a week\"]"));
        XYZweek1.click();

        WebElement message1 = driver.findElement(By.cssSelector("textarea[id='u_Dsr_89597']"));
        message1.sendKeys("bu bir selenium testidir.");

        Thread.sleep(2000);
        driver.quit();

    }
}
