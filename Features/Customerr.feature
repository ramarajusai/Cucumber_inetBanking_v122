Feature: Customer

Scenario: Add new Customer

Given User Launch Chrome Browser
When  user opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
And user enters Email as "admin@yourstore.com" and password as "admin"
And click on Login
Then User can view dashboard
When User click on Customers menu
And Click on Customers menu item
And Click on Add new button
Then User can view Add new customer page
When User enter Customer info
And Click on Save button
Then User can view confirmation message "The new customer has been added successfully."



