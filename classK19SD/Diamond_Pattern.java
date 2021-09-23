package classK19SD;
import java.util.Scanner;

public class Diamond_Pattern {

    private static void pattern(int n) {

        for(int i=1; i<=n; i++) {
            //Spaces
            for(int j=1; j<=(n-i); j++)
                System.out.print(" ");
            //1st part numbers
            for(int j=i; j>=1; j--)
                System.out.print("*");
            //2nd part numbers
            for(int j=2; j<=i; j++)
                System.out.print("*");

            System.out.println();
        }

        for(int i=n; i>=1; i--) {
            //Spaces
            for(int j=1; j<=(n-i); j++)
                System.out.print(" ");
            //1st part numbers
            for(int j=i; j>=1; j--)
                System.out.print("*");
            //2nd part numbers
            for(int j=2; j<=i; j++)
                System.out.print("*");

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        Diamond_Pattern.pattern(n);
    }
}
