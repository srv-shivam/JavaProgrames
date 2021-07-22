package dsa450List;

import java.util.Scanner;

class Solution6 {
	
	public static void unionOfArray(int[] a, int[] b) {
		
		int i=0, j=0;
//		int[] unionArray = new int[a.length + b.length];
		System.out.print("Union Of Array : ");
		while(i<a.length && j<b.length) {
			
			if(a[i] < b[j]) {
				System.out.print(a[i++] + " ");
			} else if(b[j] < a[i]) {
				System.out.print(b[j++] + " ");
			} else if(a[i] == b[j]) {
				System.out.print(a[i++] + " ");
				j++;
			}
		}
		
		while(i<a.length) {
			System.out.print(a[i++] + " ");
		}
		
		while(j<b.length) {
			System.out.print(b[j++] + " ");
		}
		
	}
	
	public static void intersection(int[] arr, int[] brr) {
		
		int i=0, j=0;
		System.out.print("\n" + "Intersection of array : ");
		while(i<arr.length && j<brr.length) {
			
			if(arr[i] < brr[j]) {
				++i;
			}
			else if(brr[j] < arr[i]) {
				++j;
			}
			else if(arr[i] == brr[j]) {
				System.out.print(arr[i++] + " ");
				++j;
			}
		}
	}
}

public class UnionAndIntersectionOfArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of both array : ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr = new int[n];
		int[] brr = new int[m];
		
		System.out.println("Enter Elements in array1 : ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter Elements in array2 : ");
		for(int i=0; i<m; i++) {
			brr[i] = sc.nextInt();
		}
		
		Solution6.unionOfArray(arr, brr);
		Solution6.intersection(arr, brr);
		sc.close();
	}

}
