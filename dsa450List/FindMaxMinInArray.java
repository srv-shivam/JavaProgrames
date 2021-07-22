package dsa450List;

import java.util.Scanner;
class Solution2 {
	
	public static int maxElement(int[] a, int n) {
		
		int max = Integer.MIN_VALUE;
		for(int i=0; i<n; i++) {
			if(max < a[i]) {
				max = a[i];
			}
		}
		return max;
	}
	public static int minElement(int[] a, int n) {
		
		int min = Integer.MAX_VALUE;
		for(int i=0; i<n; i++) {
			if(min > a[i]) {
				min = a[i];
			}
		}
		return min;
	}
}
public class FindMaxMinInArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Maximum Element : " + Solution2.maxElement(arr, n));
		System.out.println("Minimum Element : " + Solution2.minElement(arr, n));
	}

}
