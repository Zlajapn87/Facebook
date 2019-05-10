package com.facebook.tests;

import com.facebook.data.data.pages.FacebookMainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

public class SignUp_Test {

    public WebDriver driver;
    public WebDriverWait wait;
    FacebookMainPage fbMainPage;


    @BeforeClass(alwaysRun=true)
    public void setup(){

        System.setProperty("webdriver.chrome.driver", "src/main/Drivers/chromedriver_74.exe");
        driver = new ChromeDriver(); //Driver has to be created before the page.
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 5, 500);
        fbMainPage = PageFactory.initElements(driver, FacebookMainPage.class); //page factory

    }

  /*  @AfterClass(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }*/

    @Test(groups = {"p1"})
    public void testSignUpMainPage() throws InterruptedException {
        driver.manage().deleteAllCookies();

        fbMainPage.loadPage();
        fbMainPage.setTtext_FirstNameField("QA");
        fbMainPage.setTtext_LastNameField("Zlaja");
        fbMainPage.setTtext_fieldMobile("validEmail@facebook.com");
        fbMainPage.setTtext_fieldReMobile("validEmail@facebook.com");
        fbMainPage.setTtext_fieldPassword("password");
        fbMainPage.selectDay("20");
        fbMainPage.selectMonth("5");
        fbMainPage.selectYear("1987");
        fbMainPage.click_GenderButton();
        fbMainPage.click_SignUpButton();

        Thread.sleep(1000);
    }

}
