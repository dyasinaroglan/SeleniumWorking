package JotFormTest;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;

import java.util.List;

public class Class1 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://form.jotform.com/220466667555061");

        WebElement name = driver.findElement(By.cssSelector("input[id='first_3']"));
        name.sendKeys("Yasin");
        WebElement lastName = driver.findElement(By.cssSelector("input[id='last_3']"));
        lastName.sendKeys("argln");
        WebElement email = driver.findElement(By.cssSelector("input[id='input_4']"));
        email.sendKeys("yasinargln264@gmail.com");
        WebElement adress = driver.findElement(By.cssSelector("input[id='input_5_addr_line1']"));
        adress.sendKeys("ALTAYÇEŞME MAHALLESİ");
        WebElement city = driver.findElement(By.cssSelector("input[id='input_5_city']"));
        city.sendKeys("İSTANBUL");
        WebElement zipCode = driver.findElement(By.cssSelector("input[id='input_5_postal']"));
        zipCode.sendKeys("34000");
        WebElement countrySelect = driver.findElement(By.cssSelector("select[class='form-dropdown form-address-country noTranslate']"));
        Thread.sleep(2000);
        countrySelect.click();
        WebElement country = driver.findElement(By.cssSelector("option[value='Greece']"));
        Thread.sleep(2000);
        country.click();

        WebElement bransSelect = driver.findElement(By.cssSelector("select[id='input_6']"));
        Thread.sleep(1000);
        bransSelect.click();

        WebElement brans = driver.findElement(By.cssSelector("option[value='Developer']"));
        Thread.sleep(1000);
        brans.click();

        WebElement date=driver.findElement(By.cssSelector("input[id='lite_mode_10']"));
        date.sendKeys("02-18-2022");

        WebElement messagee = driver.findElement(By.cssSelector("textarea[id='input_8']"));
        messagee.sendKeys("asdsadsadsadsdsasds");
        Thread.sleep(1000);

        WebElement submit = driver.findElement(By.cssSelector("button[id='input_2']"));
        submit.click();

        String actual = driver.findElement(By.xpath("//div/p[@class='thankyou-sub-text ty-text']")).getText();
        String expected = "Your submission has been received.";

        Assert.assertEquals("Test başarılı bir şekilde tamamlanmıştır",expected,actual);

    }
}
