package codeChef;

import java.util.Scanner;
public class MatrixXOR {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t > 0) {
			
			int N = sc.nextInt();
			int M = sc.nextInt();
			int K = sc.nextInt();
			
			int xor = 0;
			
			for(int i=1; i<=N ; i++) {
				for(int j=1; j<=M; j++) {
					xor = xor ^ (K+i+j);
				}
			}
			
			System.out.println(xor);
			t--;
		}
	}
}
