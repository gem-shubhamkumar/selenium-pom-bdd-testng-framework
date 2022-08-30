# Author - Shubham Kumar
Feature: Placing an order
  @PlaceOrder @Test
  Scenario Outline: Login and place an order successfully
    Given launch the site and login with '<Username>' and '<Password>'
    And verify the products page
    When add a '<Product>' into cart
    And goto the cart page and verify product details and checkout
    Then fill the form with '<FirstName>' '<LastName>' and '<ZipCode>' and continue
    And verify the checkout page and place the order
    And verify the successful message
    And logout the user


    Examples:
      | Username      | Password     | Product           | FirstName | LastName | ZipCode |
      | standard_user | secret_sauce | Sauce Labs Onesie | Test      | Name     | 267364  |