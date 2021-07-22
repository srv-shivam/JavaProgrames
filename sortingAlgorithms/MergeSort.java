package sortingAlgorithms;

import java.util.Scanner;
class Solution2 {
	
	private static void merge(int[] left, int[] right, int[] arr) {
		
		int i=0, j=0, k=0;
		
		while(i<left.length && j<right.length) {
			
			if(left[i] < right[j]) {
				arr[k++] = left[i++];
			} 
			else if(right[j] < left[i]) {
				arr[k++] = right[j++];
			}
		}
		
		while(i < left.length) {
			arr[k++] = left[i++];
		} 
		while(j < right.length) {
			arr[k++] = right[j++];
		}
	}
	
	public static void mergeSort(int[] arr) {

		int n = arr.length;
		int mid = n/2;
		
		if(n < 2) return;
		
		int[] left = new int[mid];
		int[] right = new int[n-mid];
		
		for(int i=0; i<mid; i++) {
			left[i] = arr[i];
		}
		
		for(int i=mid; i<n; i++) {
			right[i-mid] = arr[i];
		}
		
		mergeSort(left);
		mergeSort(right);
		merge(left, right, arr);
		
	}
}

public class MergeSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size : ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int  i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Solution2.mergeSort(arr);
		
		System.out.print("Sorted Array : ");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
