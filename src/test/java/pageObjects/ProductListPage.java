package pageObjects;

import static org.junit.Assert.assertEquals;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductListPage {
	
	 WebDriver driver;
	 WebDriverWait wait ;
	
	
	
	public ProductListPage (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public ProductListPage(WebDriverWait wait, WebDriver driver) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(3));
	}

	
	
	
	@FindBy(xpath="//div[text()='Swag Labs']")
	private WebElement logo_SwagLabs;
	
	@FindBy(xpath="//span[text()='Products']")
	private WebElement heading_name_Product;
	
	
	@FindBy(name="add-to-cart-sauce-labs-backpack")
	private WebElement button_atToCart_Backpack;
	
	public void verify_HomePage(String name) {
		
		
		assertEquals(name,logo_SwagLabs.getText());
	}
	
	public void verify_PageName(String name) {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOf(heading_name_Product));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(name,heading_name_Product.getText());
	}
	
	public void click_Button_atToCart_Backpack(Boolean value) {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOf(button_atToCart_Backpack));
		
		if(!value)  button_atToCart_Backpack.click();
		
	}
	
	
	
	

}
