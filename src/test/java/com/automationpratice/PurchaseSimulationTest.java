package com.automationpratice;

import com.automationpratice.component.controller.WebDriverInstance.DriverInstance;
import com.automationpratice.component.controller.WebDriverInstance.Utilv2;
import com.automationpratice.component.controller.domain.Address;
import com.automationpratice.component.controller.domain.Order;
import com.automationpratice.component.controller.pages.CatergoryPurchase;
import com.automationpratice.component.controller.pages.CreateAccont;
import com.automationpratice.component.controller.pages.HomePage;
import com.automationpratice.component.controller.pages.Purchase;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class PurchaseSimulationTest {


    private static final Logger logger = LoggerFactory.getLogger(PurchaseSimulationTest.class);


    public static void main(String[] args) {

        Order order = new Order();
        Address adress1 = new Address();
        Address adress2 = new Address();

        DriverInstance driverInstance = new DriverInstance();
        WebDriver webDriver = driverInstance.buildANewDriver();
        HomePage home = new HomePage();

        Purchase purchase = new Purchase();
        Utilv2 utilv2 = new Utilv2(webDriver, 30);
        CreateAccont account = new CreateAccont();

        CatergoryPurchase catergoryPurchase = new CatergoryPurchase(webDriver);

        utilv2.getURL(home.HOME);
        utilv2.ClickByPath(home.WOMAN_MENU);
        utilv2.ClickByPath(home.WOMAN_TSHIRTS);

        utilv2.ClickByPath(purchase.SELECT_FIRST_ITEM_CART);
        utilv2.getTextElement(purchase.ITEM_PRICE);
        utilv2.getAtribute(purchase.ITEM_QUANT, purchase.ATT_PROCEED);
        utilv2.getAtribute(purchase.ITEM_COLOR, purchase.ATT_NAME);
        utilv2.selecItemListBox(purchase.ITEM_SIZE, purchase.ATT_SELECTED);
        utilv2.ClickByPath(purchase.ADD_FIRST_ITEM_CART);
        utilv2.ClickByPath(purchase.PROCEED_CHECKOUT);
        utilv2.ClickByPath(purchase.PROCEED_CHECKOUT_2);


        utilv2.InsertValue(account.EMAIL_ADRESS, account.EMAIL_ADRESS_TEST);
        utilv2.ClickByPath(account.CREATE_ACCOUNT);
        utilv2.ClickByPath(account.UNIFORM_NEWSLETTER);
        utilv2.ClickByPath(account.UNIFORM_OPTIN_OFFERS);
        utilv2.ClickByPath(account.TITLE);

        utilv2.InsertValue(account.CUSTUMER_FIRST_NAME, "John");
        utilv2.InsertValue(account.CUSTUMER_LAST_NAME, "Lennon");
        utilv2.InsertValue(account.PASSWORD, "A124@125");

        utilv2.InsertValue(account.COMPANY, "Company");
        utilv2.InsertValue(account.ADDRESS, "Baker Street");
        utilv2.InsertValue(account.ADDRESS_Line2, "221B");
        utilv2.InsertValue(account.CITY, "Londres");
        utilv2.InsertValue(account.OTHER, "Other");

        utilv2.InsertValue(account.POSTAL_CODE, "00000");
        utilv2.InsertValue(account.PHONE, "(+55) 51 9999-22222");
        utilv2.InsertValue(account.PHONE_MOBILE, "(+55) 51 9999-22222");
        utilv2.selecItemListBox(account.STATE, "California");
        utilv2.selecItemListBox(account.COUNTRY, "United States");
        utilv2.selecItemListBox(account.DAY, "17");
        utilv2.selecItemListBox(account.MONTH, "April");
        utilv2.selecItemListBox(account.YEAR, "1990");
        utilv2.ClickByPath(account.REGISTER);
        utilv2.ClickByPath(account.CONFIRM_ADDRESS_PRO_CHECK);
        utilv2.ClickByPath(account.CONFIRM);
        utilv2.ClickByPath(account.SHIPPING_PRO_CHECK);
        utilv2.ClickByPath(account.PAY_BUY_WIRE);
        utilv2.ClickByPath(account.I_CONFIRM_ORDER);



    }
}