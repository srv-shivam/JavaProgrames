package CodeChef;

import java.util.Scanner;
class Solution {
	
	int findNumber(int[] a, int n) {
		
		int xo = 0;
		int xi = 0;
		for(int i=1; i<=n; i++) {
			xi ^= i;
		}
		System.out.println("xi " + xi);
		for(int i=0; i<n; i++) {
			xo ^= a[i];
		}
		System.out.println("xo " + xo);
		int x = Math.abs(xi - xo);
		return x;
	}
}

public class AmazonQuestion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements: ");
		for(int i=0; i<n-1; i++) {
			arr[i] = sc.nextInt();
		}
		
		Solution obj = new Solution();
		System.out.println("The number is: " + obj.findNumber(arr, n));
	}

}
