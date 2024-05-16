package com.swag.pe.definitions;

import com.swag.pe.steps.login.LoginSteps;
import com.swag.pe.steps.validations.ValidationStep;
import com.swag.pe.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;


public class LoginDef {

    @Steps(shared=true)
    WebSite url;

    @Steps(shared=true)
    LoginSteps login;

    @Steps(shared=true)
    ValidationStep validate;

    @Given("el usuario navega al sitio web")
    public void userNavigateTo(){
        url.navigateTo("https://www.saucedemo.com/v1/index.html");
    }
    @When("ingresa credenciales validas")
    public void userLoginWithValidCredentials(){
        login.typeUsername("standard_user");
        login.typePassword("secret_sauce");
        login.btnLogin();
    }

    @Then("la apliación deberia mostrar el modulo principal de productos")
    public void systemShowProductsModule(){
        Assert.assertTrue(validate.titleIsVisible());
    }

    @When("ingresa credenciales invalidads")
    public void userLoginWithInvalidCredentials(){
        login.typeUsername("standard_user");
        login.typePassword("123456");
        login.btnLogin();
    }
    @Then("la aplicacón deberia mostrar un mensaje error")
    public void systemShowErrorMessage(){
        Assert.assertTrue(validate.errorMessageIsDisplayed());
    }
}
