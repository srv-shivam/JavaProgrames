package classK19SD;

interface Fee {
	void feepaid();
}

interface Attendance {
	void calAttendance(int duration);
}

public class FunctionalInterface_Demo {

	public static void main(String[] args) {
	
		Fee obj = () -> System.out.println("Fees Paid :)");
		obj.feepaid();
		
		Attendance obj1 = (a) -> {
			if(a > 45)
			    System.out.println("100% Attendance");
			else
				System.out.println("Absent");
		};
		obj1.calAttendance(50);

	}
	}
