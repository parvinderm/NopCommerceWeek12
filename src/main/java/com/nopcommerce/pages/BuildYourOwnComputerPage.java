package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class BuildYourOwnComputerPage extends Utility {
    By buildYourOwnComputer=By.linkText("Build your own computer");
    By BuildYourOwnComputerText = By.xpath("//a[contains(text(),'Build your own computer')]");
    By selectFirstOptionFromProcessor = By.id("product_attribute_1");
    By selectThirdOptionFromRam = By.id("product_attribute_2");
    By radioButtonHdd= By.id("product_attribute_3_6");
    By clickOnRadioButtonFromOs = By.id("product_attribute_4_8");
    By clickOnCheckBoxes = By.id("product_attribute_5_10");
    By clickOnAddToCartButton=By.id("add-to-cart-button-1");
    By TheProductHasBeenAddedToYourShoppingCartText=By.xpath("//div//p[contains(text(),'The product has been added to your ')]");
       public void clickOnBuildYourOwnComputer(){
           Reporter.log("click on Build on your own computer"+buildYourOwnComputer.toString());
           clickOnElement(buildYourOwnComputer);
       }
     public String getBuildYourOwnComputerText(){
    return getTextFromElement(BuildYourOwnComputerText);
}
    public void selectFirstOptionFromDropDown(String option){
         Reporter.log("select option from dropdown"+selectFirstOptionFromProcessor.toString());
         selectByVisibleTextFromDropDown(selectFirstOptionFromProcessor,option);
    }
    public void selectThirdOptionFromRam(String option){
         Reporter.log("select on third option"+selectThirdOptionFromRam.toString());
         selectByVisibleTextFromDropDown(selectThirdOptionFromRam,option);

    }
    public void selectOnRadioButtonFromHdd(String option){
         Reporter.log("click on radio button from hdd"+radioButtonHdd.toString());
         selectByVisibleTextFromDropDown(radioButtonHdd,option);
    }
    public void clickOnRadioButtonFromOs(){
         Reporter.log("click on os button"+clickOnRadioButtonFromOs.toString());
         clickOnElement(clickOnRadioButtonFromOs);
    }
    public void clickOnCheckBoxes(){
         Reporter.log("click on check boxes"+clickOnCheckBoxes.toString());
         clickOnElement(clickOnCheckBoxes);
    }
    public void clickOnAddToCartButton(){
         Reporter.log("click on add to cart button"+clickOnAddToCartButton.toString());
         clickOnElement(clickOnAddToCartButton);
    }
    public String verifyTheProductHasBeenAddedToYourShoppingCart(){
       return getTextFromElement(TheProductHasBeenAddedToYourShoppingCartText);
    }


}
