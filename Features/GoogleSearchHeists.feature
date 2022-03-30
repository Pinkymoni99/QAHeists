Feature: perform a google search

Scenario Outline: simple keyword search

Given I am on google homepage
When I enter a search "<keyword>"
And I click on search button
Then I see the number of results return

Examples:
|keyword              |
|Quality Assurance    |
|Software Testing     |