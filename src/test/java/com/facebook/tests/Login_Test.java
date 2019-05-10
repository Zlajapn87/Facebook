package com.facebook.tests;
import com.facebook.data.data.data.FacebookData;
import com.facebook.data.data.pages.FacebookLoginPage;
import com.facebook.data.data.pages.FacebookMainPage;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import static org.testng.Assert.*;


public class Login_Test {

    public WebDriver driver;

    FacebookMainPage fbMainPage;
    FacebookLoginPage fbLoginPage;

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/Drivers/chromedriver_74.exe");
        driver = new ChromeDriver(); //Driver has to be created before the page.
        fbMainPage = PageFactory.initElements(driver, FacebookMainPage.class); //page factory
        fbLoginPage = PageFactory.initElements(driver, FacebookLoginPage.class); //page factory
    };

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }

    @Parameters({"language", "browserType"})
    @Test(groups = {"p1"}, dataProvider = "Login", dataProviderClass = FacebookData.class)
    public void FaceBookLoginPage(String email, String password, String errorType) {
        fbMainPage.loadPage();
        fbMainPage.setTtext_EmailLogin(email);
        fbMainPage.setTtext_PasswordLogin(password);
        fbMainPage.click_LoginButton();

        if (StringUtils.isBlank(errorType)) {
            boolean result =  fbLoginPage.checkBoxHeader(errorType);
            assertTrue(!result);
        } else
            assertTrue(driver.getTitle().contains(errorType));
        driver.manage().deleteAllCookies();
    }
}
