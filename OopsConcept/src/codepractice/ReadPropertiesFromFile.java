package codepractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFromFile {

	public static void main(String[] args) {
		Properties properties = new Properties();
		try {
			FileInputStream fileInputStream = new FileInputStream("Properties/test/resources/config.properties");

			properties.load(fileInputStream);
			//Reading value form properties file
			String username=properties.getProperty("username");
			String password=properties.getProperty("password");
			
			//Printing the value
			
			System.out.println("Username : "+username);
			System.out.println("Password : "+password);
			
			fileInputStream.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
