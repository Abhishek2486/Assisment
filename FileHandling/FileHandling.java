package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class FileHandling {
	public static void main(String[] args) throws FileNotFoundException {
		//Create file
		File file = new File("data.txt");
		try {
			boolean createNewFile = file.createNewFile();
			System.out.println("File Created = "+createNewFile);
		} catch (IOException e) {

			e.printStackTrace();
		}

	
	

	}
}
