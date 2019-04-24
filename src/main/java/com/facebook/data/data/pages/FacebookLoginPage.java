package com.facebook.data.data.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {

    public static final String PAGE_TITLE = "Facebook";
    public static final String PAGE_URL = "https://www.facebook.com/login.php";


    @FindBy(xpath="//class[@role='alert']") WebElement error_box;

    public boolean checkErrorBox(WebElement box) {
        try {
            return box.isDisplayed();
        } catch(NoSuchElementException e){
            return false;
        }

    }
}


