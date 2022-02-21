package ErailTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Class1 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://erail.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        WebElement from = driver.findElement(By.cssSelector("input[id='txtStationFrom']"));
        from.clear();
        driver.findElement(By.cssSelector("input[id='txtStationFrom']"));
        Thread.sleep(1000);
        from.sendKeys("MAS", Keys.TAB);

        driver.findElement(By.cssSelector("input[id='txtStationTo']")).clear();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[id='txtStationTo']")).sendKeys("SBC", Keys.TAB);

        WebElement date = driver.findElement(By.id("chkSelectDateOnly"));
        date.click();

        List<WebElement> tableRows = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr"));
        System.out.println(tableRows.size());

        List<WebElement> allTrainNumbers = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr/td[1]"));
        for (WebElement allTrainNumber : allTrainNumbers) {
            System.out.println(allTrainNumber.getText());

          driver.quit();
        }
    }
}
