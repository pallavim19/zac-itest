@zacTest
Feature: To test web page of Zoo Adoption Center (zac)

  Scenario Outline: US1 Enter the name in Text field and adopt an animal. After animal is adopted
   successful message is displayed

    Given I open webpage of Zoo Adoption Center
    When I enter '<name>' in the text field
    And Below the text field '<name>' is displayed
    And I click continue button
    And I select '<animal>' from drop down list
    And I click continue button
    And The confirmation text is valid and matches to expected message
    And I click on back button
    And I enter '<name>' in the text field
    And Below the text field '<name>' is displayed
    And I click continue button
    And I select '<other animal>' from drop down list
    And I click continue button
    Then The confirmation text is valid and matches to expected message

    Examples:
      | name | animal | other animal |
      | Mark | 1      |    1         |
      | 123  | 2      |    1         |
      | !-   | 3      |    1         |
      |      | 0      |    0         |