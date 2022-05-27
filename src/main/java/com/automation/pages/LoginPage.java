package com.automation.pages;


import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {
    public LoginPage() {
        PageFactory.initElements(driver,this);
    }
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @CacheLookup

    @FindBy(xpath="//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(id="Email")
    WebElement emailField;

     @CacheLookup
    @FindBy(name="Password")
          WebElement passwordField;
      @CacheLookup
    @FindBy(xpath ="//button[contains(text(),'Log in')]")
           WebElement loginButton;
   @CacheLookup
   @FindBy(xpath="//div[@class='message-error validation-summary-errors']")
   WebElement errorMessage;

    public String getWelcomeText() {
        log.info("getting Welcome Text from "+welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public void enterEmailId(String email) {

        sendTextToElement(emailField, email);
        log.info("Enter email"+email+ " to email field "+emailField.toString());
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
        log.info("Enter Password"+password+ " to email field "+passwordField.toString());
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        log.info("Clicking on LoginButton"+ loginButton.toString());
    }

    public String getErrorMessage() {
        log.info("getting ErrorMessage "+errorMessage.toString());
        return getTextFromElement(errorMessage);
    }
}
