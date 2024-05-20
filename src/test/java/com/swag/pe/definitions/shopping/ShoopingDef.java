package com.swag.pe.definitions.shopping;

import com.swag.pe.steps.products.SelectProductsSteps;
import com.swag.pe.steps.shopping.ShoppingCartSteps;
import com.swag.pe.steps.validations.ValidationStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class ShoopingDef {

    @Steps(shared = true)
    SelectProductsSteps selectProduct;

    @Steps(shared = true)
    ValidationStep validate;
    @Steps(shared = true)
    ShoppingCartSteps shoppingCart;

    @And("agrega productos al carrito de compras")
    public void userAddProducts(){
        selectProduct.addProducts(3);
    }
    @And("da Click en icono del carrito")
    public void userClickShoopingCartItems(){
        selectProduct.ClickShoopingCartIcon();
    }
    @Then("el sistema deberia listar los productos agregados en el carrito de compras")
    public void systemListProducts(){
        Assert.assertTrue(validate.productsAreDisplayed());
    }
    @Then("el sistema deberia mostrar la cesta sin productos")
    public void systemShowEmptyShoppingCart(){
        Assert.assertTrue(validate.shoppingCartisEmpty());
    }

    @When("completa  todo el registro de la orden")
    public void userCompleteOrder(){
        shoppingCart.clickCheckoutButton();
        shoppingCart.typeFirstName("diego");
        shoppingCart.typeLastName("garcia");
        shoppingCart.typeCodigoPostal("15000");
        shoppingCart.clickContinue();
        shoppingCart.clickFinish();
    }

    @Then("el sistema deberia procesar la compra")
    public void systemProcessShoppingCart(){
        Assert.assertTrue(validate.orderTextIsDisplayed());
    }
}
