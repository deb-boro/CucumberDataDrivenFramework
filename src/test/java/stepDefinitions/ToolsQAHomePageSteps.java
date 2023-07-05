package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.When;
import pageObjects.ToolsQAHomePage;

public class ToolsQAHomePageSteps {
	
		TestContext testContext;
		ToolsQAHomePage toolsQAHomePage;
		
		public ToolsQAHomePageSteps(TestContext testContext) {
			this.testContext = testContext;
			
			toolsQAHomePage = testContext.getPageObjectManager().getToolsQAHomePage();
			
		}

		@When("user clicks on Element icon on home page")
		public void user_clicks_on_Element_icon_on_home_page() {
			
			toolsQAHomePage.click_ElementIcon();
			
			
		}
		
	
}
