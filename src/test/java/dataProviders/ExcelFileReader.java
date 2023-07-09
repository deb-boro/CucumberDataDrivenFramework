package dataProviders;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import managers.FileReaderManager;

public class ExcelFileReader {
	
	FileReaderManager fileReaderManager;
	ConfigFileReader configFileReader = new ConfigFileReader();
	public String excel_Path = configFileReader.getExcelPath();
	

	private int rowNumber ;
	private String sheetName ; 
	private String label;
	private String columnName;
	
	

	public ExcelFileReader(String sheetName, String label, String columnName) {
		
		
		this.sheetName = sheetName;
		this.label = label;
		this.columnName = columnName;
	}


     public String getColumnName() {
    	 
    	 return columnName;
     }


	// get excel data as map 
	
	//{1={CurrentAddress=1435 State Street , Concord, NC 28025, UserName=deb, FullName=Deb Boro, Label=TC01, PassWord=boro, email=deb@test.com}, 
	//2={CurrentAddress=2nd State Street , Concord, NC 28025, UserName=deb2, FullName=Deb Boro2, Label=TC02, PassWord=boro2, email=deb2@test.com}, 
	//3={CurrentAddress=3rd State Street , Concord, NC 28025, UserName=deb3, FullName=Deb Boro3, Label=TC03, PassWord=boro3, email=deb2@test.com}, 
	//4={CurrentAddress=4th State Street , Concord, NC 28025, UserName=deb4, FullName=Deb Boro4, Label=TC04, PassWord=boro4, email=deb2@test.com}, 
	//5={CurrentAddress=5th State Street , Concord, NC 28025, UserName=deb5, FullName=Deb Boro5, Label=TC05, PassWord=boro5, email=deb2@test.com}, 
	//6={CurrentAddress=6th State Street , Concord, NC 28025, UserName=deb6, FullName=Deb Boro6, Label=TC06, PassWord=boro6, email=deb2@test.com}}

     
     
     public Map<String, Map<String, String>> getExcelAsMap() throws IOException {
		
    	 File file = new File(excel_Path);
    	
  		
  		FileInputStream inputStream = new FileInputStream(file);
  	
  	    XSSFWorkbook ws = new XSSFWorkbook (inputStream);
  	    
  	   // System.out.println(columnName);
  		
  		XSSFSheet sheet = ws.getSheet(sheetName);
  			
    	
	
    Map<String , Map<String , String>> completeSheetData= new HashMap<String, Map<String, String>>();
    
	
    // add the column head names in an arraylist 
    List<String> columnHeader = new ArrayList<String>();
	
	Row row = sheet.getRow(0);
	
	Iterator<Cell> cellIterator = row.cellIterator();
	
	while(cellIterator.hasNext()) {
		columnHeader.add(cellIterator.next().getStringCellValue());
	}
	
	
	// adding header name and corresponding data as (key , value) pair  one row at a time. 
	int rowCount = row.getLastCellNum();
	int columnCount = row.getLastCellNum();
	
	for (int i= 1; i<=rowCount ; i++) {
		Map<String , String > singleRowData = new HashMap<String, String>();
		Row row1 = sheet.getRow(i);
		
		for(int j =0; j <columnCount ; j++) {
			Cell cell = row1.getCell(j);
			singleRowData.put(columnHeader.get(j), getCellValueAsString(cell));
		}
		completeSheetData.put(String.valueOf(i), singleRowData);
		//completeSheetData.put(label, singleRowData);

		
	}
	
	return completeSheetData;
	
	}
	
	
	
	public int getRowIndex() throws IOException {
		

   	 	File file = new File(excel_Path);
 		
 		FileInputStream inputStream = new FileInputStream(file);
 	
 	    XSSFWorkbook ws = new XSSFWorkbook (inputStream);
 	
 		XSSFSheet sheet = ws.getSheet(sheetName);
		
		//get all rows in the sheet
        int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
        
        
//		Iterator<Row> itr = sheet.iterator();
//		
//		
//		
//		while(itr.hasNext()) {
//			
//			Row row = itr.next();
//			
//			if (row.getCell(0).getStringCellValue().equalsIgnoreCase("TC05")){
//				
//				System.out.println("row number is :"+row.getRowNum());
//				
//				break;
//			}
//				
//		}
//		

        for(int i=0 ; i<=rowCount; i++) {
        	
        	
        	if(sheet.getRow(i).getCell(0).getStringCellValue().equalsIgnoreCase(label)) {
        		
        			rowNumber = i;
        			
        			
        			
        		break;
        			
        	}
        }
        
        return rowNumber;
         
	}
	
	
	
	
	
	public String getCellValueAsString(Cell cell) {
        String cellValue = null;
        switch (cell.getCellType()) {
            case NUMERIC:
                cellValue = String.valueOf(cell.getNumericCellValue());
                break;
            case STRING:
                cellValue = cell.getStringCellValue();
                break;
            case BOOLEAN:
                cellValue = String.valueOf(cell.getBooleanCellValue());
                break;
            case FORMULA:
               cellValue= cell.getCellFormula();
            case BLANK:
                cellValue="BLANK";
            default:
                cellValue ="DEFAULT";
        }
        return cellValue;
    }
	
	

}
