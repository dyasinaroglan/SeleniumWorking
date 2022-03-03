package FindElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.time.Duration;
import java.util.List;

public class Class1 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://techno.study/");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        List<WebElement> webElementList = driver.findElements(By.tagName("a"));
        for (int i = 0; i < webElementList.size(); i++) {
            System.out.println(webElementList.get(i).getText());
        }


    }
}
