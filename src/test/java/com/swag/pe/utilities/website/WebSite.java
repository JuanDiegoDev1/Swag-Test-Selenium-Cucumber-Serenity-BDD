package com.swag.pe.utilities.website;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.core.pages.PageObject;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebSite {

    @Steps(shared=true)
    PageObject swag;

    @Step("Navegar al sitio web")
    public void navigateTo(String url) {
        // Configura el ChromeDriver usando WebDriverManager
        WebDriverManager.chromedriver().setup(); // Puedes cambiar a edgedriver() si prefieres usar Edge
        // Inicializa el navegador Chrome (o Edge)
        WebDriver driver = new ChromeDriver(); // Cambia a EdgeDriver() si prefieres usar Edge

        try {
            // Establece la URL base
            swag.setDefaultBaseUrl(url);
            swag.open();
        } finally {
            driver.quit();
        }
    }
}
