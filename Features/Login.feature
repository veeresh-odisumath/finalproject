Feature: Honda bikes in zigwheels

  Scenario: new honda bikes under 4lakhs
    Given The user navigates to zigwheels application
    When user clicks on upcoming bikes
    And user specifies the manufacturer as Honda
    Then user recieves a list of bikes under 4 lakhs
