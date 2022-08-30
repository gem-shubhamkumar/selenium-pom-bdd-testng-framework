Feature: Failed to Login

  @LoginFail @Test
  Scenario Outline: Login failed
    Given launch the site and login with '<Username>' and '<Password>'
    And verify the products page

    Examples:
      | Username        | Password     |
      | locked_out_user | secret_sauce |