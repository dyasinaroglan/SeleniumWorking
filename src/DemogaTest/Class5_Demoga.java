package DemogaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class5_Demoga {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\chromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();

        WebElement yesRadioBoxLabel = driver.findElement(By.cssSelector("label[class='custom-control-label']"));
        boolean isEnabled = yesRadioBoxLabel.isEnabled(); // boolean ifade döner
        if(isEnabled){
            yesRadioBoxLabel.click();
            System.out.println("checked yes radio button");
        }
        WebElement yesRadioBox = driver.findElement(By.id("yesRadio"));

        boolean isSelected = yesRadioBox.isSelected();
        if(isSelected){
            System.out.println("is radio button selected yes");
        }

        WebElement ımpressiveRadioBox = driver.findElement(By.cssSelector("label[for='impressiveRadio']"));
        boolean isEnabled1 = ımpressiveRadioBox.isEnabled();
        if(isEnabled){
            ımpressiveRadioBox.click();
            System.out.println("check yes ımpressive radio button");
        }
        WebElement output = driver.findElement(By.cssSelector("p[class='mt-3']"));
        System.out.println(output.getText()); //String bir ifade döner

        WebElement noRadioButton = driver.findElement(By.id("noRadio"));
        System.out.println(noRadioButton.isEnabled()); //isEnabled() tıklanıp tıklanamayacağını kontrol ediyor
        //boolean döner
    }
}
