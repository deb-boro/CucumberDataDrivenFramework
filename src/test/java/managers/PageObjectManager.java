package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.LoginPage;
import pageObjects.ProductListPage;
import pageObjects.ToolsQAElementPage;
import pageObjects.ToolsQAHomePage;

public class PageObjectManager {
	
	private WebDriver driver;
	private LoginPage loginPage;
	private ProductListPage productListPage;
	private ToolsQAHomePage toolsQAHomePage;
	private ToolsQAElementPage toolsQAElementPage;

	public PageObjectManager(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	
	public LoginPage getLoginPage() {
		
		if (loginPage==null) {
			loginPage = new LoginPage(driver);	
		}
		
		return loginPage;
	}
	
	public ProductListPage getProductListPage() {
		
		if (productListPage==null) {
			productListPage = new ProductListPage(driver);
		}
		return productListPage;
	}
	
	
	public ToolsQAHomePage getToolsQAHomePage() {
		if(toolsQAHomePage ==null) {
			toolsQAHomePage = new ToolsQAHomePage(driver);
		}
		return toolsQAHomePage;
	}
	
	public ToolsQAElementPage getToolsQAElementPage() {
		if(toolsQAElementPage ==null) {
			toolsQAElementPage = new ToolsQAElementPage(driver);
		}
		return toolsQAElementPage;
	}
	
	
	

}
