package SaucedemoTest;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;
import xPath.SaucedemoTest;

import java.util.ArrayList;
import java.util.List;

public class Class9_RandomUrunKontrol extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        /**
         * https://www.saucedemo.com/  siteye git
         * Random bir ürün seç
         * ürüne tıkla
         * bilgilerini kontrol et
         */

        driver.get("https://www.saucedemo.com/");
        Class6_TryCatch.login("standard_user","secret_sauce");

        List<WebElement> urunList1 = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
        List<String> list1 = new ArrayList<>();
        for (WebElement s : urunList1) {
            list1.add(s.getText());
            // TODO: 24.02.2022    List<String> list2 = SaucedemoTest.elementToString(urunList1); class ismi ile methodu çağırdık
        }
        List<WebElement> priceList1 = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
        // TODO: 24.02.2022                                            bu lokasyondaki elementlerin fiyatlarını String list in içine getText olarak ekliyor
        List<String> price1 = new ArrayList<>();
        for (WebElement i : priceList1) {
            price1.add(i.getText());  
         //   List<String> price2 = SaucedemoTest.elementToString(priceList1); bu şekilde de olur
            // TODO: 24.02.2022 class ismi ile methodu çağırdık.method static olduğu için class ismi ile çağırabilirim. 
            // TODO: 24.02.2022 static olmasaydı obje oluşturmam gerekecekti. 
        }
        List<WebElement> addToCart = driver.findElements(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']"));

        // TODO: 24.02.2022 random sayı üretmek istiyorum,bunun ismi,fiyatı ve add to cartınında random sayısını oluşturmam lazım.
        int random = randomSayı(urunList1.size()); //urun1List in içindeki ürün sayısı kadar random sayı üret.
        String urunRandomText = list1.get(random); // TODO: 24.02.2022 random sayıya karşılık gelen ürün ismi
        String urunRandomPrice = price1.get(random);  // TODO: 24.02.2022 random sayıya karşılık gelen ürün fiyatı
        addToCart.get(random).click(); // TODO: 24.02.2022  random sayıya karşılık gelen ürünün add to cart tıklaması
        urunList1.get(random).click(); // TODO: 24.02.2022 random sayıya karşılık gelen ürünün click edilmesi.

        String sepettekıUrunName = driver.findElement(By.xpath("//div[@class='inventory_details_name large_size']")).getText();
        String sepettekiUrunPrice = driver.findElement(By.xpath("//div[@class='inventory_details_price']")).getText();

        Assert.assertEquals(sepettekıUrunName,urunRandomText);
        Assert.assertEquals(sepettekiUrunPrice,urunRandomPrice);

        System.out.println("sepetteki ürün ismi = " + sepettekıUrunName);
        System.out.println("sepetteki ürünün fiyatı = " + sepettekiUrunPrice);
        Thread.sleep(1000);
        driver.quit();



    }
    public static int randomSayı(int size){
        return (int) (Math.random()*size);
    }
}
