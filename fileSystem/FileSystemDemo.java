package fileSystem;

import java.io.*;
import java.util.*;

public class FileSystemDemo {

	public static void main(String[] args) {
		
		try {
			File f1 = new File("C:\\Users\\SHIVAM\\Documents\\Java programes\\Abc.txt");
			f1.createNewFile();
			PrintWriter output = new PrintWriter(f1);
			
			output.print("Java Class ");
			output.println(40);
			output.print("LPU ");
			output.println(85.5);
			output.print('a');
			
			System.out.println("File Name: " + f1.getName());
			
			System.out.println("Path: " + f1.getPath());
			
			System.out.println("Is Absolute: " + f1.isAbsolute());
			
			System.out.println("Absolute Path: " + f1.getAbsolutePath());
			
			System.out.println("Parent: " + f1.getParent());
			
			System.out.println(f1.exists() ? "Exists" : "Does Not exist");
			
			System.out.println("Is a Directory: " + f1.isDirectory());
			
			System.out.println("Is a File: " + f1.isFile());
			
			System.out.println("Can Write? " + f1.canWrite());
			
			System.out.println("Can Read? " + f1.canRead());
			
			output.close();
			
			System.out.println();
			System.out.println();
			
			File f11 = new File("C:\\Users\\SHIVAM\\Documents\\Java programes\\Abc.txt");
			Scanner input = new Scanner(f11);
			
			while(input.hasNext()) {
				
				String s = input.nextLine();
				System.out.println(s);
			}
			input.close();
		}
		
		catch(Exception e) {
			System.out.println("Exception are handled and not declared");
		}

	}

}
