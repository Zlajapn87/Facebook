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

    //Args: Login Credentials
    @DataProvider(name="Login")
    public Object[][] Login(){  //X = how many times will test be run, Y= What arguments will we pass into the test
        return new Object[][] {
                {"0655676440", "Zlaja2020", null}, //Positive TC
                {"", "Test","Log in to Facebook" }, //Negative TC
               // {"test@test.com", "Test","Test user login from external network" }


        }; //Please try again later "Test user login from external network"
    }
}
