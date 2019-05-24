package stepDefinition;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.After;

public class TaggedFeatures_StepDefinition {
	
	@Before(order=0)
	public void setUpCommon()
	{
		System.out.println("Common Setup");
	}

	@When("^test$")
	public void test()
	{
		System.out.println("test background");
	}
	@Before(order=1)
	public void setUpCommon1()
	{
		System.out.println("Common Setup 2");
	}
	@After(order=0)
	public void TearDownCommon()
	{
		System.out.println("Common Tear down");
	}
	@After(order=1)
	public void TearDownCommon1()
	{
		System.out.println("Common Tear down2");
	}

	@Before("@firstTag")
	public void setupFirstTag()
	{
		System.out.println("First Tag setup");
	}
	@Before("@secondTag")
	public void setupSecondTag()
	{
		System.out.println("Second Tag setup");
	}
	@After("@firstTag")
	public void tearDownFirstTag()
	{
		System.out.println("First Tag setup");
	}
	@After("@secondTag")
	public void tearDownSecondTag()
	{
		System.out.println("Second Tag setup");
	}
	
	@Given("^test first step$")
	public void test_first_step()
	{
		System.out.println("this is first step");
	}
	
	@When("^test second step$")
	public void test_second_step()
	{
		System.out.println("test second step");
	}
	
	@Then("^test third step$")
	public void test_third_step()
	{
		System.out.println("test third step");
	}
}
