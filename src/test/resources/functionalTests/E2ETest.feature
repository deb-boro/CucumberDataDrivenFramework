Feature: Automated End2Test Tests

Description: The purpose of this feature is to test End 2 End Integration

#Scenario: Login to Sauce Demo website

	#Given user login to the application using user name and password
	#When user clicks on log in button
	
#Scenario: Verify home page 

 # Then user verify home page title as "Swag Labs" and Page name as "Products"

#Scenario: Click on Add to Cart button of backpack 

 # Then user clicks on Sauce Labs Backpack Add to Cart Button
 
 @First
 Scenario: Verify ToolsQA ELement Section on the Website
 
 			When user clicks on Element icon on home page
 			Then user clicks on textbox on element page
 			Then user enters "Test Boro" in fullname textbox
 			Then user enters "test@boro.com" in email textbox
 #			Then user enters "Address" in current address textbox
 	#		Then user clicks on submit button
 	
 	
 	@Second
 	Scenario Outline: Verify Textbox functionality by entering data into textbox
 
 			When user clicks on Element icon on home page
 			Then user clicks on textbox on element page
 			Then User enters inputs to textbox from Excel "<Sheetname>","<label>" and "<ColumnName>"
 			
 			
 			
 	Examples:
 	 |Sheetname				|		label			|			ColumnName			|
 	 |customerDetails |    TC02			|     FullName        |
 	    
 			
 
 
  
  
	
	