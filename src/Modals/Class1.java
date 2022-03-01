package Modals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class Class1 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://demoqa.com/modal-dialogs");
        WebElement smallModal = driver.findElement(By.id("showSmallModal"));
        smallModal.click();

        WebElement modalText = driver.findElement(By.cssSelector("div[class='modal-body']"));
        System.out.println(modalText.getText());

        WebElement smallClose = driver.findElement(By.id("closeSmallModal"));
        smallClose.click();

    }
}
