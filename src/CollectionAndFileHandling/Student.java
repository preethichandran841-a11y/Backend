package CollectionAndFileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Student {
	public static void main(String[] args) throws IOException {

		 File f = new File("student.txt");

	        if (f.createNewFile()) {
	            System.out.println("File created successfully");
	        } else {
	            System.out.println("File already exists");
	        }
	        
	        FileWriter filewriter = new FileWriter("student.txt");
            filewriter.write("Preethi");
	        filewriter.close();
        
    }
}
