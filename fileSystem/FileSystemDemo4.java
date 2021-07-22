package fileSystem;

import java.io.*;
public class FileSystemDemo4 {

	public static void main(String[] args) throws Exception{
		
		FileInputStream f1 = null;
		
		FileOutputStream f2 = null;
		
		try {
			f1 = new FileInputStream("Practice.txt");
			
			f2 = new FileOutputStream("Test.txt", true);
			
			int get = f1.read();
			
			while( get != -1) {

				f2.write((char)get);
				get = f1.read();
			}
		}
		catch(IOException e) {
			System.out.println("Exceptio: " + e);
			System.out.println("Exception Occurred and handled");
		}
		finally {
			f1.close();
			f2.close();
		}
				
	}

}
