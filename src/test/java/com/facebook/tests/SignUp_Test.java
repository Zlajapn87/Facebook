package com.facebook.tests;

import com.facebook.data.data.pages.FacebookMainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SignUp_Test {

    public WebDriver driver;
    FacebookMainPage fbMainPage;


    @BeforeClass(alwaysRun=true)
    public void setup(){

        System.setProperty("webdriver.chrome.driver", "src/main/Drivers/chromedriver.exe");
        driver = new ChromeDriver(); //Driver has to be created before the page.
        fbMainPage = PageFactory.initElements(driver, FacebookMainPage.class); //page factory

    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }

    @Test(groups = {"p1"})
    public void testSignUpMainPage(){
        driver.manage().deleteAllCookies();

        driver.get(fbMainPage.PAGE_URL);
        assertTrue(driver.getTitle().contains(fbMainPage.PAGE_TITLE));
        fbMainPage.setTtext_FirstNameField("QA");
        fbMainPage.setTtext_LastNameField("Zlaja");
        fbMainPage.setTtext_fieldMobile("validEmail@facebook.com");
        fbMainPage.setTtext_fieldPassword("password");
    }

}
