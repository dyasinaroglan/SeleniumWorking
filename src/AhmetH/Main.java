package AhmetH;

import org.openqa.selenium.WebDriver;

public class Main {
    public static WebDriver driver;

    public static void main(String[] args) {
        driver = Driver.getDriver(Browsers.FIREFOX);
        driver.get("https://www.google.com.tr/?hl=tr");

        driver = Driver.getDriver(Browsers.CHROME);
        driver.get("https://www.yahoo.com");

        Driver.quitDriver();
    }
}
