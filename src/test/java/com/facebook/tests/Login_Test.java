package com.facebook.tests;

import com.facebook.data.data.data.FacebookData;
import com.facebook.data.data.pages.FacebookMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login_Test {

    public WebDriver driver;

    FacebookMainPage fbMainPage;

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\zlatk\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver(); //Driver has to be created before the page.
        fbMainPage = PageFactory.initElements(driver, FacebookMainPage.class); //page factory
    }

    ;
/*
    @AfterClass(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }
*/

    @Test(groups = {"p2"})
    public void loadPage() {
        driver.get(fbMainPage.PAGE_URL);
        Assert.assertEquals(driver.getTitle(), fbMainPage.PAGE_TITLE);
    }

    @Test(groups = {"p2"})
    public void filloutEmailFld() {
        driver.get(fbMainPage.PAGE_URL);
        fbMainPage.setTtext_EmailLogin("zlajapn@hotmail.com");
    }

    @Test(groups = {"p2"})
    public void filloutPwdFld() {
        driver.get(fbMainPage.PAGE_URL);
        fbMainPage.setTtext_PasswordLogin("Zlaja2020");

    }

    @Test(groups = {"p1"})
    public void FaceBookLoginPage() {
        driver.get(fbMainPage.PAGE_URL);
        fbMainPage.setTtext_EmailLogin("zlajapn@hotmail.com");
        fbMainPage.setTtext_PasswordLogin("Zlaja2020");
        fbMainPage.clickOnButton(fbMainPage.button_Login);
        Assert.assertEquals(driver.getTitle(), fbMainPage.HOME_PAGE_TITLE);


    }
}