package SaucedemoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

import java.util.List;

public class Class11_CssValue extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.saucedemo.com/");
        WebElement loginButton = driver.findElement(By.cssSelector("input[class='submit-button btn_action']"));
        String color = loginButton.getCssValue("color");
        System.out.println("color = " + color);
        String padding = loginButton.getCssValue("padding");
        System.out.println("padding = " + padding);

        WebElement password = driver.findElement(By.id("password"));
        String colors = password.getCssValue("color");
        System.out.println("color = " + colors);
        String paddding = password.getCssValue("padding");
        System.out.println("padding = " + paddding);
        driver.quit();



        /*
        driver.get ("https://form.jotform.com/220466667555061");
        driver.manage().window().maximize();
        WebElement name = driver.findElement(By.cssSelector("input[id='first_3']")); // TODO: 24.02.2022 hiçbir şey göndermeden cssValue sını aldım
        // TODO: 24.02.2022 sendKeys yaptırmadan önce
        System.out.println("click ten önce : " + name.getCssValue("border-color"));
        name.click();

        WebElement surName = driver.findElement(By.id("last_3"));
        surName.click();

        WebElement email= driver.findElement(By.id("input_4"));
        email.click();
        // TODO: 24.02.2022 surname ve email i tıkladıktan sonra renk değişimi oluyor.


        System.out.println("click'ten sonra = " + name.getCssValue("border-color"));

         */

    }
}
