Feature: Register a user in Insurance Project and Sign in with registered Credentials

  Scenario: Register a user in Insurance Project!

    Given I navigate to Insurance Page and go Register
 
    
    When I extract data from excel and submit  the user details
 

    Then I should successfully registered
    And Login with registered login 