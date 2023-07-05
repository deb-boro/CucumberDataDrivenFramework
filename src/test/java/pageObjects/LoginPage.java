package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		super();
		
		PageFactory.initElements(driver, this);
		
	}
	//PageFactory.initElements(WebDriver, PageObject.Class);
	//improve code readability 
	
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement textbox_username;
	
	
	@FindBy(xpath= "//input[@id='password']")
	private WebElement textbox_password;
	

	@FindBy(xpath="//input[@type='submit']")
	private WebElement button_login;
	
	
	public void enter_Username(String name) {
		textbox_username.sendKeys(name);
	}
	public void enter_Password(String password) {
		textbox_password.sendKeys(password);
	}
	public void click_LoginButton(boolean value) {
		
		if(!value)  button_login.click();
		
	}
	
	
	
}
