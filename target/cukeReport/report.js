$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/Resources/Features/HomePage.feature");
formatter.feature({
  "line": 3,
  "name": "I want to registration with https://demo.nopcommerce.com",
  "description": "",
  "id": "i-want-to-registration-with-https://demo.nopcommerce.com",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@HomePage"
    }
  ]
});
formatter.before({
  "duration": 8962078846,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "I should be able to complete register with all mandatory field",
  "description": "",
  "id": "i-want-to-registration-with-https://demo.nopcommerce.com;i-should-be-able-to-complete-register-with-all-mandatory-field",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I m on HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I Click on register Button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click on Female Button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter the text First Name",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter text last name",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter DateOfBirth Month and Year",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter valid email address",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I enter Company name",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter password",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I enter confirm password",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click on registration button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I should be able to register succesfully",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDef.i_m_on_HomePage()"
});
formatter.result({
  "duration": 88578170,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDef.i_Click_on_register_Button()"
});
formatter.result({
  "duration": 1480679986,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDef.i_click_on_Female_Button()"
});
formatter.result({
  "duration": 169625197,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDef.i_enter_the_text_First_Name()"
});
formatter.result({
  "duration": 84627399,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDef.i_enter_text_last_name()"
});
formatter.result({
  "duration": 104249237,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDef.i_enter_DateOfBirth_Month_and_Year()"
});
formatter.result({
  "duration": 269942789,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDef.i_enter_valid_email_address()"
});
formatter.result({
  "duration": 160904017,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "MyStepDef.i_enter_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyStepDef.i_enter_confirm_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyStepDef.i_click_on_registration_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyStepDef.i_should_be_able_to_register_succesfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 17261,
  "status": "passed"
});
});