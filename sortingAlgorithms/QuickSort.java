package sortingAlgorithms;

import java.util.*;
class Solution {
	
	private int partionPoint(int[] arr, int low, int high) {
		
		int pivot = arr[high];
		int j = low;
		for(int i=low; i<high; i++) {
			
			if(arr[i]<=pivot) { // changes
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		int temp = arr[high];
		arr[high] = arr[j];
		arr[j] = temp;
		return j;  // pivot position
	}
	
	public void quickSort(int[] arr, int low, int high) {
		
		if(low < high) {
			int pos = partionPoint(arr, low, high);
			quickSort(arr, low, pos-1);
			quickSort(arr, pos+1, high);
		}
	}
}
public class QuickSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Given Array : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		Solution obj = new Solution();
		obj.quickSort(arr, 0, arr.length-1);
		
		System.out.print("Sorted Array : ");
		for(int i=0; i<size; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}

}
