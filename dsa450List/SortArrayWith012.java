package dsa450List;

import java.util.Scanner;
class Solution4 {
	
	public static void sortArray(int[] arr) {
		int count0 = 0, count1 = 0, count2 = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 0) ++count0;
			else if(arr[i] == 1) ++count1;
			else ++count2;
		}
		
		for(int i=0; i<arr.length; i++) {
			
			if(count0>0) {
				arr[i]=0;
				--count0;
			} else if(count1>0) {
				arr[i]=1;
				--count1;
			} else if(count2>0) {
				arr[i]=2;
				--count2;
			}
		}

		System.out.print("Sorted Array : "); 
		for(int i=0; i<arr.length; i++) System.out.print(arr[i] + " ");
	}
}
public class SortArrayWith012 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Solution4.sortArray(arr);
	}

}
