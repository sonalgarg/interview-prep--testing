package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class GoogleSearch_testStepDef {
	public static WebDriver driver;
	@Before
	public void setup()
	{
		System.out.println("This is setup step");
	}
	
	@After
	public void tearDown()
	{
		System.out.println("This is tear down function");
	}
	
	@Given("^User is on Google Seach Page$")
	public void user_is_on_Home_Page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C://Cucumber jars//Selenium jar//chromedriver.exe");
		driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.google.com");
		}

	@When("^User Search \"(.*)\"$")
	public void user_Navigate_to_LogIn_Page(String serachText) throws Throwable {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(serachText);
		driver.findElement(By.xpath("//input[@name='q']")).submit();
		Thread.sleep(1000);
		driver.navigate().back();
		}

	@When("^User Search text$")
	public void user_Seacrh_text_datatable(DataTable serachText) throws Throwable {
		Thread.sleep(10000);
		List<List<String>> data=serachText.raw();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(data.get(0).get(0));
		driver.findElement(By.xpath("//input[@name='q']")).submit();
		Thread.sleep(1000);
		driver.navigate().back();
		}
	
	@SuppressWarnings("deprecation")
	@Then("^Google Home search box not displayed$")
	public void message_displayed_Login_Successfully() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//input[@name='q']")).isDisplayed());
	}

}
