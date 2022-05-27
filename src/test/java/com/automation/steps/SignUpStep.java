package com.automation.steps;

import com.automation.pages.AuthPage;
import com.automation.pages.HomePage;
import com.automation.pages.SignInPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignUpStep {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {

    }


    @Then("^I Navigate to SignUp page$")
    public void iNavigateToSignUpPage() {
        new HomePage().clickOnSignInHeader();

    }

    @And("^create an account with random username$")
    public void createAnAccountWithRandomUsername() {
        new AuthPage().enterAccountEmail("tenalirama@gmail.com");
        new AuthPage().clickOnCreateAccoutnButton();
      //  new AuthPage().enterAccountEmail("Jayshriram1@gmail.com");
        new AuthPage().clickOnGenderRadioBtn();
        new AuthPage().enterFirstName("Ram");
        new  AuthPage().enterLastName("Krishna");
        new AuthPage().enterPassword("abc123");
        new AuthPage().selectBirthdate("10");
        new AuthPage().selectBirthMonth("10");
        new AuthPage().selectBirthYear("1998");
        new AuthPage().enteraddresFirstname("Mr.Krishna");
        new AuthPage().enteraddressLastname("Rama");
        new AuthPage().enteraddressCompany("10,Java Road");
        new AuthPage().enteraddressLine2("12,main street");
        new AuthPage().enteraddressCity("Leeds");
        new AuthPage().selectaddressState("Ohio");
        new AuthPage().enteraddressZipCode("32512");
        new AuthPage().selectaddressCountry("United States");
        new AuthPage().enteraddressAddInfo("Nothing");
        new AuthPage().enteraddressHomephone("0778456323");
        new AuthPage().enteraddressMobileephone("0157432712");
        new AuthPage().enteraddressfutureRef("15,Liverpool Street");
        new AuthPage().clickOnRegister();

    }
    }

//    @And("^create an account with random username$")
//    public void createAnAccountWithRandomUsername() {
//

