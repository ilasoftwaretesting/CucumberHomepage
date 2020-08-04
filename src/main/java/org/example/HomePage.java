package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils{

    private By register = By.className("ico-register");



    public void registratiOnButton() {
        ClickOnElement(register);
    }
}
