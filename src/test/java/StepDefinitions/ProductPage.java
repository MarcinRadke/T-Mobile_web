package StepDefinitions;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.sleep;

public class ProductPage {

    private SelenideElement addToCartBtn = $$("button").findBy(text("Dodaj do koszyka"));

    public void addToCart() {
        addToCartBtn.shouldBe(visible).click();
    }
}