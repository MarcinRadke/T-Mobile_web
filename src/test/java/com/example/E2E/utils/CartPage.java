package com.example.E2E.utils;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CartPage {

    public void returnToMainPage(String deviceName) {
        $("img[alt*='przejdź na stronę główną']").shouldBe(visible).click();
    }

    public void verifyDeviceInCart(String deviceName) {
        $$("h2, h3").findBy(text(deviceName)).shouldBe(visible);
    }

    public String getPriceCart(){
        return $("span[data-qa='BKT_Activation']").shouldBe(visible).getText();
    }
}