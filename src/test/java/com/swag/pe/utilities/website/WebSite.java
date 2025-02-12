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
        WebDriverManager.chromedriver().setup();
        WebDriver driver = Serenity.getWebdriverManager().getWebdriver();
        swag.setDefaultBaseUrl(url);
        swag.open();
    }
}
