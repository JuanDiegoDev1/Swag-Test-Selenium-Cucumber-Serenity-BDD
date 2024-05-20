package com.swag.pe.pages.shopping;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class shoppingCartPage extends PageObject {


    @FindBy(xpath = "//a[@class='btn_action checkout_button']")
    protected WebElementFacade checkoutButton;

    @FindBy(id = "first-name")
    protected WebElementFacade firstName;
    @FindBy(id = "last-name")
    protected WebElementFacade lastNamess;
    @FindBy(id = "postal-code")
    protected WebElementFacade PostalCode;
    @FindBy(xpath = "//input[@class='btn_primary cart_button']")
    protected WebElementFacade continueButon;

    @FindBy(xpath = "//a[@class='btn_action cart_button']")
    protected WebElementFacade finishButon;
}
