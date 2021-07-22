package dsa450List;

import java.util.Scanner;
class Solution5 {
	
	public static void arrangeNegativeNum(int[] arr) {
		
		int start=0, end=arr.length-1;
		
		while(start<end) {
			int flag1 = 0, flag2 = 0;
			if(arr[start]<0) {
				++start;
				flag1=1;
			}
			if(arr[end]>0) {
				--end;
				flag2=1;
			}
			
			if(flag1 == 0 || flag2 == 0) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
			}
			
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
		
		System.out.print("Arranged Array : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

public class NegativeElementsToOneSide {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Solution5.arrangeNegativeNum(arr);
	}

}
