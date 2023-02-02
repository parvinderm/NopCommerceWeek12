package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class DesktopPage extends Utility {

    By desktopsText=By.xpath("//div[@class='page-title']/h1");
    By sortByTab =By.xpath("//div[@class='product-sorting']/span");
    By positionAtoZ=By.id("products-orderby");
    By displayDropdownTab =By.id("products-pagesize");

    By selectProductListLocators=By.xpath("//a[@class='viewmode-icon list']");

    public String getDesktopText(){
        return getTextFromElement(desktopsText);
    }
    public void setSortByTab(){
        Reporter.log("set sort by tab"+sortByTab.toString());
        getTextFromElement(sortByTab);

    }
    public void clickOnSortByDropDownPositionTab(){
        Reporter.log("click on position tab "+positionAtoZ.toString());
        clickOnElement(positionAtoZ);
    }

    public void clickOnDisplayDropdownTab(){
        Reporter.log("click on diplay dropdown tab"+displayDropdownTab.toString());
        clickOnElement(displayDropdownTab);
    }
    public void clickOnSelectListProductListLocators(){
       Reporter.log("click on select product list locators"+selectProductListLocators);
       clickOnElement(selectProductListLocators);
    }

}
