package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthPage extends Utility {
    public AuthPage() {
        PageFactory.initElements(driver, this);
    }
    private static final Logger log = LogManager.getLogger(AuthPage.class.getName());

    @CacheLookup

    @FindBy(xpath = "//input[@id='id_gender2']")
    WebElement title;
    @CacheLookup
    @FindBy(xpath = "//input[@id='email_create']")
    WebElement createAccEmail;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[4]/button[1]/span[1]")
    WebElement register;


    @CacheLookup
    @FindBy(xpath = "//input[@id='customer_firstname']")
    WebElement firstName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='customer_lastname']")
    WebElement lastname;

    @CacheLookup
    @FindBy(xpath = "//input[@id='email']")
    WebElement emailField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='passwd']")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//select[@id='days']")
    WebElement date;

    @CacheLookup
    @FindBy(id = "months")
    WebElement month;

    @CacheLookup
    @FindBy(id = "years")
    WebElement year;

    @CacheLookup
    @FindBy(xpath = "//input[@id='optin']")
    WebElement signUpnewsletter;

    @CacheLookup
    @FindBy(xpath = "//input[@id='optin']")
    WebElement receiveSpecialOffer;

    @CacheLookup
    @FindBy(xpath = "//input[@id='firstname']")
    WebElement addressFirstname;
    @CacheLookup
    @FindBy(xpath = "//input[@id='lastname']")
    WebElement addressLastName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='company']")
    WebElement addressCompany;
    @CacheLookup
    @FindBy(xpath = "//input[@id='address1']")
    WebElement addressOfficial;
    @CacheLookup
    @FindBy(xpath = "//input[@id='address1']")
    WebElement addressLine2;
    @CacheLookup
    @FindBy(xpath = "//input[@id='city']")
    WebElement city;
    @CacheLookup
    @FindBy(xpath = "//select[@id='id_state']")
    WebElement state;
    @CacheLookup
    @FindBy(xpath = "//input[@id='postcode']")
    WebElement zipCode;
    @CacheLookup
    @FindBy(xpath = "//select[@id='id_country']")
    WebElement country;
    @CacheLookup
    @FindBy(xpath = "//textarea[@id='other']")
    WebElement addInfo;
    @CacheLookup
    @FindBy(xpath = "//input[@id='phone']")
    WebElement homePhone;
    @CacheLookup
    @FindBy(xpath = "//input[@id='phone_mobile']")
    WebElement mobile;
    @CacheLookup
    @FindBy(xpath = "//input[@id='alias']")
    WebElement addressFutureRef;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'My account')]")
    WebElement myAccount;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]")
    WebElement createAnAccountButton;

    public void clickOnCreateAccoutnButton() {
        clickOnElement(createAnAccountButton);
        log.info("Clicking on CreateAccount"+ createAnAccountButton.toString());
    }

    public void clickOnGenderRadioBtn() {
        clickOnElement(title);
        log.info("Clicking on Gender button" + title.toString());
    }
    public void enterFirstName(String fname) {
        log.info("Enter firstname" + fname + "to firstname field" + firstName.toString());
        sendTextToElement(firstName, fname);
    }
    public void enterLastName(String lname) {
        sendTextToElement(lastname, lname);
        log.info("Enter LastName"+lname+ " to email field "+lastname.toString());

    }
    public void enterAccountEmail(String accmail) {
        sendTextToElement(createAccEmail, accmail);
        log.info("Enter email"+accmail+ " to email field "+createAccEmail.toString());
    }
    public void enterEmail(String mail)
    {
        sendTextToElement(emailField, mail);
        log.info("Enter email"+mail+ " to email field "+emailField.toString());
    }

    public void enterPassword(String pw) {
        sendTextToElement(passwordField, pw);
        log.info("Enter Password "+pw+ " to email field "+emailField.toString());
    }

    public void selectBirthdate(String birthdate) {
        selectByValueFromDropDown(date, birthdate);
        log.info("Selecting day"+birthdate+" from dropdown "+date.toString());
    }

    public void selectBirthMonth(String birthMonth) {
        selectByValueFromDropDown(month, birthMonth);
        log.info("Selecting Month"+birthMonth+" from dropdown "+month.toString());
    }

    public void selectBirthYear(String birthYear) {
        selectByValueFromDropDown(year, birthYear);
        log.info("Selecting Year"+birthYear+" from dropdown "+year.toString());
    }

    public void clickOnSignUpNewsletter() {
        clickOnElement(signUpnewsletter);
        log.info("Clicking on newsletterbox" + signUpnewsletter.toString());
    }

    public void clickOnReceiveOffer() {
        clickOnElement(receiveSpecialOffer);
        log.info("Clicking on Receiving offer" + receiveSpecialOffer.toString());
    }

    public void enteraddresFirstname(String name) {
        sendTextToElement(addressFirstname, name);
        log.info("Enter Firstname"+name+ " to email field "+addressFirstname.toString());
    }

    public void enteraddressLastname(String lanme)
    {
        sendTextToElement(addressLastName, lanme);
        log.info("Enter address Lastname"+lanme+ " to email field "+addressLastName.toString());
    }

    public void enteraddressCompany(String comp) {
        sendTextToElement(addressCompany, comp);
        log.info("Enter address Company"+comp+ " to email field "+addressCompany.toString());
    }

    public void enteraddressOffice(String add){
        sendTextToElement(addressOfficial, add);
        log.info("Enter address office"+add+ " to email field "+addressOfficial.toString());
    }

    public void enteraddressLine2(String addL2){
        sendTextToElement(addressLine2, addL2);
        log.info("Enter addressLine2"+addL2+ " to email field "+addressLine2.toString());
    }

    public void enteraddressCity(String cityname){
        sendTextToElement(city, cityname);
        log.info("Enter address City"+cityname+ "to email field "+city.toString());
    }

    public void selectaddressState(String statename)
    {
        selectByVisibleTextFromDropDown(state, statename);
        log.info("Select address State"+statename+ " to email field "+state.toString());
    }

    public void enteraddressZipCode(String zcode){
        sendTextToElement(zipCode, zcode);
        log.info("Enter address ZipCode"+zcode+ " to email field "+zipCode.toString());
    }

    public void selectaddressCountry(String countryname) {
        selectByVisibleTextFromDropDown(country, countryname);
        log.info("Selecting address Country"+countryname+" from dropdown "+country.toString());
    }

    public void enteraddressAddInfo(String addInform) {
        sendTextToElement(addInfo, addInform);
        log.info("Enter address AddInfo "+addInform+ " to email field "+addInfo.toString());
    }

    public void enteraddressHomephone(String phone) {
        sendTextToElement(homePhone, phone);
        log.info("Enter address Homephone "+phone+ " to email field "+homePhone.toString());
    }

    public void enteraddressMobileephone(String mphone) {
        sendTextToElement(mobile, mphone);
        log.info("Enter address Mobile phone "+mphone+ " to email field "+mobile.toString());
    }

    public void enteraddressfutureRef(String ref) {
        sendTextToElement(addressFutureRef, ref);
        log.info("Enter address for futureRef"+ref+ " to email field "+addressFutureRef.toString());
    }

    public void clickOnRegister() {
        clickOnElement(register);
        log.info("Clicking on Register"+ register.toString());
    }

    public String verifyMyAccount() {
        log.info("Verifying my account text" + myAccount.toString());
        return getTextFromElement(myAccount);
    }

}
