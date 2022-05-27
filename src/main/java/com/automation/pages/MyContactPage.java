package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyContactPage extends Utility {
    public MyContactPage() {
        PageFactory.initElements(driver, this);
    }
    private static final Logger log = LogManager.getLogger(MyContactPage.class.getName());

    @CacheLookup
    @FindBy (id = "id_contact")
    WebElement subjectHeadingDropdown;

    @CacheLookup
    @FindBy (name = "id_order")
    WebElement orderReferenceDropdown;
    @CacheLookup
    @FindBy (id = "message")
    WebElement messageBox;
    @CacheLookup
    @FindBy (xpath = "//span[text()='Send']")
    WebElement sendButton;

    public void selectSubjectHeading(String subject){
        log.info("choose a subject heading : " + subject + "<br>");
        selectByVisibleTextFromDropDown(subjectHeadingDropdown, subject);
    }
    public void chooseAnOrderReference(){
        log.info("choose a order reference : "  + "<br>");
        selectByIndexFromDropDown(orderReferenceDropdown, 1);
    }
    public void inputMessage(String message){
        log.info("input refund message : " + message + "<br>");
        sendTextToElement(messageBox, message );
    }

    public void clickOnSendButton(){
        log.info("click on send button : " + sendButton.toString() + "<br>");
        clickOnElement(sendButton);
    }




}
