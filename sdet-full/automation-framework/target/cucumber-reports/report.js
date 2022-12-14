$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/features/SignIn.feature");
formatter.feature({
  "name": "Shopping Automation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Testing the authentication",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I go to the Website",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.i_go_to_the_Website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Sign In button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.i_click_on_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I specify my credentials and click Login",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.i_specify_my_credentials_and_click_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I can log into the website",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.i_can_log_into_the_website()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[vijay]\u003e but was:\u003c[aruna edupalli]\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:115)\n\tat org.junit.Assert.assertEquals(Assert.java:144)\n\tat automation.glue.StepDefinition.i_can_log_into_the_website(StepDefinition.java:100)\n\tat ✽.I can log into the website(src/main/resources/features/SignIn.feature:6)\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing the purchase of two items",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I go to the Website",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.i_go_to_the_Website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add two elements to the cart",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.i_add_two_elements_to_the_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I proceed to checkout",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.i_proceed_to_checkout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I confirm address, shipping, payment and final order",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.i_confirm_address_shipping_payment_and_final_order()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The elements are bought",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.the_elements_are_bought()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});