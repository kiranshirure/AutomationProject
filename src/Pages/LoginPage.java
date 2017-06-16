package Pages;

import Utils.propertiesReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.LoadableComponent;


public class LoginPage extends LoadableComponent<LoginPage> {

private WebDriver driver;


    By email = By.name("email");
    By password = By.name("password");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openURL() {

        driver.get(propertiesReader.getProperty("config", "url"));


    }


    public void setEmail() {

        driver.findElement(email).sendKeys(propertiesReader.getProperty("config", "email"));


    }


    public void setPassword() {

        driver.findElement(password).sendKeys(propertiesReader.getProperty("config", "password"));

    }


    public void clickLogin() {

        driver.findElement(By.cssSelector("[data-style]")).click();


    }





    @Override
    protected void load() {

       return;

    }

    @Override
    protected void isLoaded() throws Error {

       return;
    }
}
