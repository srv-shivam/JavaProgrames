package codeChef;

import java.util.*;
public class Interesting_XOR {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long t = sc.nextLong();
		while(t > 0) {
			
			long C = sc.nextLong();
			long d = (long)(Math.log(C)/Math.log(2));
//			boolean temp = true;
//			while(temp) {
//				
//				if(Math.pow(2, d) > C) {
//					temp = false;
//				}
//				else
//					++d;
//			}
			
			long A = (long)(Math.pow(2, d)-1);
			long B = (long)(Math.pow(2, d)-1);
            long maxProduct = -1;
//			ArrayList <Long> result = new ArrayList<>((int)Math.pow(2, d));
			
			for(long i=(int)A; i>=0; i--) {
				
				if(maxProduct < (i*(i^C)))
					maxProduct = (i*(i^C));
//				B = i^C;
//				result.add(i*B);
			}
			
//			Collections.sort(result);
//			System.out.println(result.get(result.size()-1));
			System.out.println(maxProduct);
			--t;
		}
	}
}