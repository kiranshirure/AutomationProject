package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;



    public abstract class AbstractTest {

        protected static WebDriver driver;

        protected static WebDriverWait wait;

        @BeforeSuite
        public static void setUp() throws Exception {

            System.setProperty("webdriver.chrome.driver", "/home/user/Desktop/chromedriver/");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
            wait  = new WebDriverWait(driver,16);
        }
        @BeforeMethod
        public void setUpBefore() throws Exception {
            driver.manage().deleteAllCookies();
            driver.navigate().refresh();
        }

        @AfterSuite
        public static void tearDown() throws Exception {
            driver.close();
            driver.quit();
        }
    }