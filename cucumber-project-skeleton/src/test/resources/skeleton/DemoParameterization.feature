Feature: Test me parameterization

	Scenario Outline: Test me login for multiple users 
		Given I am launching test me application in chrome
		And I click on the sign in link
		When I provide username "<Uname>"
		And I provide password "<Password>"
		Then I click on Login button and verify the status

	Examples:
		|Uname    | Password|
		|asdfgh   | asdfgh|
		|asdfgh   | asdfgh|
		|raina124 | raina123|