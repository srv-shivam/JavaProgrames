package dsa450List;

import java.util.Scanner;
public class CyclicRotateOfArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int temp = arr[n-1];
		for(int i=n-1; i>=1; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = temp;
		System.out.print("Rotated Array : ");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
