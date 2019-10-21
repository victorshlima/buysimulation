import com.automationpratice.component.controller.WebDriverInstance.DriverInstance;
import com.automationpratice.component.controller.pages.CatergoryPurchase;
import com.automationpratice.component.controller.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Main {


    private static final Logger logger = LoggerFactory.getLogger(Main.class);



    public static void main(String[] args) {


        DriverInstance driverInstance = new DriverInstance();
        WebDriver webDriver = driverInstance.buildANewDriver();
        HomePage home = new HomePage();
        CatergoryPurchase catergoryPurchase = new CatergoryPurchase(webDriver);

        logger.info("Process begin");
        home.HomePage(webDriver);

        catergoryPurchase.CatergoryPurchase(catergoryPurchase.getWoman());

        catergoryPurchase.CatergoryPurchase(catergoryPurchase.getUrlTshirts());

        catergoryPurchase.AddItemCart(catergoryPurchase.getSELECT_FIRST_ITEM_CART());

        catergoryPurchase.validaItem(catergoryPurchase.getITEM_PRICE());

        catergoryPurchase.validaItem2(catergoryPurchase.getITEM_QUANT(), "value");
        //percorer a lista
        catergoryPurchase.validaItem2(catergoryPurchase.getITEM_COLOR(), "name");

        catergoryPurchase.validaList(catergoryPurchase.getITEM_SIZE(), "selected");

        catergoryPurchase.AddItemCart(catergoryPurchase.getADD_FIRST_ITEM_CART());

        catergoryPurchase.AddItemCart(catergoryPurchase.getPROCEED_CHECKOUT());

        catergoryPurchase.CatergoryPurchase(catergoryPurchase.getPROCEED_CHECKOUT_2());

        catergoryPurchase.InsertValue(catergoryPurchase.getEMAIL_ADRESS(), catergoryPurchase.getEMAIL_ADRESS_TEST());

        catergoryPurchase.CatergoryPurchase(catergoryPurchase.getCREATE_ACCOUNT());

        catergoryPurchase.CatergoryPurchase(catergoryPurchase.getUNIFORM_NEWSLETTER());
        catergoryPurchase.CatergoryPurchase(catergoryPurchase.getUNIFORM_OPTIN_OFFERS());

        catergoryPurchase.CatergoryPurchase(catergoryPurchase.getTITLE());

        catergoryPurchase.InsertValue(catergoryPurchase.getCUSTUMER_FIRST_NAME(), "John");
        catergoryPurchase.InsertValue(catergoryPurchase.getCUSTUMER_LAST_NAME(), "Lennon");
        catergoryPurchase.InsertValue(catergoryPurchase.getPasswd(), "A124@125");

        catergoryPurchase.InsertValue(catergoryPurchase.getCOMPANY(), "Company");
        catergoryPurchase.InsertValue(catergoryPurchase.getADDRESS(), "Baker Street");
        catergoryPurchase.InsertValue(catergoryPurchase.getADDRESS_Line2(), "221B");
        catergoryPurchase.InsertValue(catergoryPurchase.getCITY(), "Londres");
        catergoryPurchase.InsertValue(catergoryPurchase.getOTHER(), "Other");

        catergoryPurchase.InsertValue(catergoryPurchase.getPOSTAL_CODE(), "00000");
        catergoryPurchase.InsertValue(catergoryPurchase.getPHONE(), "(+55) 51 9999-22222");
        catergoryPurchase.InsertValue(catergoryPurchase.getPHONE_MOBILE(), "(+55) 51 9999-22222");
        //   catergoryPurchase.InsertValue(catergoryPurchase.getALIAS(), "Zaffari");

        catergoryPurchase.SelectItem(catergoryPurchase.getSTATE(), "California");
        catergoryPurchase.SelectItem(catergoryPurchase.getCOUNTRY(), "United States");


        catergoryPurchase.SelectItem(catergoryPurchase.getDAY(), "17");
        catergoryPurchase.SelectItem(catergoryPurchase.getMONTH(), "April");
        catergoryPurchase.SelectItem(catergoryPurchase.getYEAR(), "1990");

        catergoryPurchase.CatergoryPurchase(catergoryPurchase.getREGISTER());

        catergoryPurchase.CatergoryPurchase(catergoryPurchase.getCONFIRM_ADDRESS_PRO_CHECK());


        catergoryPurchase.CatergoryPurchase(catergoryPurchase.getCONFIRM());

        catergoryPurchase.CatergoryPurchase(catergoryPurchase.getSHIPPING_PRO_CHECK());

        catergoryPurchase.CatergoryPurchase(catergoryPurchase.getPAY_BUY_WIRE());

        catergoryPurchase.CatergoryPurchase(catergoryPurchase.getI_CONFIRM_ORDER());
        logger.info("Process finish");


    }
}