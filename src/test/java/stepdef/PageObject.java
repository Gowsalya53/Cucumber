package stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PageObject {

	
	static WebDriver driver;
	
	
	@FindBy(name="userName") public static WebElement un;
	@FindBy(name="password") public static WebElement psd;
	@FindBy(name="login") public static WebElement ok;
	
}
