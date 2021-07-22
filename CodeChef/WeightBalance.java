package CodeChef;

import java.util.Scanner;
public class WeightBalance {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) {
			
			int w1 = sc.nextInt();
			int w2 = sc.nextInt();
			int x1 = sc.nextInt();
			int x2 = sc.nextInt();
			int M = sc.nextInt();
			
			int w = w2 - w1;
			int minRange = x1 * M;
			int maxRange = x2 * M;
			
			if(minRange <= w && w <= maxRange) {
				System.out.println("1");
			} else
				System.out.println("0");
			
			t--;
		}
	}

}
