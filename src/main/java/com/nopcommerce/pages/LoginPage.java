package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class LoginPage extends Utility {
    By emailField = By.id("Email");

    By passwordField= By.name("Password");
    By loginButton=By.xpath("//button[contains(text(),'Log in')]");
    By welcomeText =By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By errorMessage = By.xpath("//div[@class='message-error validation-summary-errors']");
    By logoutButton=By.className("ico-logout");
    By logInLinkText=By.className("ico-login");

    public void enterEmailId(String email){
        sendTextToElement(emailField,email);
    }

    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String getWelcomeText(){
        return getTextFromElement(welcomeText);
    }
    public String getErrorMessage(){
        return getTextFromElement(errorMessage);
    }
    public void clickOnLogoutButton(){
        Reporter.log("click on logout button"+logoutButton.toString());
        clickOnElement(logoutButton);
    }
    public String getLogInLinkText(){
        return getLogInLinkText();
    }
}
