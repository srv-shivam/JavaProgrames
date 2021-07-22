package generics;

import java.util.*;
public class CollectionsDemo1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=1; i<=10; i++) {
			list.add(i*2);
		}
		
		System.out.println("ArraList elements: " + list);
		
		System.out.println("Using Interator: ");
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Using For each loop: ");
		for(Integer i : list) {
			System.out.println(i);
		}
		
		System.out.println("Object remove(int Index) : " + list.remove(2));
		System.out.println("Object remove(Object o) : " + list.remove(4));
		Collection list2 = (ArrayList<Integer>) list.clone();
		System.out.println("Object clone() : " + list2);
		System.out.println("int size() : " + list.size());
		System.out.print("void clear() : ");
		list2.clear();
		System.out.println(list2);
		System.out.println("boolean contains(Object o) : " + list.contains(8));
		System.out.println("Object get(int index) : " + list.get(5));
		System.out.println("int indexOf(Object o) : " + list.indexOf(16));
		System.out.println("int lastIndexof(Object o) : " + list.lastIndexOf(8));
		list.ensureCapacity(20);
		System.out.println("void ensureCapacity()" + list.size());
	}

}
