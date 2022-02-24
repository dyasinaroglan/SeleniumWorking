package DemogaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class6_Demoga {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\SELENIUM\\chromeDriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/buttons");

        WebElement doubleClickMe = driver.findElement(By.id("doubleClickBtn"));
        Actions actions = new Actions(driver); //Actions class ı WebDriver sınıfından bir değişken almalı.
        actions.doubleClick(doubleClickMe).perform();
        //doubleClickMe---çift tıklayacağımız buton

        WebElement message = driver.findElement(By.id("doubleClickMessage"));
        String textMessage =message.getText();
        System.out.println(textMessage);

        WebElement rightClickMe = driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(rightClickMe).perform();
                //contextClick() iki tane methodu var parametreli ve parametresiz.
                //biz WebDriver yazan parametreli olanı seçiyoruz. ve içine WebDriver değişkenini yani rightClickMe yi ekliyoruz.

        WebElement rightClickMessage = driver.findElement(By.id("rightClickMessage"));
        String message2 = rightClickMessage.getText();
        System.out.println(message2);

        WebElement clickMe = driver.findElement(By.xpath("//div/button[starts-with(text(), 'Click Me')]"));
        clickMe.click();
        driver.quit();
    }
}
