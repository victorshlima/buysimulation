package com.automationpratice.component.controller.pages;


import org.openqa.selenium.By;

public class Payment {


    public By YOUR_DELIVERY_ADDRESS = By.xpath("//*[@id='address_delivery']/li");

    public By YOUR_BILLING_ADDRESS = By.xpath("//*[@id='id_gender2']");

    public By CONFIRM_ADDRESS_PRO_CHECK = By.xpath("//*[@id='center_column']/form/p/button");

    public By SELECIONA_TIPO_PAGAMENTO = By.xpath("//*[@id='center_column']/form/p/button");

    public By CARD_NAVIGATION = By.xpath("//*[@id='cart_navigation']");

    public By REGISTER = By.xpath("//*[@id='submitAccount']");

    public By SHIPPING_PRO_CHECK = By.xpath("//*[@id='form']/p/button");

    public By PAY_BUY_WIRE = By.xpath("//*[@id='HOOK_PAYMENT']/div[1]/div/p/a");

    public By I_CONFIRM_ORDER = By.xpath("//*[@id='cart_navigation']/button");


    public By getYOUR_DELIVERY_ADDRESS() {
        return YOUR_DELIVERY_ADDRESS;
    }

    public By getYOUR_BILLING_ADDRESS() {
        return YOUR_BILLING_ADDRESS;
    }

    public By getSELECIONA_TIPO_PAGAMENTO() {
        return SELECIONA_TIPO_PAGAMENTO;
    }

    public By getCARD_NAVIGATION() {
        return CARD_NAVIGATION;
    }

    public By getREGISTER() {
        return REGISTER;
    }

    public By getCONFIRM_ADDRESS_PRO_CHECK() {
        return CONFIRM_ADDRESS_PRO_CHECK;
    }

    public By getSHIPPING_PRO_CHECK() {
        return SHIPPING_PRO_CHECK;
    }

    public By getPAY_BUY_WIRE() {
        return PAY_BUY_WIRE;
    }

    public By getI_CONFIRM_ORDER() {
        return I_CONFIRM_ORDER;
    }
}
