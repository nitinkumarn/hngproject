Feature: Login functionalities 

 @Login @One
Scenario: Verify whether user is able to login with valid credentials
	Given I launch the application
	And I navigate to Account Login page
	When I login to application using username "7204940016" and password "123456"
	Then I should see that user is able to login successfully
