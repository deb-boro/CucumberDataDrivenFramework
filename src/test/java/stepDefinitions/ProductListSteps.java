package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import dataProviders.ConfigFileReader;

import io.cucumber.java.en.Then;
import managers.FileReaderManager;
import managers.PageObjectManager;
import managers.WebDriverManager;
import pageObjects.LoginPage;
import pageObjects.ProductListPage;

public class ProductListSteps {
	
	WebDriver driver;
//	PageObjectManager pageObjectManager;
	ConfigFileReader configFileReader;
//	WebDriverManager webDriverManager;
	ProductListPage productListPage;
//	LoginPage loginPage;
	TestContext testContext;
	
	public ProductListSteps(TestContext context) {
		testContext = context;
		productListPage = testContext.getPageObjectManager().getProductListPage();
		
	}
	
	
	
	@Then("user verify home page title as {string} and Page name as {string}")
	public void user_verify_home_page_title_as_and_Page_name_as(String pageTitle, String pageName)  {
	   

//		webDriverManager = new WebDriverManager();
//		driver = webDriverManager.getDriver();
	//	configFileReader = new ConfigFileReader();
	//	driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());

//		pageObjectManager = new PageObjectManager(driver);
//		loginPage = pageObjectManager.getLoginPage();
//		loginPage.enter_Username("standard_user");
//		loginPage.enter_Password("secret_sauce");
//		loginPage.click_LoginButton(false);
			    
		
	//	productListPage = pageObjectManager.getProductListPage();
		productListPage.verify_HomePage(pageTitle);
		try {
			productListPage.verify_PageName(pageName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
		@Then("user clicks on Sauce Labs Backpack Add to Cart Button")
		public void user_clicks_on_Sauce_Labs_Backpack_Add_to_Cart_Button() {
		    
			productListPage.click_Button_atToCart_Backpack(false);
			
			
			
		}



}
