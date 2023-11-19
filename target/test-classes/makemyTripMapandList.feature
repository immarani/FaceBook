Feature: Book the Hotel in Make My TripListandMap
Background: Launching make my Trip
Given -Launch MakeMyTrip Applications "https://www.makemytrip.com/"
When User close the advertisement popups



Scenario: Book Rooms in Hotel
When User clicks on Hotelclicks
And User enters the locations
|Bangalore|Delhi|Mumbai|
And User selects the Check-In date select
And User selects the Check-Out date select
And user selects the Rooms&Guest click
And User clicks on Search click
Then verify the locationSelect,Check-In date select,Check-Out date select,Rooms&Guest click

Scenario: Book Rooms in AcHotel
When User clicks on Hotels
And User enters the locationplaces
|value1|Bangalore|
|value2|Delhi|
|value3|Chennai|
And User selects the Check-In date avaliable
And User selects the Check-Out dates
And user selects the Rooms&Guest family
And User clicks on Searchbutton
Then verify the locationplace,Check-In date avaliable,Check-Out dates,Rooms&Guest family

