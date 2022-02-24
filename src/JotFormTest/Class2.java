package JotFormTest;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;

import java.util.List;

public class Class2 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://form.jotform.com/220466667555061");

        WebElement firstName = driver.findElement(By.cssSelector("input[id='first_3']"));
        firstName.sendKeys("yasin");
        WebElement lastName = driver.findElement(By.xpath("//input[@name='q3_name[last]']"));
        lastName.sendKeys("aroglan");
        WebElement email = driver.findElement(By.cssSelector("input[id='input_4']"));
        email.sendKeys("yasinargln@gmail.com");
        WebElement adress = driver.findElement(By.cssSelector("input[id='input_5_addr_line1']"));
        adress.sendKeys("maltepe/istanbul");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(1000);

        WebElement city = driver.findElement(By.cssSelector("input[id='input_5_city']"));
        city.sendKeys("istanbul");
        WebElement zip = driver.findElement(By.cssSelector("input[id='input_5_postal']"));
        zip.sendKeys("34000");

        WebElement country = driver.findElement(By.cssSelector("select[id='input_5_country']"));
        country.click();

        Select select = new Select(country);
        select.selectByIndex(32);
        //select.selectByValue("Belgium");
        //select.selectByVisibleText("Belgium");
        List<WebElement> option = select.getOptions();
        String secim = option.get(10).getText();
        System.out.println("seçim = " + secim);

        WebElement date = driver.findElement(By.cssSelector("input[id='lite_mode_10']"));
        date.sendKeys("24-02-2022");

        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(1000);


        WebElement message = driver.findElement(By.cssSelector("textarea[id='input_8']"));
        message.sendKeys("bu bir test mesajıdır.");
        Thread.sleep(1000);
        WebElement submit = driver.findElement(By.cssSelector("button[id='input_2']"));
        submit.click();
        Thread.sleep(1000);
        driver.quit();

    }
}
