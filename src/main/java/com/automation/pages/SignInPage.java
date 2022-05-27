package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends Utility {
    public SignInPage() {
        PageFactory.initElements(driver,this);
    }
    private static final Logger log = LogManager.getLogger(SignInPage.class.getName());
    @CacheLookup
    @FindBy(xpath="//input[@id='email']")
    WebElement emailField;

    @CacheLookup
    @FindBy(xpath="//input[@id='passwd']")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath="//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]")
    WebElement signInButton;
    @CacheLookup
    @FindBy(xpath="//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]")
    WebElement createAnAccountButton;
    @CacheLookup
    @FindBy(xpath="//h1[contains(text(),'Authentication')]")
    WebElement authentificationText;
    @CacheLookup
    @FindBy(xpath="//h3[contains(text(),'Create an account')]")
    WebElement createAnAccountText;
    @CacheLookup
    @FindBy(xpath="//div[@class='alert alert-danger']//li")
    WebElement errorMessage;
    @CacheLookup
    @FindBy(xpath = "//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]")
    WebElement signOut;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    WebElement signInTextafterLogOut;
    @CacheLookup
    @FindBy(xpath = "//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]")
    WebElement signOutVerifyText;
    @CacheLookup
    @FindBy(xpath = "//a[@title='Log me out']")
    WebElement signOutButton;

    public void enterEmail(String email) {
        sendTextToElement(emailField, email);
        log.info("Enter email"+email+ " to email field "+emailField.toString());
    }
    public void enterPassword(String pw)
    { log.info("Enter Password"+pw+ " to email field "+passwordField.toString());

        sendTextToElement(passwordField, pw);
    }
    public void clickOnSignIn()
    {
        clickOnElement(signInButton);
        log.info("Clicking on SignIn"+ signInButton.toString());
    }
    public void clickOnCreateAccoutnButton()
    {
        clickOnElement(createAnAccountButton);
        log.info("Clicking on CreateAccoutnButton"+ createAnAccountButton.toString());
    }
    public String getAuthentificationText1()
    {
        log.info("getting Authentification text from "+authentificationText.toString());
        return getTextFromElement(authentificationText);
    }
    public String getCreateAnAccountText()
    {
        log.info("getting CreateAnAccount text from "+createAnAccountText.toString());
        return getTextFromElement(createAnAccountText);
    }
    public void signInToApplication(String username,String password){
        enterEmail(username);
        enterPassword(password);
        clickOnSignIn();
    }
    public String getErrorMsg(){
        log.info("getting Error text from "+errorMessage.toString());
        return getTextFromElement(errorMessage);
    }
    public void clickOnSignOutLink() {
        clickOnElement(signOut);
        log.info("Clicking on SignOutLink"+ signOut.toString());
    }
    public String verifySignOut(){
        log.info("getting signout from "+signOutButton.toString());
        return getTextFromElement(signOutButton);
    }
    public String verifySignInText(){
        log.info("getting signIn text from "+signInTextafterLogOut.toString());
        return getTextFromElement(signInTextafterLogOut);
    }
}
