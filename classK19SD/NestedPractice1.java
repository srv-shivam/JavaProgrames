package classK19SD;

class Person {
	
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	class VoterCard { 
		
		int voterId;
		String Address;
		
		VoterCard(int voterId, String address) {
			this.voterId = voterId;
			this.Address = address;
		}
		
		void getVoterCard() {
			System.out.println("Voter ID: " + voterId + "\n" + "Address: " + Address);
		}
	}
	
	void display() {
		System.out.println("Name: " + name + "\n" + "Age: " + age);
	}
}

public class NestedPractice1 {

	public static void main(String[] args) {
		
		Person obj = new Person("Shivam", 20);
		Person.VoterCard o = obj.new VoterCard(123456789, "House No. 123 Street ABC"); 
		
		obj.display();
		o.getVoterCard();

	}

}
