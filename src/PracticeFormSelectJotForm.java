import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;

public class PracticeFormSelectJotForm extends BaseStaticDriver {

    public static void main(String[] args) throws InterruptedException {
        driver.get("https://form.jotform.com/202468401801346");

        WebElement firstName = driver.findElement(By.id("first_4"));
        firstName.sendKeys("yasin");
        WebElement lastName = driver.findElement(By.id("last_4"));
        lastName.sendKeys("aroglan");

        WebElement bolum = driver.findElement(By.id("input_14"));
        Select select = new Select(bolum);
        Thread.sleep(1000);
        select.selectByVisibleText("Hukuk Fakültesi");

        WebElement basvuru = driver.findElement(By.id("input_20"));
        Select select1 = new Select(basvuru);
        select1.selectByValue("Yaz okulu için");

        WebElement areaCode = driver.findElement(By.id("input_12_area"));
        areaCode.sendKeys("555");

        WebElement phoneNumber = driver.findElement(By.id("input_12_phone"));
        phoneNumber.sendKeys("4556721");

        WebElement email = driver.findElement(By.id("input_5"));
        email.sendKeys("yasinargln@gmail.com");

        WebElement street = driver.findElement(By.id("input_3_addr_line1"));
        street.sendKeys("FINDIKLI MAHALLESİ");

        WebElement street2 = driver.findElement(By.id("input_3_addr_line2"));
        street2.sendKeys("ZÜMRÜTEVLER MAHALLESİ");

        WebElement city = driver.findElement(By.id("input_3_city"));
        city.sendKeys("İSTANBUL");

        WebElement zipCode = driver.findElement(By.id("input_3_postal"));
        zipCode.sendKeys("34000");

        WebElement country = driver.findElement(By.id("input_3_country"));
        Select select2 = new Select(country);
        select2.selectByValue("Turkey");

        WebElement bursDuzey = driver.findElement(By.id("input_11"));
        Select select3 = new Select(bursDuzey);
        select3.selectByValue("%50");

        WebElement message = driver.findElement(By.id("input_8"));
        message.sendKeys("bu bir test girişimidir...");

        Thread.sleep(1000);
        WebElement dogumGun = driver.findElement(By.xpath("(//select[@class='form-dropdown'])[2]"));
        Select select4 = new Select(dogumGun);
        Thread.sleep(1000);
        select4.selectByValue("19");

        WebElement neredenDuydum = driver.findElement(By.id("input_21"));
        Select select5 = new Select(neredenDuydum);

        select5.selectByValue("Diğer");

        WebElement kabul = driver.findElement(By.id("input_22_0"));
        Thread.sleep(1000);
        kabul.click();

        WebElement submit = driver.findElement(By.id("input_2"));
        submit.click();


    }
}
