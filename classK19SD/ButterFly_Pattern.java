package classK19SD;
import java.util.Scanner;

public class ButterFly_Pattern {

    private static void pattern(int n) {

        //Upper-half
        for(int i=1; i<=n; i++) {

            //1st part of stars
            for(int j=1; j<=i; j++)
                System.out.print("*");

            //Spaces
            int spaces = 2*(n-i);
            for(int j=1; j<=spaces; j++)
                System.out.print(" ");

            //2nd part of stars
            for(int j=1; j<=i; j++)
                System.out.print("*");

            System.out.println();
        }

        //Lower-half
        for(int i=n; i>=1; i--) {

            //1st part of stars
            for(int j=1; j<=i; j++)
                System.out.print("*");

            //Spaces
            int spaces = 2*(n-i);
            for(int j=1; j<=spaces; j++)
                System.out.print(" ");

            //2nd part of stars
            for(int j=1; j<=i; j++)
                System.out.print("*");

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the vale of n : ");
        int n = sc.nextInt();
        ButterFly_Pattern.pattern(n);
    }
}
