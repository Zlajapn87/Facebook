package com.facebook.data.data;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static org.testng.Assert.*;

public class BasePage {

    public String PAGE_URL;
    public String PAGE_TITLE;

    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;

    }

    public void loadPage(){
        driver.get(getPageUrl());
        assertTrue(driver.getTitle().contains(getPageTitle()));
    }

    public void clickElement(WebElement element){
        element.click();
    }

    public void setElementText(WebElement element, String text){
       element.clear();
       element.sendKeys(text);
       assertEquals(element.getAttribute("value"), text);
    }

    public void selectValueInDropdown(WebElement dropdown, String value) {
        Select select = new Select(dropdown);
        select.selectByValue(value);
    }

    public String getPageUrl(){
        return PAGE_URL;
    }

    public String getPageTitle(){
        return PAGE_TITLE;
    }

}
