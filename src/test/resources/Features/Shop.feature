# Marcin Radke
# 04.25.2026
# This feature file describes the scenario of adding a phone to the shopping cart on the T-Mobile Poland website.

Feature: Buying phone on T-Mobile Poland website

    Scenario Outline: Adding phone to shop list
        Given Browser is opened
        When I navigate to "https://www.t-mobile.pl"
        And I accept cookies
        And I click on the "Sklep" from top menu
        And I select the "Bez abonamentu" from "Smartfony" category
        And I choose the "<nazwa_urządzenia>" from the list of available phones
        And I click on the "Dodaj do koszyka" button
        And I go to main page
        And I click on the "Koszyk"
        Then the "<nazwa_urządzenia>" should be added to my shopping cart

        Examples:
            | nazwa_urządzenia  |
            | Huawei Watch FIT 4 Pro |