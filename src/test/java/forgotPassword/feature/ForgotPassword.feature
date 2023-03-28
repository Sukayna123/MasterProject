Feature: Forgot Password Functionality


  Scenario Outline 18:Validate entering invalid format email address into the 'E-Mail Address' field of 'Forgotten Password' page
    Given Navigate to web site
    And Click on Forgotten Password link from Login page
    Then Enter any invalid formatted email address into the "<E-Mail Address>" field
    Examples:
      | E-Mail Address |
      | pavanol        |
      | pavanol@       |
      | pavanol@gmail  |
      | pavanol@gmail. |

Scenario 20: Validate navigating to 'Forgotten Password' page from 'Right Column' options
  Given Navigate to web site
  And   Click on Forgotten Password option from the Right Column
