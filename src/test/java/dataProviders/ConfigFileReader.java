package dataProviders;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import enums.DriverType;
import enums.EnvironmentType;

public class ConfigFileReader {
	
	private Properties properties;
	private final String propertyFilePath = "configs//Configuration.properties";
	
	//constructor 
	public ConfigFileReader() {
		
		BufferedReader reader;
		
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String getDriverName() {
		
		String driverName = properties.getProperty("driver_name");
		if(driverName!=null) return driverName;
		else throw new RuntimeException("driverName not specified in the Configuration.properties file.");		
	}
	
	public String getDriverPath() {
		
		String driverPath = properties.getProperty("driver_path");
		if(driverPath!=null) return driverPath;
		else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");		
	}
	
	public long getImplicitlyWait() {		
		String implicitlyWait = properties.getProperty("implicitlyWait");
		if(implicitlyWait != null) return Long.parseLong(implicitlyWait);
		else throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");		
	}
	
	public String getApplicationUrl() {
		String url = properties.getProperty("url");
		if(url != null) return url;
		else throw new RuntimeException("url not specified in the Configuration.properties file.");
	}
		
	
	public DriverType getBrowser() {
		
		String browserName = properties.getProperty("browser");
		if(browserName==null || browserName.equals("chrome")) return DriverType.CHROME;
		else if (browserName.equalsIgnoreCase("firefox")) return DriverType.FIREFOX;
		else if(browserName.equals("iexplorer")) return DriverType.INTERNETEXPLORER;
		else throw new RuntimeException("Browser Name Key value in Configuration.properties is not matched : " + browserName);
	}
	
	public EnvironmentType getEnvironment() {
		String environmentName = properties.getProperty("environment");
		if(environmentName == null || environmentName.equalsIgnoreCase("local")) return EnvironmentType.LOCAL;
		else if(environmentName.equals("remote")) return EnvironmentType.REMOTE;
		else throw new RuntimeException("Environment Type Key value in Configuration.properties is not matched : " + environmentName);
	}
	
	public Boolean getBrowserWindowSize() {
		String windowSize = properties.getProperty("windowMaximize");
		if(windowSize!=null) return Boolean.valueOf(windowSize);
		return true ;
	}
	
	public String getExcelPath() {
		String testDataResourcePath = properties.getProperty("excelPath");
		if(testDataResourcePath!= null) return testDataResourcePath;
		else throw new RuntimeException("Excel Sheet Path not specified in the Configuration.properties file for the Key:excelPath");	
	}
	
	
	
	
	}
	
	
	

