package isEnabled_isSelected_isDisplayed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class _isDisplayed extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");

        WebElement inputField = driver.findElement(By.cssSelector("#input-example>input"));
        WebElement enableButton = driver.findElement(By.cssSelector("#input-example>button"));

        boolean isInputEnabledBefore = inputField.isEnabled();
        boolean isInputEnableAfter = enableButton.isEnabled();

        enableButton.click();

        boolean isInputEnabledAfter = inputField.isEnabled();
        boolean isInputEnableBefore = enableButton.isEnabled();

        System.out.println(isInputEnabledBefore);
        System.out.println(isInputEnabledAfter);
        System.out.println("***********");
        System.out.println(isInputEnableAfter);
        System.out.println(isInputEnableBefore);

        Thread.sleep(2000);
        driver.quit();


    }
}
