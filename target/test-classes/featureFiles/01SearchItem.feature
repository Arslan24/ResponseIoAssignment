Feature: 'When I go to the home page, and search for an item, I expect to see some reference to that item in the result summary.'

  Scenario: Users are able to search for an item using the search bar
    Given User is navigate to homePage
    When user type the "Printed Chiffon Dress" in the search bar
    Then click on the search Icon
    And "PRINTED CHIFFON DRESS" dress displayed

  Scenario Outline: Users are able to filter search results under Women category by Color and Category
    Given User is navigate to homePage
    When user click on "WOMEN" category
    Then user select any value from the '<Color>' and '<Category>' filter item
    And Validate that the results returned matches the filter criteria
    Examples: 
      | Color  | Category |
      | Yellow | Dresses  |

  Scenario Outline: Users are able to view the details of any clothing item from the POPULAR section and add them to the cart
    Given User is navigate to homePage
    When user Select any item from from the '<POPULAR>' section and add them to the cart
    Then Validate that the item has successfully been added to the cart
    Examples: 
      | POPULAR |
      | Blouse |
