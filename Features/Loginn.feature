Feature: Login
Scenario: Successful Login with Valid credentials
Given User Launch Chrome Browser
When  user opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
And user enters Email as "admin@yourstore.com" and password as "admin"
And click on Login
Then Page Title should be "Dashboard / nopCommerce administration"
When user click on Logout button
Then page title should be "Your store. Login"
And close browser


Scenario Outline: Login Data Driven
Given User Launch Chrome Browser
When  user opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
And user enters Email as "<email>" and password as "<password>"
And click on Login
Then Page Title should be "Dashboard / nopCommerce administration"
When user click on Logout button
Then page title should be "Your store. Login"
And close browser

Examples:
|email|password|
|admin@yourstore.com|admin|
|admin1@yourstore.com|admin123|
