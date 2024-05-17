
Feature:validate the login feature

  #Scenario:validate the login feature with username and password
  #Given user is on login page
  #When  user enters valid username "Abhishek@567"
  #And   user enters valid password "Abhishek"
  #Then  clicks on submit
  #
  
  
  @abhishek
  Scenario Outline: Title of your scenario outline
    Given user is on login page
    When  user enters valid username "<name>"
    And   user enters valid password "<password>" 
    Then  clicks on submit 

    Examples: 
      | name  | password | 
      | Abhishek@567 | @BHISHEK   | 
      | chintu@567   |   CHINTU   |
      |annaldas@567  | ANNALDAS   | 