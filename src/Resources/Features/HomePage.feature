@HomePage

Feature: I want to registration with https://demo.nopcommerce.com

  Scenario: I should be able to complete register with all mandatory field

    Given I m on HomePage
    When  I Click on register Button
    And I click on Female Button
    And I enter the text First Name
    And I enter text last name
    And I enter DateOfBirth Month and Year
    And I enter valid email address
    And I enter Company Name
    And I enter password
    And I enter confirm password
    And I click on registration button
    Then I should be able to register succesfully
