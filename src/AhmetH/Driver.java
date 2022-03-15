package AhmetH;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Driver {
    private static WebDriver driver;

    public static WebDriver getDriver(){
        return getDriver(Browsers.CHROME);
    }

    public static WebDriver getDriver(Browsers browser){
        if(driver == null) {
            switch (browser) {
                case FIREFOX:
                    System.setProperty("webdriver.gecko.driver", "C:\\SELENIUM\\Drivers\\geckodriver-v0.30.0-win64 (1)\\geckodriver.exe");
                    driver = new FirefoxDriver();
                    break;
                case EDGE:
                    System.setProperty("webdriver.msedge.driver", "C:\\SELENIUM\\Drivers\\msedgedriver.exe");
                    driver = new EdgeDriver();
                    break;
                case OPERA:
                    System.setProperty("webdriver.opera.driver", "C:\\SELENIUM\\Drivers\\operadriver.exe");
                    driver = new OperaDriver();
                    break;
                case IE:
                    System.setProperty("webdriver.ie.driver", "C:\\SELENIUM\\Drivers\\IEDriverServer.exe");
                    driver = new InternetExplorerDriver();
                    break;
                case CHROME:
                    System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM/chromeDriver\\chromedriver.exe");
                    driver = new ChromeDriver();

            }
        }
        return driver;
    }
    public static void quitDriver(){
        driver.quit();
        // TODO: 10.03.2022 /sağa yatık tek slash bir tane yeter    sola yatık iki slash gerekir.
    }
}
