package fileSystem;

import java.util.Scanner;
import java.io.*;
public class FileSystemDemo2 {

	public static void main(String[] args) {
		
		try {
			
			File f1 = new File("C:\\Users\\SHIVAM\\Documents\\Java programes\\Abc.txt");
			Scanner input = new Scanner(f1);

			File f2 = new File("C:\\Users\\SHIVAM\\Documents\\Java programes\\Abc_Copy.txt");
			f2.createNewFile();
			PrintWriter output = new PrintWriter(f2);
			
			while(input.hasNext()) {
				String str = input.nextLine();
				output.println(str);
			}
			
			output.close();
			input.close();
			
			System.out.println("Successfully Copied one file to another file :)");
			
		}
		catch(Exception e) {
			System.out.println("Exception occurred! Unsuccessful to copy ");
		}
		
	}
}