package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class HomePage extends Utility {
    By computersTab = By.linkText("Computers ");
    By electronicsTab= By.linkText("Electronics ");
    By apparelTab= By.xpath("//div[@class='header-menu']/ul[1]/li[3]/a");
    By digitalDownloadsTab = By.linkText("Digital downloads ");
    By booksTab = By.linkText("Books ");
    By jewelryTab = By.xpath("//div[@class='header-menu']/ul[1]/li[6]/a");
    By giftCardsTab = By.xpath("//div[@class='header-menu']/ul[1]/li[7]/a");
    By loginLink = By.linkText("Log in");
    By registerLink = By.className("ico-register");
    By nopCommerceLogo = By.xpath("//img[@alt='nopCommerce demo store']");
    By myAccountLink = By.linkText("My account");
    By logoutLink = By.className("ico-logout");

    public void clickOnComputersTab() {
        Reporter.log("Click on computers Tab" + computersTab.toString());
        clickOnElement(computersTab);
    }

    public void clickOnElectronicsTab() {
        Reporter.log("Click on electronics link  " + electronicsTab.toString());
        clickOnElement(electronicsTab);
    }
    public void clickOnApparelTab(){
        Reporter.log("Clicking on apparel link"+apparelTab.toString());
      clickOnElement(apparelTab);
    }
    public void digitalDownloadsTab(){
        Reporter.log("Clicking on Digital downloads tab "+ digitalDownloadsTab.toString());
        clickOnElement(digitalDownloadsTab);

    }
    public void booksTab(){
        Reporter.log("clicking on books tab"+booksTab.toString());
        clickOnElement(booksTab);
    }
    public void jewelryTab(){
        Reporter.log("clicking on jewelry tab"+ jewelryTab.toString());
        clickOnElement(jewelryTab);
    }
    public void giftCardsTab(){
        Reporter.log("clicking on gift cards tab "+ giftCardsTab.toString());
        clickOnElement(giftCardsTab);
    }
    public void clickOnLoginLink() {
        Reporter.log("Clicking on login button " + loginLink.toString());
        clickOnElement(loginLink);
    }
    public void clickOnRegisterLink(){
        Reporter.log("Clicking on register link"+ registerLink.toString());
        clickOnElement(registerLink);
    }
    public void nopCommerceLogo(){
        Reporter.log("clicking on nopCommerce logo"+ nopCommerceLogo.toString());
        clickOnElement(nopCommerceLogo);
    }
    public void myAccountLink(){
        Reporter.log("clicking on my account link "+myAccountLink.toString());
        clickOnElement(myAccountLink);
    }
    public String  getLogoutLinkText(){
       return getTextFromElement(logoutLink);
    }

}
