package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.LoadableComponent;


public class HomePage extends LoadableComponent<HomePage> {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;

        // implement error handling

    }

    public void clickOnAccounts() {

        driver.findElement(By.cssSelector("#social-sidebar-menu > li:nth-of-type(4) > a > span")).click();

    }

    public void clickOnAdmin() {

        driver.findElement(By.cssSelector("#Accounts > li:nth-of-type(1) > a")).click();


    }

    public void clickOnAddButton() {

        driver.findElement(By.className("add_button")).click();
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