package com.facebook.data.data.data;
import org.testng.annotations.DataProvider;


public class FacebookData {

    //Args: URL, TITLE of Page
    @DataProvider(name="pages")
    public Object[][] pages(){  //X = how many times will test be run, Y= What arguments will we pass into the test
        return new Object[][] {
                {"https://www.facebook.com", "Facebook"},
                {"https://www.google.com", "Google"},
                {"https://yahoo.com", "Yahoo"}
        };

    }
}
