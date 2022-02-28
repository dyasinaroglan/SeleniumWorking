package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.util.List;

public class Class1 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("https://demoqa.com/frames");

        driver.switchTo().frame("frame1");

        WebElement heading = driver.findElement(By.id("sampleHeading"));
        String page = heading.getText();
        System.out.println(page);

        driver.switchTo().parentFrame(); // artık bir üst frame ana fram e geçtik.

        List<WebElement> elementList = driver.findElements(By.xpath("//div[@id='frame1Wrapper']"));
        String paragraf = elementList.get(0).getText();
        System.out.println(paragraf);

        driver.switchTo().frame("frame2");
        //parentFrame den diğer frame egeçtim. child frame den başka bir child frame e geçilmez.
        //önce parentFrame e geçmek lazım.
    }
}
