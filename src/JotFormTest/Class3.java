package JotFormTest;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.util.ArrayList;
import java.util.List;

public class Class3 extends BaseStaticDriver {

    public static void main(String[] args) throws InterruptedException {

        driver.get("https://form.jotform.com/220525974190356");

        WebElement firstName = driver.findElement(By.id("first_3"));
        firstName.sendKeys("yaSDASD");

        WebElement lastName = driver.findElement(By.id("last_3"));
        lastName.sendKeys("arSDSlan");

        WebElement areaCode = driver.findElement(By.xpath("//input[@id='input_13_area']"));
        areaCode.sendKeys("276");

        WebElement phoneNumber = driver.findElement(By.xpath("//input[starts-with(@id,'input_13_phone')]"));
        phoneNumber.sendKeys("54548762182");

        WebElement email = driver.findElement(By.xpath("//input[contains(@id,'input_4')]"));
        email.sendKeys("yasinargln@gmail.com");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(1000);

        WebElement devOps = driver.findElement(By.xpath("//label[@id='label_input_11_0']"));

        Thread.sleep(1000);
        devOps.click();

        WebElement developer = driver.findElement(By.id("label_input_11_2"));
        boolean isSelect = developer.isSelected();
        System.out.println(isSelect); //tıklanmaddan önce false

        boolean enabled = developer.isEnabled();
        System.out.println(enabled);

        boolean disPlayed = developer.isDisplayed();
        System.out.println(disPlayed);
        Thread.sleep(1000);
        developer.click();

        WebElement checkDeveloper = driver.findElement(By.id("label_input_11_2"));
        Thread.sleep(1000);
        checkDeveloper.click();
        boolean select = developer.isSelected();
        System.out.println(select);
        System.out.println("***********");

        WebElement other = driver.findElement(By.id("label_other_11"));
        other.click();
        boolean enabled1 = other.isEnabled();
        System.out.println(enabled1);
        boolean disPlayed1 = other.isDisplayed();
        System.out.println(disPlayed1);
        boolean selectted = other.isSelected();
        System.out.println(selectted);
        Thread.sleep(1000);
        WebElement message = driver.findElement(By.id("input_11"));
        message.sendKeys("bu bir testtir.");
        Thread.sleep(1000);
        WebElement kacSaat = driver.findElement(By.id("label_input_14_2"));
        kacSaat.click();
        Thread.sleep(3000);

        List<WebElement> yetenek = driver.findElements(By.id("label[for^='input_15_']"));
        for (WebElement i : yetenek) {
            i.click();
        }
        Thread.sleep(1000);
        WebElement other2=driver.findElement(By.id("label_other_15"));
        other2.click();

        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,400)");
        Thread.sleep(1000);


        WebElement zorunluMessage = driver.findElement(By.id("input_8"));
        zorunluMessage.sendKeys("bu bir webDriver testidir...");
        Thread.sleep(1000);
        WebElement gönder = driver.findElement(By.id("input_2"));
        gönder.click();

        String expected = driver.findElement(By.xpath("//p[@class='thankyou-sub-text ty-text']")).getText();
        String actual = "Your submission has been received.";
        Assert.assertEquals("YANLIŞ MESAJ",expected,actual);
        if(expected.equals(actual)){
            System.out.println("mesaj doğrudur");
        }
    }
}
