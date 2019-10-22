package com.automationpratice.component.controller.pagination;


import com.automationpratice.component.controller.WebDriverInstance.Util;
import com.automationpratice.component.controller.enumeration.ByPath;
import com.automationpratice.component.controller.model.Order;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class CatergoryPurchase {

    ByPath x;
    WebDriver webDriver;
    Util util;
    Order ped = new Order();


    private static String urlToLogon = "http://automationpractice.com/index.php?";

    public By woman = By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a");
    public By urlTshirts = By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a");

    public By SELECT_FIRST_ITEM_CART = By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li");
    public By SELECT_FIRST_ITEM_CART_1 = By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div");

    public By ADD_FIRST_ITEM_CART = By.xpath("//*[@id='add_to_cart']");

    public By PROCEED_CHECKOUT = By.xpath  ("//*[@class='btn btn-default button button-medium']");

    public By ITEM_PRICE = By.xpath  ("/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[1]/div[1]/p[1]/span");
    public By ITEM_QUANT = By.xpath  ("/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[2]/p[1]/input");

    public By ITEM_SIZE = By.xpath  ("/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[2]/div/fieldset[1]/div/div/select/option");
    public By ITEM_COLOR = By.xpath  ("/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[2]/div/fieldset[2]/div/ul/li[1]/a");

    public By PROCEED_CHECKOUT_2 = By.xpath  ("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]");

    public By CREATE_ACCOUNT = By.xpath  ("//*[@id=\"SubmitCreate\"]");
    public By EMAIL_ADRESS = By.xpath  ("/html/body/div/div[2]/div/div[3]/div/div/div[1]/form/div/div[2]/input");
    public String EMAIL_ADRESS_TEST = "test_user" + new Random().nextInt(999999999) + "@testgmail.com";

    public By CUSTUMER_FIRST_NAME = By.xpath("//*[@id='customer_firstname']");
    public By CUSTUMER_LAST_NAME = By.xpath("//*[@id='customer_lastname']");
    public By email = By.xpath("//*[@id='email']");
    public By passwd = By.xpath("//*[@id='PASSWORD']");

    public By FIRST_NAME = By.xpath("//*[@id='firstname']");
    public By LAST_NAME = By.xpath("//*[@id='lastname']");
    public By COMPANY = By.xpath("//*[@id='company']");
    public By ADDRESS = By.xpath("//*[@id='address1']");
    public By ADDRESS_Line2 = By.xpath("//*[@id='address2']");
    public By CITY = By.xpath("//*[@id='city']");

    public By POSTAL_CODE = By.xpath("//*[@id='postcode']");

    public By OTHER = By.xpath("//*[@id='other']");
    public By PHONE = By.xpath("//*[@id='phone']");
    public By PHONE_MOBILE = By.xpath("//*[@id='phone_mobile']");
    public By ALIAS = By.xpath("//*[@id='alias']");

    public By STATE = By.xpath("//*[@id='id_state']/option");

    public By COUNTRY = By.xpath("//*[@id='id_country']/option");

    public By DAY = By.xpath("//*[@id='days']/option");
    public By MONTH = By.xpath("//*[@id='months']/option");
    public By YEAR = By.xpath("//*[@id='years']/option");


    public By UNIFORM_NEWSLETTER = By.xpath("//*[@id='uniform-newsletter']");
    public By UNIFORM_OPTIN_OFFERS = By.xpath("//*[@id='uniform-optin']");

    public By TITLE = By.xpath("//*[@id='id_gender2']");

    public By CONFIRM = By.xpath("//*[@id='cgv']");

    public By YOUR_DELIVERY_ADDRESS = By.xpath("//*[@id='address_delivery']/li");

    public By YOUR_BILLING_ADDRESS = By.xpath("//*[@id='id_gender2']");

    public By CONFIRM_ADDRESS_PRO_CHECK = By.xpath("//*[@id='center_column']/form/p/button");

    public By SELECIONA_TIPO_PAGAMENTO = By.xpath("//*[@id='center_column']/form/p/button");

    public By CARD_NAVIGATION = By.xpath("//*[@id='cart_navigation']");

    public By REGISTER = By.xpath("//*[@id='submitAccount']");

    public By SHIPPING_PRO_CHECK = By.xpath("//*[@id='form']/p/button");

    public By PAY_BUY_WIRE = By.xpath("//*[@id='HOOK_PAYMENT']/div[1]/div/p/a");

    public By I_CONFIRM_ORDER = By.xpath("//*[@id='cart_navigation']/button");


    public Boolean CatergoryPurchase(By path) {
        this.util.ClickByPath(path);
         return true;
    }

        public Boolean AddItemCart(By path) {
        this.util.ClickByPath(path);
        return true;
    }



    public Boolean SelectItem(By path, String value) {

        this.util.selecItemListBox(path, value );


        return true;
    }


    public Boolean validaItem(By path) {

     String preco =   this.util.getTextElement(path);


     ped.setPreço(Double.parseDouble(preco.substring(1)));

     return true;
    }

    public Boolean validaList(By path, String atribute) {

        String values =   this.util.getTextElements(path, atribute );
        return true;
    }

    public Boolean validaItem2(By path, String atribute) {

        String value =   this.util.getAtribute(path,atribute);
        return true;
    }


    public Boolean InsertValue(By path, String value) {


        return this.util.InsertValue(path,value);
    }

    public CatergoryPurchase(WebDriver webDriver) {

        this.webDriver = webDriver;
        this.util = new Util(webDriver, 20);
    }

    public By getYOUR_DELIVERY_ADDRESS() {
        return YOUR_DELIVERY_ADDRESS;
    }

    public By getYOUR_BILLING_ADDRESS() {
        return YOUR_BILLING_ADDRESS;
    }

    public By getCONFIRM() {
        return CONFIRM;
    }

    public By getSELECIONA_TIPO_PAGAMENTO() {
        return SELECIONA_TIPO_PAGAMENTO;
    }

    public By getCARD_NAVIGATION() {
        return CARD_NAVIGATION;
    }

    public String getEMAIL_ADRESS_TEST() {
        return EMAIL_ADRESS_TEST;
    }

    public By getCOUNTRY() {
        return COUNTRY;
    }

    public By getDAY() {
        return DAY;
    }

    public By getMONTH() {
        return MONTH;
    }

    public By getYEAR() {
        return YEAR;
    }

    public By getCUSTUMER_FIRST_NAME() {
        return CUSTUMER_FIRST_NAME;
    }

    public By getCUSTUMER_LAST_NAME() {
        return CUSTUMER_LAST_NAME;
    }

    public By getEmail() {
        return email;
    }

    public By getPasswd() {
        return passwd;
    }

    public By getPROCEED_CHECKOUT_2() {
        return PROCEED_CHECKOUT_2;
    }

    public By getCREATE_ACCOUNT() {
        return CREATE_ACCOUNT;
    }

    public By getEMAIL_ADRESS() {
        return EMAIL_ADRESS;
    }

    public By getFIRST_NAME() {
        return FIRST_NAME;
    }

    public By getSTATE() {
        return STATE;
    }

    public By getLAST_NAME() {
        return LAST_NAME;
    }

    public By getCOMPANY() {
        return COMPANY;
    }

    public By getADDRESS() {
        return ADDRESS;
    }

    public By getCITY() {
        return CITY;
    }

    public By getOTHER() {
        return OTHER;
    }

    public By getPHONE() {
        return PHONE;
    }

    public By getPHONE_MOBILE() {
        return PHONE_MOBILE;
    }

    public By getALIAS() {
        return ALIAS;
    }

    public By getPOSTAL_CODE() {
        return POSTAL_CODE;
    }

    public By getITEM_PRICE() {        return ITEM_PRICE;    }

    public By getITEM_QUANT() {        return ITEM_QUANT;    }

    public By getITEM_SIZE() {        return ITEM_SIZE;    }

    public By getITEM_COLOR() {        return ITEM_COLOR;    }

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

    public By getADDRESS_Line2() {
        return ADDRESS_Line2;
    }

    public By getREGISTER() {
        return REGISTER;
    }

    public By getTITLE() {
        return TITLE;
    }
    public By getWoman() {
        return woman;
    }

    public By getUNIFORM_NEWSLETTER() {
        return UNIFORM_NEWSLETTER;
    }

    public By getUNIFORM_OPTIN_OFFERS() {
        return UNIFORM_OPTIN_OFFERS;
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
