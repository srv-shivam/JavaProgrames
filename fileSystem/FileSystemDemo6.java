package fileSystem;

// Object Deserialization - reading the object from byte stream
import java.io.*;
public class FileSystemDemo6 {

	public static void main(String[] args) throws Exception{
		
		try {
			MyClass object;
			FileInputStream obj = new FileInputStream("StudentList.txt");
			ObjectInputStream o = new ObjectInputStream(obj);
			object = (MyClass)o.readObject();
			obj.close();
			System.out.println(object); // printing address
		}
		catch(Exception e) {
			System.out.println("Exception:" + e);
		}
		
	}

}
