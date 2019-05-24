Feature: Tagged hook test features

Background:first background test
	Given test

@firstTag
Scenario: Test first scenario
	Given test first step
	When test second step
	Then test third step
	
@secondTag
Scenario: Test second scenario
	Given test first step
	When test second step
	Then test third step
	