package com.swag.pe.steps.validations;

import com.swag.pe.pages.validations.ValidationPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class ValidationStep extends ValidationPage {

    @Step("Validar visualización del modulo de productos")
    public Boolean titleIsVisible(){
        return lbl_product.isVisible();
    }
    @Step("Validar vizualización del mensaje de error")
    public Boolean errorMessageIsDisplayed(){
        return lbl_errorMessages.isVisible();
    }

    @Step("Validar los productos listados en el carrito")
    public Boolean productsAreDisplayed(){
        for (WebElementFacade products:productsList){
            if (products.isDisplayed()){
                return true;
            }
        }
        return false;
    }

    @Step("Validar que el carrito este vacio de productos")
    public  Boolean shoppingCartisEmpty(){
        for (WebElementFacade product:productsList){
            if(!product.isDisplayed()){
                return false;
            }
        }
        return true;
    }

    @Step("Validar finalizacion de orden")
    public Boolean orderTextIsDisplayed(){
        return lbl_order.isDisplayed();
    }
}
