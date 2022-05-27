package com.automation.steps;

import com.automation.pages.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginStep {
    @Given("^I am on the Sign In Page$")
    public void iAmOnTheSignInPage() {

    }

    @When("^Login using newly create credentials$")
    public void loginUsingNewlyCreateCredentials() {
        new HomePage().clickOnSignInHeader();
        new SignInPage().enterEmail("tenalirama@gmail.com");
        new SignInPage().enterPassword("abc123");
        new SignInPage().clickOnSignIn();
    }

    @Then("^I shall verify the address information in my address section$")
    public void iShallVerifyTheAddressInformationInMyAddressSection() {
        new MyAccountPage().clickOnMyAddress();
        String[] expected = {"12,main street","Leeds, Ohio 32512","United States"};
        for(int i = 3;i < expected.length;i++){
            System.out.println(new MyAccountPage().getaddressText()[i]);
            Assert.assertEquals("",expected[i],new MyAccountPage().getaddressText()[i]);
        }
    }
}
