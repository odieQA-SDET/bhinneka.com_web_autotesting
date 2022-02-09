Feature: Login feature in https://accounts.bhinneka.com/
  As a customer at bhinneka.com
  I want to buy my needs
  So that I have to be a member first

  Scenario: Login Success
    Given I was on the Login page
    When I filled my email correctly
    When I clicked 'Selanjutnya' button
    When I filled my Password correctly
    When I clicked 'Masuk' button masuk
    Then I have been on the homepage of bhinneka.com as member


