package com.nopcommerce.testsuite;

import com.nopcommerce.pages.BuildYourOwnComputerPage;
import com.nopcommerce.pages.ComputerPage;
import com.nopcommerce.pages.DesktopPage;
import com.nopcommerce.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputerPageTest extends TestBase {

    ComputerPage computerPage=new ComputerPage();
    DesktopPage desktopPage=new DesktopPage();
   BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();

    @Test
    public void verifyUserShouldNavigateToComputerPageSuccessfully(){
        computerPage.clickOnComputersTab();
        String actualMessage= computerPage.getComputersText();
        String expectedMessage = "Computers";
        Assert.assertEquals(actualMessage,expectedMessage,"Computers Text is verified");

    }
     @Test
     public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
        computerPage.clickOnComputersTab();
        computerPage.clickOnDesktopLink();
         String actualMessage= desktopPage.getDesktopText();
         String expectedMessage = "Desktop";
         Assert.assertEquals(actualMessage,expectedMessage,"Login page verified");
    }
      @Test
      public void verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(){
        computerPage.clickOnComputersTab();
        computerPage.clickOnDesktopLink();
        buildYourOwnComputerPage.clickOnBuildYourOwnComputer();
        buildYourOwnComputerPage.selectFirstOptionFromDropDown("2.2 GHz Intel Pentium Dual-Core E2200");
        buildYourOwnComputerPage.selectThirdOptionFromRam("8GB [+$60.00]");
        buildYourOwnComputerPage.selectOnRadioButtonFromHdd("320 GB");
        buildYourOwnComputerPage.clickOnRadioButtonFromOs();
        buildYourOwnComputerPage.clickOnCheckBoxes();
        buildYourOwnComputerPage.clickOnAddToCartButton();
          String actualMessage= buildYourOwnComputerPage.verifyTheProductHasBeenAddedToYourShoppingCart();
          String expectedMessage = "The Product has been added to your shopping cart";
          Assert.assertEquals(actualMessage,expectedMessage,"Text Verified");









      }

}
