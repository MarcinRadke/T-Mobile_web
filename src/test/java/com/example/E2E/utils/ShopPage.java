package com.example.E2E.utils;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.sleep;

import org.junit.Assert;

public class ShopPage {

    public void selectDevice(String deviceName) {
        if (!$$("a[aria-label*='" + deviceName + "']").isEmpty()) {
            $$("a[aria-label*='" + deviceName + "']").first().scrollIntoView(true).click();
            return;
        }

        while ($$("button, a[role='button']").findBy(exactText("Załaduj więcej")).exists()) {
            $$("button, a[role='button']").findBy(exactText("Załaduj więcej")).scrollIntoView(true).click();
            sleep(2000);
            if (!$$("a[aria-label*='" + deviceName + "']").isEmpty()) {
                break;
            }
        }

        if ($$("a[aria-label*='" + deviceName + "']").isEmpty()) {
            Assert.fail("Device '" + deviceName + "' not found in the shop");
        }

        $$("a[aria-label*='" + deviceName + "']").first().scrollIntoView(true).click();
    }
}