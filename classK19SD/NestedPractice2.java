package classK19SD;

class Person1 {
	
	String name;
	int age;
	
	Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	class House {
		
		String color;
		String Address;
		String type;
		boolean parkingArea;
		
		House(String color, String address, String type, boolean parkingArea) {
			this.color = color;
			this.Address = address;
			this.type = type;
			this.parkingArea = parkingArea;
		}
		
		void showHouse() {
			System.out.println("Color: " + color + "\n" + "Address: " + Address + "\n" + "Type: " + type + "\n" + "Parking Area: " + parkingArea);
		}
	}
	
	void display() {
		System.out.println("Name: " + name + "\n" + "Age: " + age);
	}
}

public class NestedPractice2 {

	public static void main(String[] args) {
		
		Person1 obj = new Person1("Shivam", 20);
		Person1.House o = obj.new House("Light Cream", "House No. 123 Street ABC", "3 BHK", true);
		
		obj.display();
		o.showHouse();

	}

}
