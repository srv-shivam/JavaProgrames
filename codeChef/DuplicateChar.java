package codeChef;

import java.util.*;
public class DuplicateChar {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		printDuplicateChar(str);
	}
	
	static void printDuplicateChar(String str) throws Exception{
		
		if(str == null) {
			System.out.println("NULL String");
			return;
		}
		if(str.isEmpty()) {
			System.out.println("Empty String");
			return;
		}
		if(str.length() == 1) {
			System.out.println("Single Char String");
			return;
		}
		
		char[] words = str.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		
		for(Character ch : words) {
			if(charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch)+1);
			}
			else {
				charMap.put(ch, 1);
			}
		}
		
		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
		boolean flag = true;
		
		for(Map.Entry<Character, Integer> entries : entrySet) {
			
			if(entries.getValue() > 1) {
				System.out.println(entries.getKey()+ " : " + entries.getValue());
				flag = false;
			}
		}
		
		if(flag) {
			System.out.println("No Duplicate Characters");
		}
	}

}
