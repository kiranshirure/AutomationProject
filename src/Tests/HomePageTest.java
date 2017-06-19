package Tests;

import Beans.FillDetails;
import Beans.UserDetails;
import Pages.HomePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HomePageTest extends AbstractTest {


    @Test
    public void HomePageTest() {

        HomePage homePage = new HomePage(driver).get();

        homePage.clickOnAccounts();
        homePage.clickOnAdmin();
        homePage.clickOnAddButton();
        FillDetails fd = new FillDetails(driver).get();
        fd.populateAllRequiredDetails();

        String Fname = driver.findElement(By.cssSelector("#content > div > div:nth-of-type(2) > div > div > div:nth-of-type(1) > div:nth-of-type(2) > table > tbody > tr > td:nth-of-type(3)")).getText();

        String Lname = driver.findElement(By.cssSelector("#content > div > div:nth-of-type(2) > div > div > div:nth-of-type(1) > div:nth-of-type(2) > table > tbody > tr > td:nth-of-type(4)")).getText();

        String Email = driver.findElement(By.cssSelector("#content > div > div:nth-of-type(2) > div > div > div:nth-of-type(1) > div:nth-of-type(2) > table > tbody > tr > td:nth-of-type(5)")).getText();


        UserDetails ud = UserDetails.getUserDetails();


        Assert.assertEquals(Fname, ud.getFirstName());
        Assert.assertEquals(Lname, ud.getLastName());
        Assert.assertEquals(Email, ud.getEmail());

        driver.findElement(By.cssSelector("#content > div > div:nth-of-type(2) > div > div > div:nth-of-type(1) > div:nth-of-type(2) > table > tbody > tr > td:nth-of-type(8) > span > a:nth-of-type(1) > i")).click();

        boolean isChecked = driver.findElement(By.xpath("//*[@id='content']/form/div/div[2]/div/div[17]/div[1]/div/div[2]/ul/li[3]/label/div/ins")).isEnabled();

       Assert.assertEquals(isChecked,true);


    }
}
