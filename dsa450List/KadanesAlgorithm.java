package dsa450List;

import java.util.Scanner;
class Solution8 {
	
	public static int maxSumSubArray(int[] arr) {
		
		int currSum = 0;
		int maxSum = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			
			currSum += arr[i];
			
			if(currSum > maxSum) {
				maxSum = currSum;
			}
			if(currSum < 0) {
				currSum = 0;
			}
		}
		return maxSum;
	}
}

public class KadanesAlgorithm {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Maximum Sum : " +  Solution8.maxSumSubArray(arr));
	}

}
