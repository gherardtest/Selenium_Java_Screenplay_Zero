Feature: I as user of Utest
  I want to create a new register
  to access as user

  Scenario: Successful user creation
    Given user in the home page
    When user create an account filling all fields
    Then user sees its username