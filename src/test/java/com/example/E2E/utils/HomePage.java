package com.example.E2E.utils;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

import com.codeborne.selenide.WebDriverRunner;

public class HomePage {

    private SelenideElement sklepMenu = $$("a").findBy(text("Sklep"));
    private SelenideElement koszykButton = $("button[aria-label*='Koszyk']");

    public void acceptCookies(){
        sleep(5000);
        SelenideElement acceptCookiesBtn = $$("button").findBy(text("Akceptuję"));
        if (acceptCookiesBtn.exists()) {
            acceptCookiesBtn.shouldBe(visible).scrollIntoView(true).click();
        }
    }

    public void openHomePage(String url) {
        open(url);
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }

    public void goToShop() {
        sklepMenu.hover();
    }

    public void selectNoContractPhones() {
        $$("a").findBy(text("Bez abonamentu")).click();
    }

    public void openCart() {
        koszykButton.click();
    }
}