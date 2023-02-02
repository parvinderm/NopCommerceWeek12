package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

import java.time.Year;

public class RegisterPage extends Utility {

    By registerText=By.xpath("//div[@class='page-title']/h1");
    By  maleFemaleRadioButton= By.linkText("gender-female");
    By firstNameField = By.id("FirstName");
    By lastNameField = By.name("LastName");
    By dateOfBirthDayFromDropdown=By.name("DateOfBirthDay");
    By dateOfBirthMonthFromDropdown=By.name("DateOfBirthMonth");
    By dateOfBirthYearFRomDropdown=By.name("DateOfBirthYear");
    By emailId=By.id("Email");
    By passwordField = By.name("Password");
    By confirmPassword = By.id("ConfirmPassword");
    By registerButton = By.id("register-button");

    By firstNameIsRequired=By.linkText("First name is required.");
    By lastNameIsRequired=By.linkText("Last name is required.");
    By emailIsRequired = By.linkText("Email is required.");
   By passwordIsRequired = By.id("Password-error");
   By errorMessage=By.xpath("//div[@class='message-error validation-summary-errors']");
   By yourRegistrationCompleted = By.xpath("//div[contains(text(),'Your registration completed')]");
   By continueTab = By.linkText("Continue");

   public String getRegisterText(){
       return getTextFromElement(registerText);
   }
   public void selectOnMaleFemaleRadioButton(){
       Reporter.log("click on female radio button"+maleFemaleRadioButton.toString());
       clickOnElement(maleFemaleRadioButton);

   }
     public void  enterFirstNameOnFirstNameField(String name){
       Reporter.log("enter first name "+firstNameField.toString());
       sendTextToElement(firstNameField,name);


   }
      public void enterLastNameOnLastNameField(String name){
         Reporter.log("enter first name "+lastNameField.toString());
         sendTextToElement(lastNameField,name);}




   public void clickOnDateOfBirthdayDropdown(String day ){
       Reporter.log("click on date of birthday"+dateOfBirthDayFromDropdown.toString());
       sendTextToElement(dateOfBirthDayFromDropdown,day);
   }
   public void clickOnDateOfBirthMonthFromDropdown(String month){
       Reporter.log("click on date of birt month"+dateOfBirthMonthFromDropdown.toString());
       sendTextToElement(dateOfBirthMonthFromDropdown,month);
   }
   public void clickOnDateOfBirthYearFromDropdown(String Year){
       Reporter.log("click on date of birth year"+dateOfBirthYearFRomDropdown.toString());
       sendTextToElement(dateOfBirthYearFRomDropdown,Year);
   }
   public void enterEmailIdOnEmailField(String email){
       Reporter.log("enter email id "+ emailId.toString());
       sendTextToElement(emailId,email);

   }
   public void enterPasswordOnPasswordField(String password){
       Reporter.log("enter password "+passwordField.toString());
       sendTextToElement(passwordField,password);
   }
   public void enterPasswordOnConfirmPasswordField(String password){
       Reporter.log("enter password "+confirmPassword.toString());
       sendTextToElement(confirmPassword,password);
   }
   public void clickOnRegisterButton(){
       Reporter.log("click on register button"+registerButton.toString());
       clickOnElement(registerButton);
   }
   public String getFirstNameIsRequiredText(){
       return getTextFromElement(firstNameIsRequired);
   }
   public String getLastNameIsRequiredText(){
       return getTextFromElement(lastNameIsRequired);
   }
   public String getEmailIsRequiredText(){
       return getTextFromElement(emailIsRequired);
   }
   public String getPasswordIsRequiredText(){
       return getTextFromElement(passwordIsRequired);
   }
   public String getErrorMessageText(){
       return getTextFromElement(errorMessage);
   }
   public String getYourRegistrationCompletedText(){
       return getTextFromElement(yourRegistrationCompleted);
   }
   public String verifyContinueTab(){
       return getTextFromElement(continueTab);
   }

}
