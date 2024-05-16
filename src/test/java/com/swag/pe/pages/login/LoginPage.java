package com.swag.pe.pages.login;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {
    @FindBy(id="user-name")
    protected WebElement txt_username;

    @FindBy(id="password")
    protected WebElement txt_password;

    @FindBy(id="login-button")
    protected WebElement btn_loginButton;


}
