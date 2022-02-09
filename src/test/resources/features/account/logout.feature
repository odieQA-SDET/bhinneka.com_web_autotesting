Feature: Log Out feature of https://accounts.bhinneka.com/
  As a customer at https://accounts.bhinneka.com/
  After buy some products
  I'd like to finish my activity in my account


  Scenario: Log Out Success
    Given I was on the Login page
    When I filled my email correctly
    When I clicked 'Selanjutnya' button
    When I filled my Password correctly
    When I clicked 'Masuk' button masuk
    And I Clicked icon 'People' button
    And I clicked 'Log Out' button in menu dropp down of icon People
    Then I Went to Homepage of The Bhinneka.com as not member