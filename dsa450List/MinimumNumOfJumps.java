package dsa450List;

import java.util.Scanner;
class Solution10 {
	
	public static int minStepsCount(int[] arr) {
		
		int jumps = 1;
			
			if(arr.length==1) return 0;  // only one element present in array
			if(arr[0] == 0) return -1;  // first element is zero(0), so we can't move forward
			
			// currently the farthest index we can reach i.e arr[0] + 0 {2,3,4,1,1} , here at first 
			// the farthest we can reach is 2(first element) + 0(index)
			// farthest = Till 2nd index;
			int farthest = arr[0];
			
			// The current index this farthest we make us reach for here the curr_end is 2
			int curr_end = arr[0];
			
			// we will traverse from index 1 to arr.length-1
			// Time Complexity O(N)
			// Space Complexity O(1)
			for(int i=1; i<arr.length; i++) {
				
				// This condition will check if we reach the end od array the return our total jumps made
				if(i == arr.length-1) {
					return jumps;
				}
				
				// We are selecting the maximum farthest index we can reach
				// Here farthest was 2nd index
				// we compare with arr[i]+i  and first iteration i=1, so 3(2nd element) + 1(index 1) = 4
				// So, by seeing here the old farthest will make us land at 2nd index only 
				// But the new one will help us reach 4th index
				farthest = Math.max(farthest, arr[i]+i);
				
				// Now we will check continuously whether i reached to our end index i.e 2 (For 1st till we reached curr_end)
				// If it reaches then it means we made one jump
				// Then increment the jump and set the new farthest to curr_end
				if(i == curr_end) {
					jumps++;
					curr_end = farthest;
					if(arr[curr_end] == 0) return -1;
				}
			}
		
		return jumps;
	}
}

public class MinimumNumOfJumps {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter size : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Minimum Steps : " + Solution10.minStepsCount(arr));
	}

}
