package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import managers.FileReaderManager;


public class Hooks {
	
	TestContext testContext;

	public Hooks(TestContext testContext) {
		super();
		this.testContext = testContext;
	}
	
	
	@Before
	public void BeforeSteps() {
		/*
		 * starting the browser 
		 * Navigate to certain page
		 */
		
		testContext.getWebDriverManager()
		.getDriver().get(FileReaderManager
				.getInstance().getConfigReader().getApplicationUrl());
	//	testContext.getPageObjectManager().getLoginPage().enter_Username("standard_user");
	//	testContext.getPageObjectManager().getLoginPage().enter_Password("secret_sauce");
	//	testContext.getPageObjectManager().getLoginPage().click_LoginButton(false);
			    
	}
	
	@After
	public void AfterSteps() {
		
		testContext.getWebDriverManager().closeDriver();
		
		
		
		
		
	}
	
	
	

}
