package generics;

import java.util.*;

class Book {
	
	private String title;
	private double price;
	
	Book(String title, double price) {
		this.title = title;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	
	public double getPrice() {
		return price;
	}
}

class MyComparator implements Comparator<Book> {
	
	@Override
	public int compare(Book o1, Book o2) {
		
		Book b1 = (Book) o1;
		Book b2 = (Book) o2;
		
		if(b1.getPrice() < b2.getPrice())
			return -1;
		else
			return 1;
	}
}

public class CollectionsDemo2{

	public static void main(String[] args) {
		
		Book b1, b2, b3;
		b1 = new Book("Java", 240.00);
		b2 = new Book("C++", 140.00);
		b3 = new Book("DSA", 460.00);
		
		Set<Book> t = new TreeSet<Book>(new MyComparator());
		t.add(b1);
		t.add(b2);
		t.add(b3);
		
		Book b;
		Iterator itr = t.iterator();
		while(itr.hasNext()) {
			b = (Book)itr.next();
			System.out.println(b.getTitle() + " " + b.getPrice());
		}
	}

}
