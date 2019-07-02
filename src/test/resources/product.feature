Feature: search multiple items


Scenario: search for the product

When user searches for the product
|iphone|
|travel kit|
|headphone|
And verify products displayed
Then Close application

