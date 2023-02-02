package com.nopcommerce.testsuite;

import com.nopcommerce.pages.DesktopPage;
import com.nopcommerce.pages.HomePage;
import com.nopcommerce.pages.LoginPage;
import com.nopcommerce.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    HomePage homepage= new HomePage();
    LoginPage loginPage=new LoginPage();


    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        homepage.clickOnLoginLink();
        String actualMessage = loginPage.getWelcomeText();
        String expectedMessage = "Welcome, Please Sign In!";
        Assert.assertEquals(actualMessage, expectedMessage, "Login page verified");

    }
    @Test
      public void verifyTheErrorMessageWithInValidCredentials(){
        homepage.clickOnLoginLink();
        loginPage.enterEmailId("sona@gmail.com");
        loginPage.enterPassword("123");
        loginPage.clickOnLoginButton();
        String actual = loginPage.getErrorMessage();
        String expected = "Login was unsuccessful.Please correct the errors and try again.No customer account found";
          Assert .assertEquals(actual,expected,"error message with invalid credentials");
    }
       @Test
        public void verifyThatUserShouldLoginSuccessFullyWithValidCredentials(){
        homepage.clickOnLoginLink();
        loginPage.enterEmailId("radhapatel@gmail.com");
        loginPage.enterPassword("123456");
        loginPage.clickOnLoginButton();
        String actual = homepage.getLogoutLinkText();
        String expected = "Log out";
        Assert.assertEquals(actual,expected,"Logout link verified");

       }
       @Test
       public void verifyThatUserShouldLogoutSuccessfully(){
        homepage.clickOnLoginLink();
        loginPage.enterEmailId("radhapatel@gmail.com");
        loginPage.enterPassword("123456");
        loginPage.clickOnLoginButton();
        loginPage.clickOnLogoutButton();
        String actual = loginPage.getLogInLinkText();
        String expected="Log in";
        Assert.assertEquals(actual,expected,"Log in Link Verified");


       }













}
