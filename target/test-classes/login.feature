Feature: Login test


Scenario: Login into online app
Given open newtours application
When user enter username as "mercury" and psd as "mercury"
And click on submit button
Then verify login pass