package dsa450List;

import java.util.Arrays;
import java.util.Scanner;
public class MinimizeHeights2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter k : ");
		int k = sc.nextInt();
		
		Arrays.sort(arr);
		int min=0, max=0,r=0;
		r = arr[n-1] - arr[0];
		
		for(int i=1; i<n; i++) {
			
			if(arr[i]>=k) {
				max = Math.max(arr[i-1]+k, arr[n-1]-k);
				min = Math.min(arr[i]-k, arr[0]+k);
				r = Math.min(r, max-min);
			}
		}
		
		System.out.print("Minimized Height is : " + r);
	}

}
