package dsa450List;
import java.util.Arrays;
/**
 * Merge two sorted array without using extra space
 * @author SHIVAM
 * Lets take arr1[] = {0, 5, 7, 9, 12}
 * arr2[] = {1, 3, 8, 14}
 * Final output :- 0, 1, 3, 5, 7, 8, 9, 12, 14
 * Final arrays will be arr1[] = {0, 1, 3, 5, 7}  and arr2[] = {8, 9, 12, 14}
 */
import java.util.Scanner;
class Solution12 {
	
	public static void merge(int[] arr1, int[] arr2) {
		
		int m = arr1.length;
		int n = arr2.length;
		
		// arr1 size is greater than arr2
		if(m > n) {
			 int i = 0, j = 0, k = m - 1;
		        while (i <= k && j < n) {
		            if (arr1[i] < arr2[j])
		                i++;
		            else {
		                int temp = arr2[j];
		                arr2[j] = arr1[k];
		                arr1[k] = temp;
		                j++;
		                k--;
		            }
		        }
		        Arrays.sort(arr1);
		        Arrays.sort(arr2);
		}
		else {
			int i=m-1, j=n-1, k = 0;
			
			while(j >= k && i >= 0) {
				if(arr2[j] > arr1[i]) {
					j--;
				}
				else {
					int temp = arr1[i];
					arr1[i] = arr2[k];
					arr2[k] = temp;
					i--;
					k++;
				}
			}
			Arrays.sort(arr1);
			Arrays.sort(arr2);
		}
	}
}

public class MergeTwoArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of both arrays : ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr1 = new int[n];
		int[] arr2 = new int[m];
		
		System.out.print("Enter element in Array1 : ");
		for(int i=0; i<n; i++) {
			arr1[i] = sc.nextInt();
		}
		
		System.out.print("Enter elements in Array2 : ");
		for(int i=0; i<m; i++) {
			arr2[i] = sc.nextInt();
		}
		
		Solution12.merge(arr1, arr2);
		
		System.out.print("arr1[] : { ");
		for(int i=0; i<n; i++) {
			System.out.print(arr1[i]+ " ");
		}System.out.print("}\n");
		
		System.out.print("arr2[] : { ");
		for(int i=0; i<m; i++) {
			System.out.print(arr2[i] + " ");
		}System.out.print("}");
	}

}
