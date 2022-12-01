package com.exampe.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

// website toa automate - eaapp.somee.com
public class HomePage {

    @FindBy(how = How.LINK_TEXT, using = "Login")
    public WebElement lnkLogin;

    @FindBy(how = How.LINK_TEXT, using = "Employee List")
    public WebElement  lnkEmployeeList;

    public LoginPage signOn() {
        //lnkLogin.click();
        System.out.println("click login");
        return new LoginPage();
    }

    public void clickEmployeeList() {
        lnkEmployeeList.click();
    }

}
