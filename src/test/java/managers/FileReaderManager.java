package managers;

import dataProviders.ConfigFileReader;

public class FileReaderManager {
	
	private static FileReaderManager fileReaderManager = new FileReaderManager();
	
	private static ConfigFileReader configFileReader;
	
	private FileReaderManager() {
		
	}
	
	public static FileReaderManager getInstance() {
		
		return fileReaderManager;
		
	}
	
	public ConfigFileReader getConfigReader() {
		if (configFileReader ==null ) {
			
			return new ConfigFileReader();
		}
		
		else return configFileReader;
	}
	

}
