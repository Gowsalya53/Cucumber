package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login {
	WebDriver driver;
	@Given("open newtours application")
	public void open_newtours_application() {
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumdriver\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://www.newtours.demoaut.com/"); 
	}

	@When("user enter username as {string} and psd as {string}")
	public void user_enter_username_as_and_psd_as(String un, String psd) {
		PageObject loginpage = PageFactory.initElements(driver, PageObject.class); 
	
		loginpage.un.sendKeys(un);
	loginpage.psd.sendKeys(psd);   
	}
	@When("click on submit button")
	public void click_on_submit_button() {
		PageObject loginpage = PageFactory.initElements(driver, PageObject.class); 
		loginpage.ok.click();
	}
	@Then("verify login pass")
	public void verify_login_pass() {
		String expected="Find a Flight: Mercury Tours:";
	    String actual=driver.getTitle();
	    Assert.assertEquals(actual, expected);
		driver.close();
	}
}
