package PracticeFormAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;

import java.time.Duration;

public class Form extends BaseStaticDriver {


    public static void main(String[] args) throws InterruptedException {
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement createEmail = driver.findElement(By.xpath("(//input[@data-validate='isEmail'])[1]"));
        createEmail.sendKeys("yasinargln243@gmail.com");

        WebElement createClick = driver.findElement(By.cssSelector("i[class='icon-user left']"));
        createClick.click();

        WebElement gender = driver.findElement(By.id("authentication"));
        gender.click();

        WebElement firstName = driver.findElement(By.id("customer_firstname"));
        firstName.sendKeys("yasin");
        WebElement lastName = driver.findElement(By.id("customer_lastname"));
        lastName.sendKeys("asalsa");
        WebElement password = driver.findElement(By.id("passwd"));
        password.sendKeys("123446");
        WebElement days = driver.findElement(By.id("days"));
        days.sendKeys("19");
        WebElement months = driver.findElement(By.id("months"));
        months.sendKeys("May");
        WebElement year = driver.findElement(By.id("years"));
        year.sendKeys("1991");

        WebElement checkBox1 = driver.findElement(By.id("newsletter"));
        checkBox1.click();
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,1000)");

        WebElement firstName1 = driver.findElement(By.cssSelector("input[name='firstname']"));
        firstName1.sendKeys("rukiye");
        WebElement lastName1 = driver.findElement(By.cssSelector("input[name='lastname']"));
        lastName1.sendKeys("ayyıldız");
        WebElement company = driver.findElement(By.cssSelector("input[name='company']"));
        company.sendKeys("E-bebek");
        WebElement adress = driver.findElement(By.cssSelector("input[name='address1']"));
        adress.sendKeys("zümrütevler mahallesi");
        WebElement city = driver.findElement(By.cssSelector("input[name='city']"));
        city.sendKeys("ISTANBUL");

        WebElement state = driver.findElement(By.cssSelector("select[name='id_state']"));
        Select select = new Select(state);
        select.selectByValue("44");

        WebElement zipCode = driver.findElement(By.cssSelector("input[name='postcode']"));
        zipCode.sendKeys("34000");

        WebElement other = driver.findElement(By.cssSelector("textarea[name='other']"));
        other.sendKeys("bu bir test girişimidir.");

        WebElement mobilPhone = driver.findElement(By.cssSelector("input[name='phone_mobile']"));
        mobilPhone.sendKeys("23456745");

        WebElement alias = driver.findElement(By.cssSelector("input[name='alias']"));
        alias.sendKeys("test girişimi sonuçlanmak üzere");

        WebElement regıster = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
        regıster.click();





    }
}
