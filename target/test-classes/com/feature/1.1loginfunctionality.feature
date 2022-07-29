Feature: Hotel booking with adactin functionaity

Scenario: Checking login functionality
Given user launches the application
When user enters the username in username field
And user enters the password in password field 
Then user cicks the login button and navigates to the serach Hotel Page

Scenario: Search hotel functionality
When user selects location from the dropdown
And user selects the hotel from the dropdown
And user selects the roottype from the dropdown
And user selects the number of room
And user selects the checkin date
And user selects the checkout date
And user selects the adults per room
And user selects the children per room
Then user clicks the search button and user navigate to the select hotel page

Scenario: Select hotel functionality
When user clicks the radio button
Then user clicks the search bitton and navigate to the book a hotel page

Scenario: Book a hotel functionality
When user enter the first name
And user enters the last name
And user enters the billing address 
And user enters thev credit card no.
And user selects the credit card type from the dropdown
And user selects the month and year of the expiry date from the dropdown
And user enters the CVV number 
Then user clicks the booknow button and navigate to booking confirmation page

Scenario: Booking confirmation functionality 
When user clicks the booked itinerary and navigate to booked itinerary page
Then user enters the log out button