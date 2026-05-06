package StepDefinitions;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.WebDriverRunner;

public class HomePage {

    private SelenideElement sklepMenu = $$("a").findBy(text("Sklep"));
    private SelenideElement koszykButton = $("button[aria-label*='Koszyk']");

    public void acceptCookies(){
        SelenideElement acceptCookiesBtn = $$("button").findBy(text("Akceptuję"));
        acceptCookiesBtn.shouldBe(visible).click();
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