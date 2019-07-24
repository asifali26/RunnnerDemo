Feature: My Validations on American Express

  @Regression
	Scenario: I want to login
		Given I have an account 
		And I will provide the data
		Then My Login success
	@Sanity @Regression 
	Scenario: I want to View my membership
		Given I have logged in
		Then I click on reward points
		And I will check for my rewards
	@Sanity
	Scenario: I want to refer my friend
		Given I am offered with referal bonus
		When I shared the link with my friend 
		Then I will get some zeta points
		And I will enjoy my friday party