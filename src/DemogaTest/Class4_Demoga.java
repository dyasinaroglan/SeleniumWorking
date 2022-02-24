package DemogaTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class4_Demoga {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\chromeDriver\\chromedriver.exe");
        WebDriver driver = new  ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();

        WebElement sportCheckBox = driver.findElement(By.id("hobbies-checkbox-1"));
        sportCheckBox.isEnabled(); //sportCheckBox elementiyle biz etkileşime girebiliyor muyuz? ona tıklayabiliyor muyuz?
        boolean isEnabled = sportCheckBox.isEnabled();
        //isEnabled() methodu boolean dönder
        System.out.println(isEnabled);
    //*******************************************************************************
        WebElement readingCheckBox = driver.findElement(By.id("hobbies-checkbox-2"));
        readingCheckBox.isEnabled();
        boolean isReadingEnable = readingCheckBox.isEnabled();
        System.out.println(isReadingEnable);
    //********************************************************************************
        WebElement musıcCheckBox = driver.findElement(By.id("hobbies-checkbox-3"));
        boolean isMusıcEnable = musıcCheckBox.isEnabled();
        System.out.println(isMusıcEnable);

        WebElement musicCheckBoxLable = driver.findElement(new By.ByCssSelector("label[for='hobbies-checkbox-3']"));
        if(isEnabled) {
            try {
                System.out.println("entered try block");
                musıcCheckBox.click();
            } catch (Exception e) {
                musicCheckBoxLable.click();
                System.out.println("entered catch block");
            }
        }

        boolean isSelected = musıcCheckBox.isSelected();
        System.out.println(isSelected);
    }
}
