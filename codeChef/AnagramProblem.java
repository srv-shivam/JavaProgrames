package codeChef;

import java.util.*;
public class AnagramProblem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.next();
		String s2 = sc.next();
		
		boolean ret = isAnagram(s1, s2);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}
	
	private static boolean isAnagram(String a, String b) {
		
		if(a.length() != b.length()) return false;
		
		if(a == null || b == null) return false;
		
		char[] s1 = a.toUpperCase().toCharArray();
		char[] s2 = a.toUpperCase().toCharArray();
		
		Map<Character, Integer> str1 = new HashMap<Character, Integer>();
		Map<Character, Integer> str2 = new HashMap<Character, Integer>();
		
		for(Character c : s1) {
			if(str1.containsKey(c)) {
				str1.put(c, str1.get(c)+1);
			}
			else {
				str1.put(c, 1);
			}
		}
		
		for(Character c : s2) {
			if(str2.containsKey(c)) {
				str2.put(c, str2.get(c)+1);
			}
			else {
				str2.put(c, 1);
			}
		}
		
		return str1.equals(str2);
	}

}
