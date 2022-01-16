package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reading {
public static void main(String[] args) throws IOException {

File file = new File("data.txt");
FileInputStream fis = new FileInputStream(file);
InputStreamReader isr = new InputStreamReader(fis);
BufferedReader br = new BufferedReader(isr);

String line;
while((line = br.readLine()) != null){
    //process the line
    System.out.println(line);
}
try {
	br.close();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

}
}
