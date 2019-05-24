package PageTestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import PageObject.HomePage;

public class PageTestClass1 {

	static WebDriver driver;
	public static void main(String[] a) 
	{
		System.setProperty("webdriver.chrome.driver", "C://Cucumber jars//Selenium jar//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
		HomePage HomePage=PageFactory.initElements(driver, HomePage.class);
		HomePage.googleInputBox.sendKeys("hello");
	}
}
