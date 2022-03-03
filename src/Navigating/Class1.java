package Navigating;

import utils.BaseStaticDriver;

import java.time.Duration;

public class Class1 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.google.com/");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        Thread.sleep(2000);

        driver.get("https://www.facebook.com/");
        System.out.println("url : " + driver.getCurrentUrl());
        System.out.println("title : " + driver.getTitle());
        //System.out.println("pageSource : " + driver.getPageSource());

        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);

        driver.navigate().forward();
        Thread.sleep(1000);
        driver.navigate().refresh();
        driver.navigate().to("https://www.google.com/");
        Thread.sleep(1000);

        driver.quit();


    }
}
