package fileSystem;

import java.io.*;
public class FileSystemDemo3 {

	public static void main(String[] args) throws Exception {

		FileOutputStream output = new FileOutputStream("Practice.txt");
		String s = "Welcome \nLets Learn Java";
		byte b[] = s.getBytes();
		output.write(b);
		output.close();
		
		FileInputStream o = new FileInputStream("Practice.txt");
		int a = o.read();
		while(a != -1) {
			System.out.println((char)a);
			a = o.read();
		}
	}

}
