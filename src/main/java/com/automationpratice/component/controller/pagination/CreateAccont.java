package com.automationpratice.component.controller.pagination;


import org.openqa.selenium.By;

import java.util.Random;

public class CreateAccont {

    public By CREATE_ACCOUNT = By.xpath("//*[@id=\"SubmitCreate\"]");

    public By EMAIL_ADRESS = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/form/div/div[2]/input");
    public String EMAIL_ADRESS_TEST = "test_user" + new Random().nextInt(999999999) + "@testgmail.com";

    public By CUSTUMER_FIRST_NAME = By.xpath("//*[@id='customer_firstname']");
    public By CUSTUMER_LAST_NAME = By.xpath("//*[@id='customer_lastname']");
    public By email = By.xpath("//*[@id='email']");
    public By PASSWORD = By.xpath("//*[@id='passwd']");

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

    public By getPASSWORD() {
        return PASSWORD;
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


    public By getADDRESS_Line2() {
        return ADDRESS_Line2;
    }

    public By getREGISTER() {
        return REGISTER;
    }

    public By getTITLE() {
        return TITLE;
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
