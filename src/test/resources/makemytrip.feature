Feature: Book the Hotel in Make My Trip
Scenario: Book Rooms in Hotel
Given -Launch MakeMyTrip Application
When User close the advertisement popup
And User clicks on Hotel
And User enters the location
And User selects the Check-In date
And User selects the Check-Out date
And user selects the Rooms&Guest
And User clicks on Search
Then verify the location,Check-In date,Check-Out date,Rooms&Guest

