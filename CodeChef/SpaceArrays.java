package CodeChef;

import java.util.*;
public class SpaceArrays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t>0) {
			
			int N = sc.nextInt();
			int Narray[] = new int[N];
			
			for(int i=0; i<N; i++) {
				Narray[i] = sc.nextInt();
			}
			
			Arrays.sort(Narray);
			int diff = 0, flag = 0;
			
			for(int i=0; i<N; i++) {
				
				if(Narray[i] > (i+1)) {
					System.out.println("Second");
					flag = 1;
					break;
				}
				else {
					diff = diff + ((i+1) - Narray[i]);
				}
			}
			
			if(diff % 2 == 0 && flag == 0) {
				System.out.println("Second");
			}
			else if(diff % 2 !=0 && flag == 0) {
				System.out.println("First");
			}
			
			t--;
		}
	}
}