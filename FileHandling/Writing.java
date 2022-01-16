package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Writing {
public static void main(String[] args) {
	String fileContent = "Hello ";
	  System.out.println("succes");
	 
    try {
        Path path = Paths.get("data.txt");
        Files.write(path, fileContent.getBytes());
    } catch (IOException e) {
        e.printStackTrace();
      
    }

}
}
