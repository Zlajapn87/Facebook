package com.facebook.data.data.pages;

import com.facebook.data.data.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage extends BasePage {

    @FindBy(xpath="//div[@id='header_block']") WebElement boxHeader;
    @FindBy(xpath="//div[@role=\"alert\"]/div") WebElement alertBoxHeader;

    public FacebookLoginPage(WebDriver driver) {
        super(driver);
        this.PAGE_TITLE = "Facebook";
        this.PAGE_URL = "https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=111";
    }

    public boolean checkBoxHeader(String text) {
        try {
            return (boxHeader.getText().equals(text)); //compare the values between two strings

        } catch(NoSuchElementException e){

            return false;
        }
    }


    public void moveToElement(WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();

    }
}


