package mentoring;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseStaticDriver;

import java.time.Duration;
import java.util.Random;

public class Class1 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://testsheepnz.github.io/BasicCalculator.html");

        WebElement firstNumber = driver.findElement(By.id("number1Field"));
        WebElement secondNumber = driver.findElement(By.id("number2Field"));

        WebElement select = driver.findElement(By.id("selectOperationDropdown"));
        Select islemler = new Select(select);

        WebElement calculateButton = driver.findElement(By.id("calculateButton"));
        WebElement result = driver.findElement(By.id("numberAnswerField"));
        WebElement clear = driver.findElement(By.id("clearButton"));

        int sayı1 = (int) (Math.random()*100);
        int sayı2 = ((int) (Math.random()*100))+1;

        firstNumber.clear();
        firstNumber.sendKeys(String.valueOf(sayı1));
        secondNumber.clear();
        secondNumber.sendKeys(String.valueOf(sayı2));

        for (int i = 0; i < 5; i++) {
            islemler.selectByIndex(i);
            calculateButton.click();
            switch (i){
                case 0:
                    result.getAttribute("value");
                    Assert.assertEquals(String.valueOf(sayı1+sayı2),result.getAttribute("value"));
                    break;
                case 1:
                    Assert.assertEquals(String.valueOf(sayı1-sayı2),result.getAttribute("value"));
                    break;
                case 2:
                    Assert.assertEquals(String.valueOf(sayı1*sayı2),result.getAttribute("value"));
                    break;
                case 3:
                    Assert.assertEquals(String.valueOf((double) sayı1/(double) sayı2),result.getAttribute("value"));
                    break;
                case 4:
                    Assert.assertEquals(sayı1+String.valueOf(sayı2),result.getAttribute("value"));
                    break;
            }
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(clear));
            clear.click();
        }
        driver.quit();
    }
}
