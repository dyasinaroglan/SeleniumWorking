package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Class5 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\SELENIUM\\chromeDriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/checkbox");
        driver.manage().window().maximize();

        String homeCheckBoxCssValue = "label[for='tree-node-home'] span.rct-checkbox svg";

        WebElement homeCheckBox = driver.findElement(new By.ByCssSelector(homeCheckBoxCssValue));
        homeCheckBox.click();  //checkBox un içine tıkladı.

        //checkBox un tıklı olup olmadığını nasıl anlarım?

        homeCheckBox = driver.findElement(new By.ByCssSelector("label[for='tree-node-home'] span.rct-checkbox svg"));
        //checkBox tıklı mı değil mi? yani check edilmiş mi edilmemiş mi?
        String homeCheckBoxClassName = homeCheckBox.getAttribute("class");
                                            //class= rct-icon rct-icon-check
        if(homeCheckBoxClassName.equals("rct-icon rct-icon-check")){     //equals--iki string ifadeyi karşılaştırır.
            System.out.println("checkbox is checked!");
        }else {
            System.out.println("checkbox is unchecked");  //checkbox un check edilecek bir özelliği var mı?
            //varsa is checked
        }


    }

}
