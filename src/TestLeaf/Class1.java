package TestLeaf;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;

public class Class1 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.navigate().to("http://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.cssSelector("input[class='inputLogin']"));
        userName.sendKeys("DemoSalesManager");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("crmsfa");
        Thread.sleep(1000);
        WebElement logın = driver.findElement(By.cssSelector("input[class='decorativeSubmit']"));
        logın.click();

        /*
        driver.navigate().back();
        String backSite = driver.getCurrentUrl();  //şu an bulunduğumuz sayfa--geçerli url
        String expected = "http://leaftaps.com/opentaps/control/main"; //gitmek istediğimiz sayfa--expected--beklenen
        Assert.assertEquals("yanlış url",expected,backSite);
        if (backSite.equals(expected)) {
            System.out.println("doğru sayfadasınız");
        }
        Thread.sleep(1000);
        driver.navigate().forward();
         */
        String title = driver.getTitle();  //başlık doğrulama.tarayıcının en üstündeki başlık.
        System.out.println(title);

       /* String actuelTitle = driver.getTitle();
        String expectedTitle = "Leaftaps - TestLeaf Automation Platform";
        Assert.assertEquals("hatalı başlık",expectedTitle,actuelTitle);
        if (actuelTitle.equals(expectedTitle)) {
            System.out.println("doğru başlık");   //başlık doğrulama
        }
        */
        Thread.sleep(1000);
        WebElement ımgCrm= driver.findElement(By.cssSelector("img[src='/opentaps_images/integratingweb/crm.png']"));
        ımgCrm.click();
        Thread.sleep(1000);
        WebElement createLead = driver.findElement(By.linkText("Create Lead"));
        createLead.click();

        WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
        companyName.sendKeys("TestLeaf");

        WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
        firstName.sendKeys("Babu");

        WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
        lastName.sendKeys("Manickam");
        Thread.sleep(1000);

        WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
        source.click();
        Select select = new Select(source);
        select.selectByVisibleText("Employee");
        Thread.sleep(1000);

        WebElement marketing = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
        marketing.click();
        Select select1 = new Select(marketing);
        select1.selectByValue("9001");
        Thread.sleep(2000);

        WebElement submit = driver.findElement(By.cssSelector("input[name='submitButton']"));
        submit.click();
        Thread.sleep(1000);

        title = driver.getTitle();
        System.out.println(title);
        Thread.sleep(1000);
        driver.quit();


    }
}
