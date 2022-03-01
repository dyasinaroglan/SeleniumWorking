package PracticeFormJotForm;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.util.List;

public class Class1 extends BaseStaticDriver {

    public static void main(String[] args) throws InterruptedException {

        driver.get("https://form.jotform.com/202426526543351");
        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement firstName = driver.findElement(By.id("first_3"));
        firstName.sendKeys("yasin");
        WebElement lastName = driver.findElement(By.id("last_3"));
        lastName.sendKeys("aroglan");
        WebElement areaCode = driver.findElement(By.id("input_8_area"));
        areaCode.sendKeys("555");
        WebElement phoneNumber = driver.findElement(By.id("input_8_phone"));
        phoneNumber.sendKeys("2647890");
        WebElement email = driver.findElement(By.id("input_9"));
        email.sendKeys("yasinargln@gmail.com");

        List<WebElement> neZamanCalısma = driver.findElements(By.xpath("//input[@type='radio']"));
        for (WebElement i : neZamanCalısma) {
            i.click();
            Thread.sleep(1000);
            }
        WebElement other = driver.findElement(By.id("input_21"));
        other.sendKeys("5-9");


        List<WebElement> ılgıAlanı = driver.findElements(By.xpath("//label[contains(@id,'label_input_14_')]"));
        for (int i = 0; i < ılgıAlanı.size() ; i+=2) {
            ılgıAlanı.get(i).click();
            System.out.println(ılgıAlanı.get(i).getText()+" ");
            Thread.sleep(1000);

        }
        List<WebElement> yeteneks = driver.findElements(By.xpath("//label[contains(@id,'label_input_15_')]"));
        for (WebElement i : yeteneks) {
            yeteneks.get(randomSayı(yeteneks.size())).click();
            System.out.println("özel yeteneğim = " + yeteneks.get(randomSayı(yeteneks.size())).getText());
            Thread.sleep(1000);
        }
        WebElement messagee = driver.findElement(By.xpath("//textarea[@id='input_16']"));
        messagee.sendKeys("Geri dönüşünüzü sabırsızlıkla bekliyorum.");
        WebElement formGonder = driver.findElement(By.id("input_2"));
        formGonder.click();

        WebElement result = driver.findElement(By.xpath("(//p[@style='text-align:center;'])[2]"));
        String expected = "Your submission has been received.";
        String actual = driver.findElement(By.xpath("(//p[@style='text-align:center;'])[2]")).getText();

        Assert.assertEquals("YANLIŞ MESAJ",expected,actual);
        if(expected.equals(actual)){
            System.out.println("mükemmel bir test sonucu...TEBRİKELR");
        }
        driver.quit();
    }

    public static int randomSayı (int size){
        return (int)(Math.random()*size);
    }

}


