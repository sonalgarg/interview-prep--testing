Feature: Google search page test
Descriptin: This file will check search feature

Scenario: Successful search on google 
	* User is on Google Seach Page
	* User Search "Mark"

	@tag2
	Scenario Outline: Sucessful search and go back to previous page 
    * User is on Google Seach Page	
	When User Search "<data>" 
	Examples: 
		|data|
		|Sonal|
		|Iva|

		
	Scenario: Sucessful search and go back to previous page using data table
	 Given User is on Google Seach Page
	When User Search text
	|vishal|