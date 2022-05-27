package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Commonpage extends Utility {
    public Commonpage() {
        PageFactory.initElements(driver, this);
    }
    private static final Logger log = LogManager.getLogger(Commonpage.class.getName());




    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'demo_1')]")
    WebElement demo1;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'demo_3')]")
    WebElement demo3;

    @CacheLookup
    @FindBy(xpath = "//p[@id='product_reference']//span")
    WebElement demo;



    public String verifyDemo(String text) {
        if (text == "demo_1") {
            log.info("Clicking on demo_1" + demo1.toString());
            clickOnElement(demo1);
        } else if (text == "demo_3") {
            log.info("Clicking on demo_3" + demo3.toString());
            clickOnElement(demo3);

        }
        return null;
    }

}


