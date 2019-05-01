package com.facebook.data.data.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import sun.rmi.runtime.Log;

public class FacebookMainPage {

   public static final String PAGE_TITLE = "Facebook – log in or sign up";
   public static final String PAGE_URL = "https://www.facebook.com";
    public static final String HOME_PAGE_TITLE = "Facebook";

   @FindBy(xpath = "//input[@id='email']") WebElement  field_EmailLogin;
   @FindBy(xpath = "//input[@id='pass']") WebElement  field_PasswordLogin;
   public  @FindBy(xpath = "//input[@value='Log In']") WebElement  button_Login;
   @FindBy(xpath="//input[@name='firstname']") WebElement field_FirstName;
   @FindBy(xpath="//input[@name='lastname']") WebElement field_LastName;
   @FindBy(xpath="//input[@name='reg_email__']") WebElement field_Mobile;
   @FindBy(xpath="//input[@name='reg_passwd__']") WebElement field_NewPassword;


    //Selectors of the elements located on the FaceBook Home Page



  WebDriver driver;

  public FacebookMainPage(WebDriver driver) {
      this.driver = driver;
  }

  //Actions
    public void setTtext_EmailLogin (String text) {
        field_EmailLogin.sendKeys(text);
        Assert.assertEquals(field_EmailLogin.getAttribute("value"), text);
    }
     public void setTtext_PasswordLogin (String text){
         field_PasswordLogin.sendKeys(text);
         Assert.assertEquals(field_PasswordLogin.getAttribute("value"), text);

    }

    public void setTtext_FirstNameField(String text) {
        field_FirstName.sendKeys(text);
        Assert.assertEquals(field_FirstName.getAttribute("value"), text);
    }

     public void setTtext_LastNameField (String text){
        field_PasswordLogin.sendKeys(text);
        Assert.assertEquals(field_LastName.getAttribute("value"), text);
        }

     public void setTtext_fieldMobile (String text){
        field_PasswordLogin.sendKeys(text);
        Assert.assertEquals(field_Mobile.getAttribute("value"), text);
        }

    public void setTtext_selectBirthday (String text){
        field_PasswordLogin.sendKeys(text);
        Assert.assertEquals(field_Mobile.getAttribute("value"), text);
    }

    public void setTtext_fieldPassword (String text){
        field_PasswordLogin.sendKeys(text);
        Assert.assertEquals(field_NewPassword.getAttribute("value"), text);
    }
        public void clickOnButton (WebElement element){
        element.click();
        }



}
