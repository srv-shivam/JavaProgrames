package classK19SD;

import java.util.Scanner;

interface OLA {
	
	static class Cab {
		
		int cab_number;
		int driver_name;
		
		String[] drivers = { "Rahul", "Ravi", "Aman", "Amit", "Piyush" };
		
		
		public static Cab getCab() {
			return new Cab();
		}
		
		
		public void display(int cab_no) {
			
			//Valid can numbers are between 0 to 4 including 
			if(cab_no >= 0 && cab_no <5) {
				
				System.out.println("Company: OLA" + "\n" + "Driver Name: " + drivers[cab_no]);
			}
			else {
				System.out.println("Invalid CAB details");
			}
		}
		
	}
}

interface UBER {
	
	static class Cab {
			
			int cab_number;
			int driver_name;
			
			String[] drivers = { "Ramesh", "Sanjeev", "Rakesh", "Vikas", "Sahil" };
			
			
			public static Cab getCab() {
				return new Cab();
			}
			
			
			public void display(int cab_no) {
				
				//Valid can numbers are between 0 to 4 including 
				if(cab_no >= 0 && cab_no <5) {
					
					System.out.println("Company: UBER" + "\n" + "Driver Name: " + drivers[cab_no]);
				}
				else {
					System.out.println("Invalid CAB details");
				}
			}
			
		}
}

public class PracticeQuestion {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		OLA.Cab o1 = OLA.Cab.getCab();
		UBER.Cab o2 = UBER.Cab.getCab();
		
		
		for(int i=0; i<5; i++) {
			
			System.out.print("Enter Cab Number: ");
			int user_input = sc.nextInt();
			
			if(i%2==0) {
				o1.display(user_input);
			}
			else {
				o2.display(user_input);
			}
			
			System.out.println();
		}
	}

}
