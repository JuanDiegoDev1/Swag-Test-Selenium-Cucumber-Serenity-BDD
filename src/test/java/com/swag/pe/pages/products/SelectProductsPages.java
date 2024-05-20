package com.swag.pe.pages.products;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SelectProductsPages extends PageObject {

    @FindBy(xpath = "//button[@class='btn_primary btn_inventory']")
    protected List<WebElementFacade> products;

    @FindBy(xpath = "//*[local-name()='svg']//ancestor::a")
    protected WebElementFacade shoopingCartItem;

}
