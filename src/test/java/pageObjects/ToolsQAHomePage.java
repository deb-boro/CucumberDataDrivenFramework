package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToolsQAHomePage {
	
	WebDriver driver ;
	
	public ToolsQAHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h5[text()='Elements']")
	private WebElement icon_Element;
	
	
	public void click_ElementIcon() {
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click();", icon_Element);
		icon_Element.click();
	}
	

}
