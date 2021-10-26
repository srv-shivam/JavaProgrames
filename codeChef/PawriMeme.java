package codeChef;

import java.util.Scanner;
public class PawriMeme {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0) {
			
			String str = sc.next();
			String replaceString = str.replaceAll("party","pawri");
			
			System.out.println(replaceString);
			t--;
		}
	}
}
