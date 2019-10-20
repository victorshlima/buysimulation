package com.automationpratice.component.controller.pages;



import com.automationpratice.component.controller.com.automationpratice.component.DriverInstance.Util;
import com.automationpratice.component.controller.enumeration.ByPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


// fazer um for e selecionar por titulo
 //T-shirts

public class CatergoryPurchase {

    ByPath x;
    WebDriver webDriver;
    Util util;


    public By woman = By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a");
    public By urlTshirts = By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a");


    public By SELECT_FIRST_ITEM_CART = By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li");
    public By SELECT_FIRST_ITEM_CART_1 = By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div");

    public By ADD_FIRST_ITEM_CART = By.xpath("//*[@id='add_to_cart']");


    public By PROCEED_CHECKOUT = By.xpath  ("//*[@class='btn btn-default button button-medium']");


    public Boolean CatergoryPurchase(By path) {

        this.util.ClickByPath(path);
         return true;
    }

    public Boolean AddItemCart(By path) {

        this.util.ClickByPath(path);

        return true;
    }





    public CatergoryPurchase(WebDriver webDriver) {

        this.webDriver = webDriver;
        this.util =   new Util(webDriver);
    }

    public By getSELECT_FIRST_ITEM_CART() {
        return SELECT_FIRST_ITEM_CART;
    }

    public By getSELECT_FIRST_ITEM_CART_1() {
        return SELECT_FIRST_ITEM_CART_1;
    }

    public By getPROCEED_CHECKOUT() {
        return PROCEED_CHECKOUT;
    }

    public By getADD_FIRST_ITEM_CART() {        return ADD_FIRST_ITEM_CART;    }

    public By getUrlTshirts() {        return urlTshirts;    }

    public By getWoman() {
        return woman;
    }


}
