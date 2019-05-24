package PageObject;

import javax.lang.model.element.Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

	WebElement element=null;
	
	@FindBy(how = How.XPATH,using="//input[@name='q']")
	public static WebElement googleInputBox;
	
	
}
