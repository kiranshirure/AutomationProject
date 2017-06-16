package Tests;

import Pages.LoginPage;
import org.testng.annotations.Test;


public class LoginPageTest extends AbstractTest {


    @Test
    public void LoginTest() {

        LoginPage loginPage = new LoginPage(driver).get();

        loginPage.openURL();
        loginPage.setEmail();
        loginPage.setPassword();
        loginPage.clickLogin();


    }


}
