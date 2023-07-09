package runnerPackage;


import java.io.File;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import managers.FileReaderManager;

@RunWith(Cucumber.class)

@CucumberOptions(
		tags="@Second",
		features = "src/test/resources/functionalTests", 
		
		glue = {"stepDefinitions"},
		
		plugin= {"pretty", "summary",
				
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"json:target/report.json"
		},
	
		monochrome = true
		
		)

public class TestRunner {
	
//	@AfterClass
//	public static void writeExtentReport() {
//		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
//	}

}
