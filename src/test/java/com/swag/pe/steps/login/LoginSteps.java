package com.swag.pe.steps.login;

import com.swag.pe.pages.login.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginSteps extends LoginPage {

    @Step("Ingresar Usuario")
    public void typeUsername(String username){
        txt_username.sendKeys(username);
    }
    @Step("Ingresar Password")
    public void typePassword(String password){
        txt_password.sendKeys(password);
    }
    @Step("Click en btn Login")
    public void btnLogin (){
        btn_loginButton.click();
    }
}
