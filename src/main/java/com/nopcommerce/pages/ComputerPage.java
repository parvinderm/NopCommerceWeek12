package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class ComputerPage extends Utility {
     By computersTab = By.linkText("Computers ");
    By computersText=By.xpath("//div[@class='page-title']");
    By desktopsTab = By.xpath(" //div[@class='page-body']/div[1]/div[1]/div[1]/div[1]/h2/a");
    By notebooksTab = By.linkText(" Notebooks ");
    By softwareTab=By.linkText(" Software ");

    public void clickOnComputersTab(){
        Reporter.log("click on computers tab"+computersTab.toString());
        clickOnComputersTab();
    }

    public  String getComputersText(){
        return getTextFromElement(computersText);
    }
    public void clickOnDesktopLink(){
        Reporter.log("Click on desktop link"+ desktopsTab.toString());
        clickOnElement(desktopsTab);
    }
    public void clickOnNotebooksLink(){
        Reporter.log("Click on notebooks link"+ notebooksTab.toString());
        clickOnElement(notebooksTab);
    }
    public void clickOnSoftwareLink(){
        Reporter.log("Click on software link "+ softwareTab.toString());
        clickOnElement(softwareTab);
    }


}
