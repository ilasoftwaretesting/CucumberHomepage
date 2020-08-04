package org.example;

import org.openqa.selenium.By;

public class RegisterPage extends Utils {
    LoadProp loadProp = new LoadProp();

    private By Gender = By.id("gender-female");
    private By FirstName = By.id("FirstName");
    private By LastName = By.id("LastName");
    private By dayDropList = By.xpath("//div[@class='date-picker-wrapper']/select[1]");
    private By monthDropList = By.xpath("//select[@name='DateOfBirthMonth']");
    private By yearDropList = By.xpath("//select[@name='DateOfBirthYear']");
    String emailtimeStamp="Test"+timeStamp()+"@gmail.com";
    private By Email = By.id("Email");
    private By CompanyName = By.xpath("//input[@name='Company']");
    private By Password = By.id("Password");
    private By ConfirmPassword = By.xpath("//input[@name='ConfirmPassword']");
    private By Register=By.id("register-button");

    public void gender(){
        waitForElementToBeDisplay(Gender, 20);
        ClickOnElement(Gender);
    }

    public void firstName()
    {
       enterText(FirstName,loadProp.getproperty("FirstName"));
    }

    public void lastName(){

        enterText(LastName,loadProp.getproperty("LastName"));
    }
    public void Birthdate(){
        enterText(dayDropList,loadProp.getproperty("dayDropList"));
        waitForElementToBeDisplay(monthDropList,10);
        enterText(monthDropList,loadProp.getproperty("monthDropList"));
        enterText(yearDropList,loadProp.getproperty ("yearDropList"));
    }
    public void EnterEmail(){
        enterText(Email,emailtimeStamp);
    }
    public void CompanyName(){
        enterText(CompanyName,loadProp.getproperty("CompanyName"));
    }
    public void EnterPassword(){
        enterText(Password,loadProp.getproperty("Password"));
    }
    public void confirmPassword(){
        enterText(ConfirmPassword,loadProp.getproperty("ConfirmPassword"));
    }
    public void register(){
        ClickOnElement(Register);
    }
}

