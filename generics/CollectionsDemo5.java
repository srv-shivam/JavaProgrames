package generics;

import java.util.*;

public class CollectionsDemo5 {

	public static void main(String[] args) {
		
		LinkedList<Integer> linklist = new LinkedList<Integer>();
		
		for(int i=1; i<=6; i++) {
			linklist.add(i);
		}
		
		System.out.println("Elelements : " + linklist);
		// using Iterator
		Iterator itr = linklist.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		
	}

}
