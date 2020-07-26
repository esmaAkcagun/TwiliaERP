
Feature: login
  Background:
    Given the user should be on the login page

  Scenario: login valid credentials
   When the user enters credentials with "eventscrmmanager22@info.com" "eventscrmmanager"
    Then the user should be able login page "Odoo"

    Scenario: login Invalid credentials
      When the user enters credentials with "eventscrmmanager22@info.coma" "eventscrmmanager"
      Then the user shouldn`t be able to login

      @wip
      Scenario: navigate
        When the user enters credentials with "eventscrmmanager22@info.com" "eventscrmmanager"
        When navigate"CRM"
        Then click and hold