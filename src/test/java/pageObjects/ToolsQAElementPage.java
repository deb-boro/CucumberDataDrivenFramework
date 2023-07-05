package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToolsQAElementPage {
	
	WebDriver driver ;
	
	public ToolsQAElementPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="//span[text()='Text Box']")
	private WebElement listItem_TextBox;
	
	@FindBy(xpath="//*[@id='userName']")
	private WebElement textbox_FullName;
	
	@FindBy(xpath="//*[@id='userEmail']")
	private WebElement textbox_userEmail;
	
	@FindBy(xpath="//textarea[@id='currentAddress']")
	private WebElement textbox_currentAddress;
	
	@FindBy(xpath="//button[@id='submit']")
	private WebElement button_Submit;
	
	
	
	public void click_listItemTextBox(Boolean value) {
		if(!value) listItem_TextBox.click();
	}
	
	public void enter_text_FullName(String userName) {
		textbox_FullName.sendKeys(userName);
	}
	
	public void enter_text_userEmail(String userEmail) {
		
		textbox_userEmail.sendKeys(userEmail);
	}
	
	public void enter_text_currentAddress(String currentAddress) {
		textbox_currentAddress.sendKeys(currentAddress);
	}
	
	
	public void click_submitButton(Boolean value) {
		if(!value) button_Submit.click();
	}
	
	
	
	
	
}
