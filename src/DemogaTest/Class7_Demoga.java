package DemogaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseStaticDriver;

public class Class7_Demoga extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/dynamic-properties");

        WebElement textElement = driver.findElement(By.xpath("//div/p"));
        String text = textElement.getText();
        System.out.println(text);

        /*
        WebElement firsButton = driver.findElement(By.id("enableAfter"));
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.elementToBeClickable(firsButton));
        //beklenen koşullar olana kadar 5 saniye den sonra tıklanabilir.
        firsButton.click();
         */

        WebElement colorButton = driver.findElement(By.id("colorChange"));
        String className = colorButton.getAttribute("class");
        System.out.println("before = " + className);
        //renk değişmeden önceki hali

        WebDriverWait wait = new WebDriverWait(driver,5);               //bu olana kadar yani renk değiştirene kadar 5 saniye bekle
        wait.until(ExpectedConditions.attributeToBe(colorButton,"class","mt-4 text-danger btn btn-primary"));
                                        //beklenen attribute
        className = colorButton.getAttribute("class");
        System.out.println("after =" + className);
        //renk değiştikten sonraki hali

         //bir de ekran da sonradan gözüken elementler var. sayfayı ilk açtığınızda
        //buton gözükmemekte belli bir saniye sonra buton gelmektedir.
        //bunda da ilk başta WebDriverWait tanımlamamız gerekiyor.

        WebDriverWait wait1 = new WebDriverWait(driver,5);
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));
        driver.findElement(By.id("visibleAfter")).click();

    }
}
