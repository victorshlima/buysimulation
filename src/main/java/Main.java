




import com.automationpratice.component.controller.com.automationpratice.component.DriverInstance.DriverInstance;
import com.automationpratice.component.controller.enumeration.ByPath;
import com.automationpratice.component.controller.pages.CatergoryPurchase;
import com.automationpratice.component.controller.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Driver;


public class Main {


    private static final Logger logger = LoggerFactory.getLogger(Main.class);



    public static void main(String[] args) {


        DriverInstance driverInstance = new DriverInstance();
        WebDriver webDriver = driverInstance.buildANewDriver();
        HomePage home  = new HomePage();
        CatergoryPurchase catergoryPurchase = new CatergoryPurchase(webDriver);



        logger.info("Process begin");
        home.HomePage(webDriver);



        catergoryPurchase.CatergoryPurchase(catergoryPurchase.getWoman());
        catergoryPurchase.CatergoryPurchase(catergoryPurchase.getUrlTshirts());




        catergoryPurchase.AddItemCart(catergoryPurchase.getSELECT_FIRST_ITEM_CART());
      //  catergoryPurchase.AddItemCart(catergoryPurchase.getSELECT_FIRST_ITEM_CART_1());


        catergoryPurchase.AddItemCart(catergoryPurchase.getADD_FIRST_ITEM_CART());

        catergoryPurchase.AddItemCart(catergoryPurchase.getPROCEED_CHECKOUT());

        logger.info("Process finish");
        }


    }




