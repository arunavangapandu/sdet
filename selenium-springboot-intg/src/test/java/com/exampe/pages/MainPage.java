package com.exampe.pages;

public class MainPage {

    private LoginPage loginPage;
    private HomePage homepage;

    public MainPage(LoginPage loginPage, HomePage homepage) {
        this.loginPage = loginPage;
        this.homepage = homepage;
    }

    public void performLogin() {
        homepage.signOn();
        loginPage.login("aruna", "hello");
        loginPage.clickLogin();
    }
}
