package dsa450List;

import java.util.Scanner;
class Solution3 {
	
	private int minElement(int[] arr, int low, int high) {
		
		int pivot = arr[high];
		int pIndex = low;
		for(int i=low; i<high; i++) {
			
			if(arr[i] <= pivot) {
				int temp = arr[i];
				arr[i] = arr[pIndex];
				arr[pIndex] = temp;
				++pIndex;
			}
		}
		int temp = arr[high];
		arr[high] = arr[pIndex];
		arr[pIndex] = temp;
		return pIndex;  // pivot position
	}
	
	private int maxElement(int[] arr, int low, int high) {
		
		int pivot = arr[high];
		int pIndex = low;
		for(int i=low; i<high; i++) {
			
			if(arr[i] >= pivot) {
				int temp = arr[i];
				arr[i] = arr[pIndex];
				arr[pIndex] = temp;
				++pIndex;
			}
		}
		int temp = arr[high];
		arr[high] = arr[pIndex];
		arr[pIndex] = temp;
		return pIndex;  // pivot position
	}
	
	public void kthMin(int[] arr, int low, int high, int k) {
		
		if(low<high) {
			int minPos = minElement(arr, low, high);
			
			if(k < minPos) {
				kthMin(arr, low, minPos-1, k);
			}
			else if(k > minPos) {
				kthMin(arr, minPos+1, high, k);
			}
			else {
				System.out.println("Kth Minimum Element : " + arr[minPos]);
				return;
			}
		}
	}
	
	public void kthMax(int[] arr, int low, int high, int k) {
		
		if(low<high) {
			int maxPos = maxElement(arr, low, high);
			
			if(k < maxPos) {
				kthMax(arr, low, maxPos-1, k);
			}
			else if(k > maxPos) {
				kthMax(arr, maxPos+1, high, k);
			}
			else {
				System.out.println("Kth Maximum Element : " + arr[maxPos]);
				return;
			}
		}
	}
}

public class KthMaxMinElement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter Kth Element : ");
		int k = sc.nextInt();
		Solution3 obj = new Solution3();
		obj.kthMax(arr, 0, size-1, k-1);
		obj.kthMin(arr, 0, size-1, k-1);
	}

}
