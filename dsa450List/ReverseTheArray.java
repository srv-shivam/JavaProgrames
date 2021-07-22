package dsa450List;

import java.util.Scanner;
class Solution {
	
	private int[] arr = new int[10];
	
	public int[] reverseArray(int a[], int n) {
		
		int[] b = new int[n];
		for(int i=n-1, j=0; i>=0; i--, j++) {
			b[j] = a[i];
		}
		
		return b;
	}
}
public class ReverseTheArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Solution obj = new Solution();
		System.out.println("Enter array size (max 10) : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] b = obj.reverseArray(arr, n);
		System.out.println("Reversed Array: ");
		for(int i=0; i<n; i++) {
			System.out.print(b[i] + " ");
		}
	}

}
