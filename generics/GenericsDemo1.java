package generics;

class Problem<T, V> {
	
	T a;
	V b;
	
	Problem(T a, V b) {
		this.a = a;
		this.b = b;
	}
	
	void show() {
		System.out.println("Type of T: " + a.getClass().getName());
		System.out.println("Type of V: " + b.getClass().getName());
	}
}
public class GenericsDemo1 {

	public static void main(String[] args) {
		
		Problem<String, Integer> object = new Problem<>("Rahul", 67);
		object.show();
	}

}
