package com.automationpratice;

import com.automationpratice.component.controller.WebDriverInstance.DriverInstance;
import com.automationpratice.component.controller.WebDriverInstance.Util;
import com.automationpratice.component.controller.model.Address;
import com.automationpratice.component.controller.model.Order;
import com.automationpratice.component.controller.pagination.CreateAccont;
import com.automationpratice.component.controller.pagination.HomePage;
import com.automationpratice.component.controller.pagination.Purchase;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import resources.Users;


public class PurchaseSimulationTest {

    private static final Logger logger = LoggerFactory.getLogger(PurchaseSimulationTest.class);

    private static Users user;
    private static DriverInstance driverInstance = new DriverInstance();
    private static WebDriver webDriver = driverInstance.buildANewDriver();
    private static HomePage home = new HomePage();
    private static Purchase purchase = new Purchase();
    private static Util uDriver = new Util(webDriver, 30);
    private static CreateAccont account = new CreateAccont();
    private Order order;
    private Address adress1;
    private Address adress2;

    public PurchaseSimulationTest(Users user) {

        PurchaseSimulationTest.user = user.Woman0001();
        this.order = new Order();

        this.adress1 = new Address();
        this.adress1.setAddress(user.getAddress());
        this.adress1.setAddressLine2(user.getAddressLine2());
        this.adress1.setCity(user.getCity());
        this.adress1.setCompany(user.getCompany());
        this.adress1.setCustomer_firstname(user.getCustumerFirstName());
        this.adress1.setCustomer_lastname(user.getCustumerLastName());

        this.adress2 = new Address();
        this.adress2.setAddress(user.getAddress());
        this.adress2.setAddressLine2(user.getAddressLine2());
        this.adress2.setCity(user.getCity());
        this.adress2.setCompany(user.getCompany());
        this.adress2.setCustomer_firstname(user.getCustumerFirstName());
        this.adress2.setCustomer_lastname(user.getCustumerLastName());
    }

    public static void main(String[] args) {

        new PurchaseSimulationTest(new Users().Woman0001());

        IniPurchase();
        GetInfoItem();
        AddToCart();
        SignUp();
        FiningPurchase();

    }

    public static void IniPurchase() {

        uDriver.getURL(home.HOME);
        uDriver.ClickByPath(home.WOMAN_MENU);
        uDriver.ClickByPath(home.WOMAN_TSHIRTS);
        uDriver.ClickByPath(purchase.SELECT_FIRST_ITEM_CART);

    }

    public static void GetInfoItem() {

        uDriver.getTextElement(purchase.ITEM_PRICE);
        uDriver.getAtribute(purchase.ITEM_QUANT, purchase.ATT_PROCEED);
        uDriver.getAtribute(purchase.ITEM_COLOR, purchase.ATT_NAME);
        uDriver.selecItemListBox(purchase.ITEM_SIZE, purchase.ATT_SELECTED);

    }

    public static void AddToCart() {

        uDriver.ClickByPath(purchase.ADD_FIRST_ITEM_CART);
        uDriver.ClickByPath(purchase.PROCEED_CHECKOUT);
        uDriver.ClickByPath(purchase.PROCEED_CHECKOUT_2);

    }

    public static void SignUp() {

        uDriver.InsertValue(account.EMAIL_ADRESS, account.EMAIL_ADRESS_TEST);
        uDriver.ClickByPath(account.CREATE_ACCOUNT);
        uDriver.ClickByPath(account.UNIFORM_NEWSLETTER);
        uDriver.ClickByPath(account.UNIFORM_OPTIN_OFFERS);
        uDriver.ClickByPath(account.TITLE);
        uDriver.InsertValue(account.CUSTUMER_FIRST_NAME, user.getCustumerFirstName());
        uDriver.InsertValue(account.CUSTUMER_LAST_NAME, user.getCustumerLastName());
        uDriver.InsertValue(account.PASSWORD, user.getPasswd());
        uDriver.InsertValue(account.COMPANY, user.getCompany());
        uDriver.InsertValue(account.ADDRESS, user.getAddress());
        uDriver.InsertValue(account.ADDRESS_Line2, user.getAddressLine2());
        uDriver.InsertValue(account.CITY, user.getCity());
        uDriver.InsertValue(account.OTHER, user.getOther());
        uDriver.InsertValue(account.POSTAL_CODE, user.getPostal_code());
        uDriver.InsertValue(account.PHONE, user.getPhone());
        uDriver.InsertValue(account.PHONE_MOBILE, user.getPhoneMobile());
        uDriver.selecItemListBox(account.STATE, user.getState());
        uDriver.selecItemListBox(account.COUNTRY, user.getCountry());
        uDriver.selecItemListBox(account.DAY, user.getDay());
        uDriver.selecItemListBox(account.MONTH, user.getMonth());
        uDriver.selecItemListBox(account.YEAR, user.getYear());

    }

    public static void FiningPurchase() {

        uDriver.ClickByPath(account.REGISTER);
        uDriver.ClickByPath(account.CONFIRM_ADDRESS_PRO_CHECK);
        uDriver.ClickByPath(account.CONFIRM);
        uDriver.ClickByPath(account.SHIPPING_PRO_CHECK);
        uDriver.ClickByPath(account.PAY_BUY_WIRE);
        uDriver.ClickByPath(account.I_CONFIRM_ORDER);

    }
}