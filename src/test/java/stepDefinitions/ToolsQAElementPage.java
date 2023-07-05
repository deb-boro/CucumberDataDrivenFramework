package stepDefinitions;


import java.io.IOException;
import java.util.Map;

import cucumber.TestContext;
import dataProviders.ExcelFileReader;
import io.cucumber.java.en.Then;


public class ToolsQAElementPage {
	
		
		TestContext testContext;
		pageObjects.ToolsQAElementPage toolsQAElementPage;
		
		



		public ToolsQAElementPage(TestContext testContext) {
			
			this.testContext = testContext;
			
			toolsQAElementPage = testContext.getPageObjectManager().getToolsQAElementPage();
		}





		@Then("user clicks on textbox on element page")
		public void user_clicks_on_textbox_on_element_page() {
			
			toolsQAElementPage.click_listItemTextBox(false);
			
		}
		
		@Then("user enters {string} in fullname textbox")
		public void user_enters_name_in_fullname_textbox(String fullName) {
			
			toolsQAElementPage.enter_text_FullName(fullName);
			
		}
		
		@Then("user enters {string} in email textbox")
		public void user_enters_in_email_textbox(String email) {
			
			toolsQAElementPage.enter_text_userEmail(email);
		}
		
		@Then("User enters inputs to textbox from Excel {},{} and {}")
		public void enters_input_to_textbox_from_excel_sheetName_label_columnName(String sheetName, String label, String columnName) throws IOException {
			
			
			 String newSheetName = sheetName.substring(1, sheetName.length()-1);
		     
			 String newColumnName = columnName.substring(1, columnName.length()-1);
			 
			 String newLabel = label.substring(1, label.length()-1);
			 
			 ExcelFileReader excelFileReader = new ExcelFileReader(newSheetName,newLabel, newColumnName);
			
		     Map<String, Map<String, String>> ex = excelFileReader.getExcelAsMap();
		     
		     
		     toolsQAElementPage.enter_text_FullName(
		    		 ex.get(Integer.toString(excelFileReader.getRowIndex())).get(excelFileReader.getColumnName()));
			      
		
			       	        
			        
		}
		
	
	

}
