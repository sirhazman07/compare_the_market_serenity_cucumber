Feature: Request new Insurance quote

  @request_new_quote
  Scenario: user request new car insurance quote
    Given user is on the car insurance home page
    When user starts a new car quote request
    And user provides driver and vehicle information
    Then vehicle insurance quotes results page should be presented to user

#  @gherkin
#  Scenario: Searching for a gherkin
#    Given Sergey is on the DuckDuckGo home page
#    When he searches for "cucumber"
#    Then all the result titles should contain the word "cucumber"

