package codepractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesConfigurationReader {
	
	private static Properties properties=new Properties();
	
	public static void loadPropeties(String env) {
		
		 // Create file path based on environment
		try {
			String filepath="Properties/test/resources/config."+env+".properties";
			FileInputStream file=new FileInputStream(filepath);
			try {
				properties.load(file);
				file.close();
			} catch (IOException e) {
				e.printStackTrace();
				throw new RuntimeException("Could not load properties for environment: " + env);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("File not found for environment: " + env);
		}
	}
	public static String getProperty(String key) {
		return properties.getProperty(key);
		
	}

	public static void main(String[] args) {
		
		String enviornment=System.getProperty("env","qa");
		loadPropeties(enviornment);
		System.out.println("Enviornment : "+enviornment);
		System.out.println("Username : "+getProperty("username"));
		System.out.println("Password : "+getProperty("password"));
		System.out.println("URL : "+getProperty("url"));

	}

}
