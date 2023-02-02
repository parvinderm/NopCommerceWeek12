package com.nopcommerce.testsuite;

import com.nopcommerce.pages.HomePage;
import com.nopcommerce.pages.RegisterPage;
import com.nopcommerce.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase {

    RegisterPage registerPage=new RegisterPage();
    HomePage homepage= new HomePage();

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
        homepage.clickOnRegisterLink();
        String actualMessage = registerPage.getRegisterText();
        String expectedMessage  = "Register";
        Assert.assertEquals(actualMessage, expectedMessage, "Register text verified");
    }
     @Test
     public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory(){
        homepage.clickOnRegisterLink();
        registerPage.clickOnRegisterButton();

        String actualMessage = registerPage.getFirstNameIsRequiredText();
         String  expectedMessage = "First name is required";
        Assert.assertEquals(actualMessage,expectedMessage,"Verified First name is required");
        //verify error message
         String actualMessage2=registerPage.getLastNameIsRequiredText();
         String expectedMessage2 ="First name is required";
         Assert.assertEquals(actualMessage2,expectedMessage2,"Verified Last name is required");
         //Verify error message
        String actualText2= registerPage.getEmailIsRequiredText();
        String expectedText2="Email is required";
        Assert.assertEquals(actualText2,expectedText2,"Verified email is required text");
        //Verify Error message
         String actualText3 = registerPage.getPasswordIsRequiredText();
         String expectedText3 = "Password is required";
         Assert.assertEquals(actualText3,expectedText3,"verified password is required");


    }
      @Test
      public void verifyThatUserShouldCreateAccountSuccessfully(){
        homepage.clickOnRegisterLink();
        registerPage.enterFirstNameOnFirstNameField("sona");
        registerPage.enterLastNameOnLastNameField("patel");
        registerPage.clickOnDateOfBirthdayDropdown("3");
        registerPage.clickOnDateOfBirthMonthFromDropdown("March");
        registerPage.clickOnDateOfBirthYearFromDropdown("1992");
        registerPage.enterEmailIdOnEmailField("radhapatel@gmail.com");
        registerPage.enterPasswordOnPasswordField("123456");
        registerPage.enterPasswordOnConfirmPasswordField("123456");
        registerPage.clickOnRegisterButton();
          String actualMessage=registerPage.getRegisterText();
          String expedctedMessage = "Your registration completed";
          Assert.assertEquals(actualMessage,expedctedMessage,"Login page verified");





      }



}
