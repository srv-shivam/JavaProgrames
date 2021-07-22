package fileSystem;

import java.io.*;
public class FileSystemDemo7 {

	public static void main(String[] args) {
		
		try(BufferedReader br = new BufferedReader(new FileReader("FileName.txt"))) {
			
			String str;
			
			while((str=br.readLine())!= null) {
				System.out.println(str);
			}
		}
		catch(Exception e) {
			System.out.println("Exception occured");
		}
	}

}
