package com.example.E2E.utils;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$;

public class ProductPage {

    private SelenideElement addToCartBtn = $$("button").findBy(text("Dodaj do koszyka"));

    public String getPriceProduct(){
        return $("span.actualText").shouldBe(visible).getText();
    }

    public void addToCart() {
        addToCartBtn.shouldBe(visible).click();
    }
}