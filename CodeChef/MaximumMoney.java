package CodeChef;

import java.util.Arrays;
import java.util.Scanner;
public class MaximumMoney {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0) {
			
			int n = sc.nextInt();
			int[] a = new int[n];
			
			for(int i=0; i<n; i++) {
				a[i] = sc.nextInt();
			}
			int m = sc.nextInt();
			int i=0, j=m-1;
			Arrays.sort(a);
			int min = Integer.MAX_VALUE;
			while(j<n) {
				
				if(a[j] - a[i] < min) {
					min = a[j]-a[i];
				}
				i++; j++;
			}
			System.out.println("Minimum Result: " + min);
			t--;
		}
	}
}