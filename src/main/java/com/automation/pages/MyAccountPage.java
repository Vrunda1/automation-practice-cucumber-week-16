package com.automation.pages;


import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MyAccountPage extends Utility {

    public MyAccountPage() {
        PageFactory.initElements(driver, this);
    }

    private static final Logger log = LogManager.getLogger(MyAccountPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]")
    WebElement womentopMenu;

    @CacheLookup
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")
    WebElement dressTopMenu;
    @CacheLookup
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]")
    WebElement tshirtsTopMenu;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    WebElement signIn;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'My addresses')]")
    WebElement myAddress;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='last_item item box']//li")
    List<WebElement> myAddressText;
    @CacheLookup
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[1]/a[1]/img[1]")
    WebElement logoLink;


    public void clickOnMyAddress() {
        clickOnElement(myAddress);
        log.info("Clicking on MyAddress" + myAddress.toString());
    }


    public void clickOnWomenHeader() {
        clickOnElement(womentopMenu);
        log.info("Clicking on WomenHeader" + womentopMenu.toString());
    }

    public void clickOndressHeader() {
        clickOnElement(dressTopMenu);
        log.info("Clicking on dressHeader" + dressTopMenu.toString());
    }

    public void clickOnTshirtsHeader() {
        clickOnElement(tshirtsTopMenu);
        log.info("Clicking on TshirtsHeader" + tshirtsTopMenu.toString());
    }

    public void clickOnSignInHeader() {
        clickOnElement(signIn);
        log.info("Clicking on SignInHeader" + signIn.toString());
    }

    public void clickOnLogo() {
        clickOnElement(logoLink);
        log.info("Clicking on Logo" + logoLink.toString());
    }

    public String[] getaddressText() {
        String[] x = new String[8];
        for (int i = 3; i < myAddressText.size() - 1; i++) {
            String y = myAddressText.get(i).getText();
            x[i - 1] = y;

        }
        return x;
    }
}