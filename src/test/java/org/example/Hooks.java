package org.example;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks extends BasePage {

    BrowserSetup browserSetup = new BrowserSetup();
    LoadProp loadProp = new LoadProp();
    //static String timestamp = new SimpleDateFormat("dd.MM.yy.HH.mm.ss").format(new Date());


    @Before

    public void openBrowser() {
        browserSetup.setUPBrowser();
        driver.get(loadProp.getproperty("url"));
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        //driver.get("https://demo.nopcommerce.com");
    }

    @After


    public void closeBrowser () {

        //driver.close();
    }
}
