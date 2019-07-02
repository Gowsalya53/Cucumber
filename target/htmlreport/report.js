$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/product.feature");
formatter.feature({
  "name": "search multiple items",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "search for the product",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user searches for the product",
  "rows": [
    {
      "cells": [
        "iphone"
      ]
    },
    {
      "cells": [
        "travel kit"
      ]
    },
    {
      "cells": [
        "headphone"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "ProductSearch.user_searches_for_the_product(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify products displayed",
  "keyword": "And "
});
formatter.match({
  "location": "ProductSearch.verify_products_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close application",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductSearch.close_application()"
});
formatter.result({
  "status": "passed"
});
});