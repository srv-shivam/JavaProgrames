package generics;

import java.util.*;

class Student {
	
	private String name;
	private double score;
	
	Student(String name, double score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() { return name; }
	public double getScore() { return score; }
}

class MyClass implements Comparator<Student> {
	
	@Override
	public int compare(Student o1, Student o2) {
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;
		
		if(s1.getScore() < s2.getScore())
			return -1;
		else
			return 1;
	}
}

public class CollectionsDemo3 {

	public static void main(String[] args) {
		
		Student s1,s2,s3;
		s1 = new Student("ABC", 98);
		s2 = new Student("DEF" , 76);
		s3 = new Student("GHI" , 100);
		
		Set<Student> t = new TreeSet<Student>(new MyClass());
		t.add(s1);
		t.add(s2);
		t.add(s3);
		
		Student s;
		Iterator itr = t.iterator();
		while(itr.hasNext()) {
			s = (Student) itr.next();
			System.out.println(s.getName() + " " + s.getScore());
		}
	}

}
