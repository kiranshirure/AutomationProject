package Tests;

import Beans.FillDetails;
import Pages.HomePage;
import org.testng.annotations.Test;


public class HomePageTest extends AbstractTest   {



    @Test
    public void HomePageTest(){

        HomePage homePage = new HomePage(driver).get();

        homePage.clickOnAccounts();
        homePage.clickOnAdmin();
        homePage.clickOnAddButton();
        FillDetails fd = new FillDetails(driver).get();
        fd.populateAllRequiredDetails();


    }
}
