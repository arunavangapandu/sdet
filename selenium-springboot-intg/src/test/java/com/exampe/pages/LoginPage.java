package com.exampe.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

// Page Object Model for Login Page
public class LoginPage {

    @FindBy(how = How.NAME, using = "UserName")
    public WebElement txtUserName;

    @FindBy(how = How.NAME, using = "Password")
    public WebElement txtPassword;

    @FindBy(how = How.CSS, using = ".btn-default")
    public WebElement btnLogin;

    public HomePage login(String userName, String password) {
       /* txtUserName.sendKeys(userName);
        txtPassword.sendKeys(password);*/
        System.out.println("username and pasword");
        return new HomePage();
    }

    public void clickLogin() {
        System.out.println("click login");
    }

}
