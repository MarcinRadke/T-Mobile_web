package com.example.E2E.TestScenarios;
import com.example.E2E.utils.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ShopSteps {

    HomePage homePage = new HomePage();
    ShopPage shopPage = new ShopPage();
    ProductPage productPage = new ProductPage();
    CartPage cartPage = new CartPage();

    @Given("Browser is opened")
    public void openBrowser() {;
    }

    @When("I navigate to {string}")
    public void openPage(String url) {
        homePage.openHomePage(url);
    }

    @And("I accept cookies")
    public void acceptCookies() {
        homePage.acceptCookies();
    }

    @And("I click on the {string} from top menu")
    public void selectShop(String string) {
        homePage.goToShop();
    }

    @And("I select the {string} from {string} category")
    public void selectCategory(String string, String string2) {
        homePage.selectNoContractPhones();
    }

    @And("I choose the {string} from the list of available phones")
    public void selectDevice(String deviceName) {
        shopPage.selectDevice(deviceName);
    }

    @And("I click on the {string} button")
    public void addToCart(String string) {
        String productPagePrice = productPage.getPriceProduct();
        productPage.addToCart();
        String productCartPrice = cartPage.getPriceCart();
        if (!productPagePrice.equals(productCartPrice)){
            Assert.fail("Price mismatch: Product page price is '" + productPagePrice + "' but cart price is '"
                    + productCartPrice + "'");
        }
    }

    @And("I go to main page")
    public void goHome() {
        homePage.openHomePage("https://www.t-mobile.pl");
    }

    @And("I click on the {string}")
    public void openCart(String string) {
        homePage.openCart();
    }

    @Then("the {string} should be added to my shopping cart")
    public void verifyDevice(String deviceName) {
        cartPage.verifyDeviceInCart(deviceName);
    }
}
