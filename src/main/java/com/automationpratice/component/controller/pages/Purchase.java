package com.automationpratice.component.controller.pages;


import org.openqa.selenium.By;

public class Purchase {


    public By SELECT_FIRST_ITEM_CART = By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li");
    public By SELECT_FIRST_ITEM_CART_1 = By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div");

    public By ADD_FIRST_ITEM_CART = By.xpath("//*[@id='add_to_cart']");

    public By PROCEED_CHECKOUT = By.xpath("//*[@class='btn btn-default button button-medium']");

    public By ITEM_PRICE = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[1]/div[1]/p[1]/span");
    public By ITEM_QUANT = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[2]/p[1]/input");

    public By ITEM_SIZE = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[2]/div/fieldset[1]/div/div/select/option");
    public By ITEM_COLOR = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[2]/div/fieldset[2]/div/ul/li[1]/a");

    public By PROCEED_CHECKOUT_2 = By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]");

    public By getPROCEED_CHECKOUT_2() {
        return PROCEED_CHECKOUT_2;
    }

    public By getITEM_PRICE() {
        return ITEM_PRICE;
    }

    public By getITEM_QUANT() {
        return ITEM_QUANT;
    }

    public By getITEM_SIZE() {
        return ITEM_SIZE;
    }

    public By getITEM_COLOR() {
        return ITEM_COLOR;
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

    public By getADD_FIRST_ITEM_CART() {
        return ADD_FIRST_ITEM_CART;
    }


}


