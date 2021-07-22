package dsa450List;

import java.util.*;
class Solution11 {
	
	public static int duplicateElement(int[] arr) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int answer = 0;
		
		for(Integer i : arr) {
			
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			} else {
				map.put(i, 1);
			}
		}
		
		Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
		
		for(Map.Entry<Integer, Integer> entries : entrySet) {
			
			if(entries.getValue() > 1) {
				answer = entries.getKey();
			}
		}
		return answer;
	}
}

public class DuplicateElement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size : ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Duplicate Element is : " + Solution11.duplicateElement(arr));
	}

}
