package com.swag.pe.steps.shopping;

import com.swag.pe.pages.shopping.shoppingCartPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ShoppingCartSteps extends shoppingCartPage {


    @Step("Click en Checkout")
    public void clickCheckoutButton(){
        checkoutButton.click();
    }
    @Step("Ingresar Nombre")
    public void typeFirstName(String firtName){
        firstName.sendKeys(firtName);
    }
    @Step("Ingresar Apellido")
    public void typeLastName(String lastName){
        lastNamess.sendKeys(lastName);
    }
    @Step("Ingresar Codigo Postal")
    public void typeCodigoPostal(String codigoPostal){
        PostalCode.sendKeys(codigoPostal);
    }

    @Step("Click en el boton Continue")
    public void clickContinue(){
        continueButon.click();
    }
    @Step("Click en el boton Finish")
    public void clickFinish(){
        finishButon.click();
    }
}
