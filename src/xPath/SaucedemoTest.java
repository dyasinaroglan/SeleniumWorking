package xPath;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.util.ArrayList;
import java.util.List;

public class SaucedemoTest extends BaseStaticDriver {
    public static void main(String[] args) {

        /**
         * https://www.saucedemo.com/  siteye git
         * Bütün ürünleri sepete ekle
         * Sepete git
         * Sepetteki ürünleri önceki ürünlerle kiyasla
         * dogruysa Checkout butonuna tikla
         * Cikan formu doldur
         * Continue butonuna tikla
         *Total fiyati kiyasla
         * Finish butonuna tikla
         * "THANK YOU FOR YOUR ORDER" yazisinin sayfada oldugunu onayla
         * Back Home basip bulundugu sayfanin url kontrol et "https://www.saucedemo.com/inventory.html"
         */

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");
        WebElement password = driver.findElement(By.cssSelector("input[placeholder='Password']"));
        password.sendKeys("secret_sauce");
        WebElement login = driver.findElement(By.id("login-button"));
        login.click();

        List<WebElement> ısımList = driver.findElements(By.xpath("//div[@class='inventory_item_name']")); //6 tane var. ürün ismi
        // TODO: 22.02.2022  WebElement için liste oluşturduk 
        ArrayList<String> urunIsımLıstesi = new ArrayList<>();
        // TODO: 22.02.2022 arrayList oluşturmamızın sebebi ürünlerin isimlerini ve fiyatlarının getText lerini almak için
        for (WebElement s : ısımList) {
            urunIsımLıstesi.add(s.getText());
        }
        System.out.println(urunIsımLıstesi);
        List<WebElement> priceList = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
        ArrayList<String> urunFıyatListesi = new ArrayList<>();
        for (WebElement p : priceList) {
            urunFıyatListesi.add(p.getText());
        }
        System.out.println(urunFıyatListesi);

        List<WebElement> addToCart = driver.findElements(By.xpath("//button[text()='Add to cart']"));
        for (WebElement webElement : addToCart) {
            webElement.click();
        }
        WebElement sepet = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        sepet.click();

        List<WebElement> isimListesiKrsılastırma = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
        List<String> urunIsımListesi1 = elementToString(isimListesiKrsılastırma);

        List<WebElement> fiyatListesiKarsılastırma = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
        List<String> urunFıyatListesi1 = elementToString(fiyatListesiKarsılastırma);

        if(urunIsımListesi1.size()==urunIsımLıstesi.size()){
            stringListKontrol(urunIsımListesi1,urunIsımLıstesi);
        }else
            System.out.println("listenin uzunluğu eşit değil");
        System.out.println("*************************");

        if(urunFıyatListesi1.size()==urunFıyatListesi.size()){
            stringListKontrol(urunFıyatListesi1,urunFıyatListesi);
        }else {
            System.out.println("listenin uzunluğu eşit değil");
        }
        WebElement checkOut = driver.findElement(By.xpath("//button[@id='checkout']"));
        checkOut.click();
        WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        firstName.sendKeys("Kraft");
        WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        lastName.sendKeys("Techno");
        WebElement zip = driver.findElement(By.xpath("//input[@placeholder='Zip/Postal Code']"));
        zip.sendKeys("12345");

        WebElement contınue = driver.findElement(By.xpath("//input[@data-test='continue']"));
        contınue.click();

        WebElement totalPrice = driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
        Double toplamFiyat =0.0;
        for (String s : urunFıyatListesi1) {
            toplamFiyat+= stringToDouble(s);
        }
        String sumText = String.valueOf(toplamFiyat);
        Assert.assertTrue(totalPrice.getText().contains(sumText));
        if(totalPrice.getText().contains(sumText)){
            System.out.println("fiyat toplamı doğrudur.");
        }
        WebElement finish = driver.findElement(By.xpath("//button[contains(text(),'Finis')]"));
        finish.click();

    }
    public static List<String> elementToString(List<WebElement> list){
        List<String> textList = new ArrayList<>();
        for (WebElement webElement : list) {
            textList.add(webElement.getText());
        }
        return textList;
    }
    public static void stringListKontrol(List<String> list1,List<String> list2){
        for (int i = 0; i < list1.size(); i++) {
            if(list1.get(i).equals(list2.get(i))){
                System.out.println(list1.get(i) + " ürün sepette var.");
            }
        }
    }
    public static double stringToDouble(String text){
        String rakamText = text.replaceAll("[$]","");
        Double sayı = Double.parseDouble(rakamText);
        return sayı;
    }
}
