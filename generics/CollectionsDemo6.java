package generics;

import java.util.*;
public class CollectionsDemo6 {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "A");
		map.put(102, "B");
		map.put(103, "C");
		map.put(104, "D");
		map.remove("C");
		for(Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
