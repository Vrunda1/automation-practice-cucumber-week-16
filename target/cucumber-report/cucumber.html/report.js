$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("account.feature");
formatter.feature({
  "line": 1,
  "name": "Account Test",
  "description": "",
  "id": "account-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10859218500,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "TC-004 Contact customer service for the previous successful order",
  "description": "",
  "id": "account-test;tc-004-contact-customer-service-for-the-previous-successful-order",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 29,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "I am on the Sign In Page",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "Login using newly create credentials",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "I am on the contact page",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I send refund request to customer care for previous order",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.iAmOnTheSignInPage()"
});
formatter.result({
  "duration": 122757700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.loginUsingNewlyCreateCredentials()"
});
formatter.result({
  "duration": 8794962800,
  "status": "passed"
});
formatter.match({
  "location": "ContactStep.iAmOnTheContactPage()"
});
formatter.result({
  "duration": 5766903200,
  "status": "passed"
});
formatter.match({
  "location": "ContactStep.iSendRefundRequestToCustomerCareForPreviousOrder()"
});
formatter.result({
  "duration": 4928350800,
  "status": "passed"
});
formatter.after({
  "duration": 156700,
  "status": "passed"
});
});