package cucumber;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;






public class TestPlan {
	
//	String connectionURL = "jdbc:sqlserver://localhost:8080;databaseName=AdventureWorks2024;user=sa;password=tey";
//	
//	try(Connection connection =  DriverManager.getConnection(connectionURL)){
//			
//		String sql = "DROP DATABASE [SAMPLEDB] ; CREATE DATABASE [SAMPLEDB]";
//		
//		try(Statement statement = connection.createStatement()){
//			
//			statement.execute(sql);
//			
//		}
//	};
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//set properties 
		System.setProperty("webdriver.chrome.driver", "/Users/debajitboro/Java_WorkSpace/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Frames 
		driver.manage().window().maximize();
		driver.switchTo().frame("");
		driver.switchTo().defaultContent();
		
		//Alerts 
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
		
		//window handles 
		
		String parentWindow = driver.getWindowHandle();
		
		Set<String> set = driver.getWindowHandles();
		
		Iterator<String> it = set.iterator();
		
		while(it.next()!= null){
			
			String child_window = it.next();
			
			if(!parentWindow.equals(child_window)) {
				driver.switchTo().window(child_window);
			}
		}
	
		//Synchronization 
		//implicit wait 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(parentWindow)));
		
		//collection 
		
		
		//Framework can be devided into 3 high level folders 
		
		/* test java files , test resources files , configuration .properties 
		 * java files can be devided into - POM /object repository , step definitions, utilities - read properties file and excel sheet , runner file 
		 * 
		 * resources will be mainly feature files, driver, extent.properties files, test data 
		 * 
		 * 
		 * 
		 * 
		 * */
		
		
		
		

	}
	
	
	public class POMObjects{
		
		WebDriver driver;
		
		public POMObjects(WebDriver driver) {
			
			PageFactory.initElements(driver, this);
			
		}
		
		@FindBy(id="ind")
		private WebElement abc;
		
		public void clickABD() {
			abc.click();
		}
		
		
	}
	
	//JDBC 
	
	
	
	
	
	
	

}
