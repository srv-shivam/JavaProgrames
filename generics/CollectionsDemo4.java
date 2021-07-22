package generics;

import java.util.*;

public class CollectionsDemo4 {

	public static void main(String[] args) {
		
		Deque<String> deque = new ArrayDeque<String>();
		deque.offer("arvind");
		deque.offer("vimal");
		deque.add("mukul");
		deque.offerFirst("jai");
		deque.addLast("a");
		deque.push("Shivam");
		System.out.println(deque.size());
		System.out.println("After offerFirst Traversal : ");
		for(String s : deque) {
			System.out.println(s);
		}
		System.out.println();
		System.out.println(deque.peek());
		Iterator itr = deque.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}

}
