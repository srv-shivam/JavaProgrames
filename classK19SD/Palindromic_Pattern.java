package classK19SD;
import java.util.Scanner;

public class Palindromic_Pattern {

    private static void pattern(int n) {

        for(int i=1; i<=n; i++) {

            //Spaces
            for(int j=1; j<=(n-i); j++)
                System.out.print(" ");

            for(int j=i; j>1; j--)
                System.out.print(j);

            for(int j=1; j<=i; j++)
                System.out.print(j);

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        Palindromic_Pattern.pattern(n);
    }
}
