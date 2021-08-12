Feature: Login
  As a swaglabs user
  I want to log in with username and password
  So that enter the website


  Scenario: successful login
    Given that the user wants to enter the website
    When he enters his username "standard_user" and his password "secret_sauce"
    Then he can see "PRODUCTS" on the main screen