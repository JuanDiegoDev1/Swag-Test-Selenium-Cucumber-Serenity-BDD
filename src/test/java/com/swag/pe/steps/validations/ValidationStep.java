package com.swag.pe.steps.validations;

import com.swag.pe.pages.validations.ValidationPage;
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
}
