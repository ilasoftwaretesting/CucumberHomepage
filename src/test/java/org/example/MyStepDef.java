package org.example;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.net.URL;

public class MyStepDef extends BasePage{
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();


    @Given("^I m on HomePage$")
    public void i_m_on_HomePage() {
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://demo.nopcommerce.com/");
        System.out.println("user successfully landed on homepage");
    }
    @When("^I Click on register Button$")
    public void i_Click_on_register_Button() {
        homePage.registratiOnButton();
        String registersuccessfully = driver.findElement(By.className("page-title")).getText();
        Assert.assertEquals(registersuccessfully, "Register");
        System.out.println("user able to register successfully");
    }

    @When("^I click on Female Button$")
    public void i_click_on_Female_Button() {
        registerPage.gender();

    }

    @When("^I enter the text First Name$")
    public void i_enter_the_text_First_Name() {
        registerPage.firstName();

    }

    @When("^I enter text last name$")
    public void i_enter_text_last_name()  {
        registerPage.lastName();
    }

    @When("^I enter DateOfBirth Month and Year$")
    public void i_enter_DateOfBirth_Month_and_Year() {
        registerPage.Birthdate();
    }

    @When("^I enter valid email address$")
    public void i_enter_valid_email_address(){
        registerPage.EnterEmail();
    }
    @When("^I enter Company Name$")
    public void i_enter_Company_Name(){
        registerPage.CompanyName();
    }
    @When("^I enter password$")
    public void i_enter_password() {
        registerPage.EnterPassword();
    }

    @When("^I enter confirm password$")
    public void i_enter_confirm_password(){
        registerPage.confirmPassword();
    }
    @When("^I click on registration button$")
    public void i_click_on_registration_button() {
        registerPage.register();
    }
    @Then("^I should be able to register succesfully$")
    public void i_should_be_able_to_register_succesfully() {
        String registercompleted = driver.findElement(By.cssSelector("div[class='result']")).getText();
        Assert.assertEquals(registercompleted, "Your registration completed");
        System.out.println("user able to complete register successfully");


    }

}
