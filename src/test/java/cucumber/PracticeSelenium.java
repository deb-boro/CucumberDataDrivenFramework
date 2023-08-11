package cucumber;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class PracticeSelenium {


	public static void main(String[] args) throws AWTException {
		
//		WebDriver driver = null;
//		
//		
//		
//		
//		System.setProperty("WebDriver.gecko.driver", "");
//		
//		driver = new FirefoxDriver();
//		
//		// 5 exception 
//		//timeout exception 
//		//element not found exception
//		//no alert present exception 
//		//no such window exception 
//		//webdriver exception.
//		//stale element exception - present in DOM but not in UI
//		
//		//POM - design pattern - to create object repo 
//		//Page wise 
//		//scroll down using javascript 
//		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
//		js.executeScript("window.scrollBy(0,10000)");//scroll vertically 
//		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//		
//		JavascriptExecutor js1 = (JavascriptExecutor)driver;
//		
//		WebElement Element = driver.findElement(By.linkText("Linux"));
//
//		
//		js1.executeScript("arguments[0].scrollIntoView();", Element);
//		
//		
//		//back and forth 
//		
//		driver.navigate().back();
//		driver.navigate().forward();
//		
//		//screenshot 
//		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String screenshotBase64 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
//		
//		//Assert , verify 
//		
//		
//		
//		//Actions class 
//		Actions action = new Actions(driver);
//		
//		action.moveToElement(Element).build().perform();
//		
//		action.sendKeys(Keys.ARROW_RIGHT);
//		
//		action.keyDown(Keys.CONTROL);
//		
//		
//		//select from dropdown
//		Select select = new Select(Element);
//		select.selectByValue(screenshotBase64);
//		select.getOptions().size();//get the number of options. 
//		
//		
//		//desire capabilities - configure broweser, system. 
//		
////		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
////		capabilities.setCapability(CapabilityType.BROWSER_NAME, IE"");
////		
//		
//		// DOM - document object model - how xpath works - 
//		
//		
//		//ShadowDOM 
//		
//		//Window Dialog Box 
//		Robot robot = new Robot();
//		
//		robot.mouseMove(0, 0);
		
		
		String str = "elephant";
		
		char trg = 'e';
		
		int count = 0;
		
		for(int i=0; i <str.length(); i++) {
			
			
			if(str.charAt(i)==trg) {
				
				count ++;
			}
			
		}
		
		
		System.out.println(count);
		
		
	}

}
