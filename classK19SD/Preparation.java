package classK19SD;
import java.util.Scanner;

class Prep {
	
	final float CONST = 3.14f;
	
	Prep(int a) {
		System.out.println("Inside Super class Constructor " + 10000);
		System.out.println(CONST/0);
	}
	
	void display() {
		System.out.println("Inside Super class display method : " + CONST);
	}
}

class Prep1 extends Prep {
	
	final int CO = 12;
	
	Prep1() {
		this(1);
		System.out.println("Inside Sub Class Constructor " + 12000);
	}
	
	Prep1(int x) {
		super(200);
		System.out.println("Inside Sub Class Para Constructor " + x);
	}
	
	void display() {
		System.out.println("Inside Sub Class display method : " + CO);
	}
}

public class Preparation {

	public static void main(String[] args) {
		
		Prep p = new Prep1();
		p.display();
	}

}
