package FileHandling;

import java.io.File;

public class Deleting {
public static void main(String[] args) {
	File f = new File("data.txt");
	boolean delete = f.delete();
	System.out.println("File deleted = " + delete);
}
}
