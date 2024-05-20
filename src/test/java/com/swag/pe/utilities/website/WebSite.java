package com.swag.pe.utilities.website;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebSite {

    @Steps(shared = true)
    PageObject swag;

    @Step("Navegar al sitio web")
    public void navigateTo(String url) {
        // Configura automáticamente el controlador del navegador
        WebDriverManager.chromedriver().setup();
        //WebDriverManager.chromedriver().driverVersion("124.0.6367.203").setup();
        // Inicializa el navegador
        WebDriver driver = Serenity.getWebdriverManager().getWebdriver();
        // Establece la URL base
        swag.setDefaultBaseUrl(url);
        // Abre la página
        swag.open();
    }
}
