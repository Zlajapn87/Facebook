package com.facebook.data.data.pages;

import com.facebook.data.data.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import sun.rmi.runtime.Log;

public class FacebookMainPage extends BasePage {


    public static final String HOME_PAGE_TITLE = "Facebook";

   @FindBy(xpath = "//input[@id='email']") WebElement  field_EmailLogin;
   @FindBy(xpath = "//input[@id='pass']") WebElement  field_PasswordLogin;
   @FindBy(xpath = "//input[@value='Log In']") WebElement  button_Login;
   @FindBy(xpath="//input[@name='firstname']") WebElement field_FirstName;
   @FindBy(xpath="//input[@name='lastname']") WebElement field_LastName;
   @FindBy(xpath="//input[@name='reg_email__']") WebElement field_Mobile;
   @FindBy(xpath="//input[@name='reg_email_confirmation__']") WebElement field_reMobile;
   @FindBy(xpath="//input[@name='reg_passwd__']") WebElement field_NewPassword;
   @FindBy(xpath="//select[@id='day']") WebElement dropdownDay;
   @FindBy(xpath="//select[@id='month']") WebElement dropdownMonth;
   @FindBy(xpath="//select[@id='year']") WebElement dropdownYear;

   @FindBy(xpath="//input[@name='sex' and @value='2']") WebElement radioMale;

   @FindBy(xpath="//button[@name='websubmit']") WebElement buttonSignUp;


  public FacebookMainPage(WebDriver driver) {
     super(driver);
     this.PAGE_TITLE = "Facebook – log in or sign up";
     this.PAGE_URL = "https://www.facebook.com";
  }
    public void setTtext_EmailLogin (String text) {
        setElementText(field_EmailLogin, text);
    }

     public void setTtext_PasswordLogin (String text){
         setElementText(field_PasswordLogin, text);
    }

    public void click_LoginButton(){
        clickElement(button_Login);
    }

    public void setTtext_FirstNameField(String text) {
        setElementText(field_FirstName, text);
    }

     public void setTtext_LastNameField (String text){
        setElementText(field_LastName, text);
        }

     public void setTtext_fieldMobile (String text){
        setElementText(field_Mobile, text);
    }

    public void setTtext_fieldReMobile (String text){
        setElementText(field_reMobile, text);
    }

    public void selectMonth (String value){
        selectValueInDropdown(dropdownMonth, value);
    }

    public void selectDay (String value){
        selectValueInDropdown(dropdownDay, value);
    }

    public void selectYear (String value){
        selectValueInDropdown(dropdownYear, value);
    }

    public void setTtext_fieldPassword (String text){
        setElementText(field_NewPassword, text);
    }

    public void click_GenderButton(){
        clickElement(radioMale);
    }

    public void click_SignUpButton(){
      clickElement(buttonSignUp);
    }
}
