package classK19SD;

import java.util.Scanner;
public class TripletsSolution {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[3];
		int b[] = new int[3];
		
		System.out.print("Enter player 1 points : ");
		for(int i=0; i<3; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.print("\nEnter player 2 points : ");
		for(int i=0; i<3; i++) {
			b[i] = sc.nextInt();
		}
		
		int ans[] = TripletsSolution.compareTriplets(a, b);
		
		System.out.println(ans[0] + " " + ans[1]);
	}
	
	static int[] compareTriplets(int a[], int b[]) {
		
		int c1 = 0;
		int c2 = 0;
		
		for(int i=0; i<3; i++) {
			
			if(a[i] > b[i]) {
				c1++;
			} else if(b[i] > a[i]) {
				c2++;
			}
		}
		
		int ans[] = new int[2];
		ans[0] = c1;
		ans[1] = c2;
		
		return ans;
	}

}
