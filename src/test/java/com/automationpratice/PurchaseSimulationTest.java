package com.automationpratice;

import com.automationpratice.component.controller.WebDriverInstance.DriverInstance;
import com.automationpratice.component.controller.WebDriverInstance.Utilv2;
import com.automationpratice.component.controller.domain.Address;
import com.automationpratice.component.controller.domain.Order;
import com.automationpratice.component.controller.pages.CatergoryPurchase;
import com.automationpratice.component.controller.pages.HomePage;
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

        CatergoryPurchase catergoryPurchase = new CatergoryPurchase(webDriver);

        logger.info("Process begin");
        home.HomePage(webDriver);
        Utilv2 utilv2 = new Utilv2(webDriver, 30);

        utilv2.ClickByPath(catergoryPurchase.getWoman());

        utilv2.ClickByPath(catergoryPurchase.getUrlTshirts());

        catergoryPurchase.AddItemCart(catergoryPurchase.getSELECT_FIRST_ITEM_CART());

        catergoryPurchase.validaItem(catergoryPurchase.getITEM_PRICE());

        catergoryPurchase.validaItem2(catergoryPurchase.getITEM_QUANT(), "value");

        catergoryPurchase.validaItem2(catergoryPurchase.getITEM_COLOR(), "name");

        catergoryPurchase.validaList(catergoryPurchase.getITEM_SIZE(), "selected");

        catergoryPurchase.AddItemCart(catergoryPurchase.getADD_FIRST_ITEM_CART());

        catergoryPurchase.AddItemCart(catergoryPurchase.getPROCEED_CHECKOUT());

        utilv2.ClickByPath(catergoryPurchase.getPROCEED_CHECKOUT_2());

        utilv2.InsertValue(catergoryPurchase.getEMAIL_ADRESS(), catergoryPurchase.getEMAIL_ADRESS_TEST());

        utilv2.ClickByPath(catergoryPurchase.getCREATE_ACCOUNT());

        utilv2.ClickByPath(catergoryPurchase.getUNIFORM_NEWSLETTER());
        utilv2.ClickByPath(catergoryPurchase.getUNIFORM_OPTIN_OFFERS());

        utilv2.ClickByPath(catergoryPurchase.getTITLE());

        utilv2.InsertValue(catergoryPurchase.getCUSTUMER_FIRST_NAME(), "John");
        utilv2.InsertValue(catergoryPurchase.getCUSTUMER_LAST_NAME(), "Lennon");
        utilv2.InsertValue(catergoryPurchase.getPasswd(), "A124@125");

        utilv2.InsertValue(catergoryPurchase.getCOMPANY(), "Company");
        utilv2.InsertValue(catergoryPurchase.getADDRESS(), "Baker Street");
        utilv2.InsertValue(catergoryPurchase.getADDRESS_Line2(), "221B");
        utilv2.InsertValue(catergoryPurchase.getCITY(), "Londres");
        utilv2.InsertValue(catergoryPurchase.getOTHER(), "Other");

        utilv2.InsertValue(catergoryPurchase.getPOSTAL_CODE(), "00000");
        utilv2.InsertValue(catergoryPurchase.getPHONE(), "(+55) 51 9999-22222");
        utilv2.InsertValue(catergoryPurchase.getPHONE_MOBILE(), "(+55) 51 9999-22222");
        utilv2.selecItemListBox(catergoryPurchase.getSTATE(), "California");
        utilv2.selecItemListBox(catergoryPurchase.getCOUNTRY(), "United States");

        utilv2.selecItemListBox(catergoryPurchase.getDAY(), "17");
        utilv2.selecItemListBox(catergoryPurchase.getMONTH(), "April");
        utilv2.selecItemListBox(catergoryPurchase.getYEAR(), "1990");

        utilv2.ClickByPath(catergoryPurchase.getREGISTER());
        utilv2.ClickByPath(catergoryPurchase.getCONFIRM_ADDRESS_PRO_CHECK());
        utilv2.ClickByPath(catergoryPurchase.getCONFIRM());

        utilv2.ClickByPath(catergoryPurchase.getSHIPPING_PRO_CHECK());

        utilv2.ClickByPath(catergoryPurchase.getPAY_BUY_WIRE());

        utilv2.ClickByPath(catergoryPurchase.getI_CONFIRM_ORDER());
        logger.info("Process finish");


    }
}