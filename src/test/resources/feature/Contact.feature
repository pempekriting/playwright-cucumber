@Web
Feature: Contact

  @SendMessage
  Scenario: Send message to other people
    Given User go to website
    And click contact menu
    When User fill the form
    Then Message successfully send

  @SendMessage2
  Scenario: Send message to other people
    Given User go to website
    And click contact menu
    When User fill the form
    Then Message successfully send
