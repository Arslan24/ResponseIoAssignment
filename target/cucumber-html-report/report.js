$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/featureFiles/01SearchItem.feature");
formatter.feature({
  "name": "\u0027When I go to the home page, and search for an item, I expect to see some reference to that item in the result summary.\u0027",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Users are able to search for an item using the search bar",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is navigate to homePage",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefination.SearchItemSteps.the_user_is_on_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user type the \"Printed Chiffon Dress\" in the search bar",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefination.SearchItemSteps.the_user_searched_Item(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the search Icon",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.SearchItemSteps.search_Click()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"PRINTED CHIFFON DRESS\" dress displayed",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.SearchItemSteps.validate_search_Results(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Users are able to filter search results under Women category by Color and Category",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is navigate to homePage",
  "keyword": "Given "
});
formatter.step({
  "name": "user click on \"WOMEN\" category",
  "keyword": "When "
});
formatter.step({
  "name": "user select any value from the \u0027\u003cColor\u003e\u0027 and \u0027\u003cCategory\u003e\u0027 filter item",
  "keyword": "Then "
});
formatter.step({
  "name": "Validate that the results returned matches the filter criteria",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Color",
        "Category"
      ]
    },
    {
      "cells": [
        "Yellow",
        "Dresses"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Users are able to filter search results under Women category by Color and Category",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is navigate to homePage",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefination.SearchItemSteps.the_user_is_on_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on \"WOMEN\" category",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefination.SearchItemSteps.click_Category(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select any value from the \u0027Yellow\u0027 and \u0027Dresses\u0027 filter item",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.SearchItemSteps.choose_Category(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate that the results returned matches the filter criteria",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.SearchItemSteps.validate_filters_Applied()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Users are able to view the details of any clothing item from the POPULAR section and add them to the cart",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is navigate to homePage",
  "keyword": "Given "
});
formatter.step({
  "name": "user Select any item from from the \u0027\u003cPOPULAR\u003e\u0027 section and add them to the cart",
  "keyword": "When "
});
formatter.step({
  "name": "Validate that the item has successfully been added to the cart",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "POPULAR"
      ]
    },
    {
      "cells": [
        "Blouse"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Users are able to view the details of any clothing item from the POPULAR section and add them to the cart",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is navigate to homePage",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefination.SearchItemSteps.the_user_is_on_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Select any item from from the \u0027Blouse\u0027 section and add them to the cart",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefination.AddToCartSteps.item_add_to_Cart(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate that the item has successfully been added to the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.AddToCartSteps.validate_match_results()"
});
formatter.result({
  "status": "passed"
});
});