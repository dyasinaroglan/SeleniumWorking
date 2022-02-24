package TestLeaf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;

public class Class2 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://leafground.com/pages/Dropdown.html");
        driver.manage().window().maximize();

        WebElement selectMenu = driver.findElement(By.id("dropdown1"));
        Select select = new Select(selectMenu); //ögeyi açılır bir liste haline getiriyoruz
        //select.selectByVisibleText("Selenium"); //açılan listede seçim yapmamızı--selenium
        Thread.sleep(1000);
        //select.selectByValue("1"); //selectByValue-->indis numarasını yazıyoruz. 0,1...1'de selenıum var
                                                                                 // 1--Selenium
                                                                                 // 2--Appium
                                                                                 // 3--UFT/QTP
                                                                                 // 4--LoadRunner
        select.selectByIndex(0);  //index'ını yazarak int deger olarak
        driver.quit();



    }
}
