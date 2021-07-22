package fileSystem;

// Object Serialization - writing the object in byte stream
import java.io.*;
class MyClass implements Serializable {
	
	String name;
	int rollNo;
	
	MyClass(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}
	
	public String toString()
	{
	   return ("Name: " + name + "; Roll No: " + rollNo);
	}
}

public class FileSystemDemo5 {

	public static void main(String[] args) throws Exception{
		
		MyClass s1 = new MyClass("Shivam", 30);
		
		try {
			FileOutputStream obj = new FileOutputStream("StudentList.txt");
			
			ObjectOutputStream o = new ObjectOutputStream(obj);
			o.writeObject(s1);
			o.flush();
			obj.close();
		}
		catch(Exception e) {
			System.out.println("Exception: "+ e);
			System.out.println("Exception handled");
		}
		
	}

}
