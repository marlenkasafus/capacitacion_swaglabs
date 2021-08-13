Feature: Product purchase
  As a user
  I want to purchase a product
  To be fashionable

  Scenario: Successful purchase
    Given that the user wants to enter the website
    And he enters his username "standard_user" and his password "secret_sauce"
    When he selects the product "Sauce Labs Bike Light"
    Then the shopping cart should increase the products to "1"