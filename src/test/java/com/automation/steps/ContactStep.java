package com.automation.steps;

import com.automation.pages.HomePage;
import com.automation.pages.MyContactPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class ContactStep {
    @And("^I am on the contact page$")
    public void iAmOnTheContactPage() {
        new HomePage().clickContactUs();
        new MyContactPage().selectSubjectHeading("Customer service");
        new MyContactPage().inputMessage("Hello");
    }

    @Then("^I send refund request to customer care for previous order$")
    public void iSendRefundRequestToCustomerCareForPreviousOrder() {
        new MyContactPage().clickOnSendButton();
    }
}
