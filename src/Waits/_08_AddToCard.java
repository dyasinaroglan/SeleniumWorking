package Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseStaticDriver;

import java.time.Duration;

public class _08_AddToCard extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().deleteAllCookies();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));

        driver.get("https://shopdemo.e-junkie.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement eBook = driver.findElement(By.xpath("(//button[@class='view_product'])[2]"));
        eBook.click();

        WebElement iframe = driver.findElement(By.xpath("//iframe[@class='EJIframeV3 EJOverlayV3']"));
        wait.until(ExpectedConditions.visibilityOf(iframe));
        driver.switchTo().frame(iframe);

        WebElement sepetNo = driver.findElement(By.xpath("(//span[@class='Cart-Items-Nos'])[2]"));
        if(sepetNo.getText().equals("1")){
            System.out.println("sepette bir öge var!");
        }else
            System.out.println("sepetteki öge sayısı : " + sepetNo.getText());
        System.out.println("test başarısız.");

        System.out.println("************");

        WebElement remove = driver.findElement(By.cssSelector("button[class='Product-Remove']"));
        remove.click();

        driver.switchTo().defaultContent(); // TODO: 7.03.2022 birden fazla iframe olduğunda bizi ana sayfaya götürür. kontrol ana sayfaya geçer.
        WebElement cartItemNo = driver.findElement(By.xpath("(//span[@id='cart_item_nos'])[2]"));
        wait.until(ExpectedConditions.visibilityOf(cartItemNo));
        Thread.sleep(1000);
        if (cartItemNo.getText().equals("0")) {
            System.out.println("You have 0 item in your cart!");
            System.out.println("Success");
        } else {
            System.out.println("Fail!");
        }
        Thread.sleep(1000);
        driver.quit();



    }
}
