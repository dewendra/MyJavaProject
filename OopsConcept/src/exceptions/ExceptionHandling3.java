package exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandling3 {
	
	public static void main(String[] args) {
		
		File file = new File(System.getProperty("user.dir") + "\\TestFile.txt");
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		
		try {
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			bufferedReader.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not found at: " + file.getAbsolutePath());
			System.out.println("File not found: " + e.getMessage());
		}

		catch (IOException e) {
			System.out.println("Error while reading the file: " + e.getMessage());
		} finally {
			try {
				if (bufferedReader != null) {
					bufferedReader.close();
				}
				if (fileReader != null) {
					fileReader.close();
				}
			} catch (IOException e) {
				System.out.println("Error closing resources: " + e.getMessage());
			}
		}
	}

}
