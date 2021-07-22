package generics;

interface MinMax<T extends Comparable<T>> {
	
	T min(T x, T y, T z);
	T max(T x, T y, T z);
}

public class GenericsDemo2<T extends Comparable<T>> implements MinMax<T>{

	public static void main(String[] args) {
		
		GenericsDemo2<Integer> obj = new GenericsDemo2<Integer>();
		
		System.out.println("Maximum: " + obj.max(1,2,3));
		System.out.println("Minimum: " + obj.min(3,2,2));
		

	}
	
	public T max(T x, T y, T z) {
		
		T MAX = x;
		
		if(y.compareTo(MAX)>0) MAX = y;
		
		if(z.compareTo(MAX)>0) MAX = z;
		
		return MAX;
		
	}
	
	public T min(T x, T y, T z) {
		
        T MIN = x;
		
		if(y.compareTo(MIN)<0) MIN = y;
		
		if(z.compareTo(MIN)<0) MIN = z;
		
		return MIN;
		
	}

}
