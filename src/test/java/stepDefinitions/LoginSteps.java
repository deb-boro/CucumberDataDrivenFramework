package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.TestContext;
import dataProviders.ConfigFileReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import managers.FileReaderManager;
import managers.PageObjectManager;
import managers.WebDriverManager;
import pageObjects.LoginPage;

public class LoginSteps {
	
	WebDriver driver;
//	PageObjectManager pageObjectManager;
	LoginPage loginPage;
//	ConfigFileReader configFileReader;
//	WebDriverManager webDriverManager;
	TestContext testContext;
	
	public LoginSteps (TestContext context) {
		
		testContext = context;
		loginPage = testContext.getPageObjectManager().getLoginPage();
		
	}
	
	
	
	@Given("user login to the application using user name and password")
	public void user_login_to_the_application_using_user_name_and_password() {
		
		
//		webDriverManager = new WebDriverManager();
//		driver = webDriverManager.getDriver();
//		configFileReader = new ConfigFileReader();
//		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
				
		
	//	pageObjectManager = new PageObjectManager(driver);
	//	loginPage = pageObjectManager.getLoginPage();
		loginPage.enter_Username("standard_user");
		loginPage.enter_Password("secret_sauce");
			    
	}

	@When("user clicks on log in button")
	public void user_clicks_on_log_in_button() {
		
//		loginPage = pageObjectManager.getLoginPage();
		loginPage.click_LoginButton(false);
		
		
	   
	}
	
	
	
	
	
	
	
}
