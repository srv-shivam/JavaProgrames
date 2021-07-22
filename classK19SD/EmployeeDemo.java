package classK19SD;

import java.util.*;
class Employee {
	
	String employeeName;
	int empId;
	static boolean hasVehicle = false;
	
	private static void setHasVehicle(boolean b) {
		hasVehicle = b;
	}
	
	Employee(String name, int id) {
		this.employeeName = name;
		this.empId = id;
	}
	
	public static class Vehicle {
		
		int vehicleNumber;
	    
		
		Vehicle(int vecNumber) {
			this.vehicleNumber = vecNumber;
		}
		
		public static Vehicle isVehicle(boolean b, int vec) {
			
			if(b) { 
				setHasVehicle(b);
				return new Vehicle(vec);
			}
			else {
				setHasVehicle(b);
				return null;
			}
		}
		
		public boolean getHasVehicele() {
			return hasVehicle;
		}
	}
	
}
public class EmployeeDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Employee e1 = new Employee("Rahul", 1234);
		Employee.Vehicle v1 = Employee.Vehicle.isVehicle(true, 223445);
		
		Employee e2 = new Employee("Sahil", 2156);
		Employee.Vehicle v2 = Employee.Vehicle.isVehicle(false, 561322);
		
		Employee e3 = new Employee("Harsh", 1192);
		Employee.Vehicle v3 = Employee.Vehicle.isVehicle(true, 443632);
		
		ArrayList<Employee> emp = new ArrayList<Employee>(3);
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		
		for(Employee e : emp) {
			
			if(v1.getHasVehicele()) {
				System.out.println("Emp Name : " + e.empId + " Emp Name : " + e.employeeName);
			}
		}	
	}
}