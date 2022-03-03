package isEnabled_isSelected_isDisplayed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

import java.time.Duration;
import java.util.List;

public class Form_jotForm extends BaseStaticDriver {

    public static void main(String[] args) throws InterruptedException {
        driver.get("https://form.jotform.com/202422515857050");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebElement logın = driver.findElement(By.cssSelector("a[data-name='login']"));
        logın.click();

        WebElement email = driver.findElement(By.cssSelector("input[id='username']"));
        email.sendKeys("yasinargln@gmail.com");
        WebElement parola = driver.findElement(By.cssSelector("input[id='password']"));
        parola.sendKeys("264264");
        WebElement giris = driver.findElement(By.cssSelector("button[id='signinButton']"));
        giris.click();


        List<WebElement> menuBar = driver.findElements(By.xpath("//a[contains(@class,'jfHeader-menuListLink jfHeader-dynamicLink js')]"));
        for (WebElement i : menuBar) {
            Actions builder = new Actions(driver);
            Action action = builder.moveToElement(i).build();
            action.perform();
            Thread.sleep(1000);
        }
        Thread.sleep(1000);
        driver.quit();


    }
}
