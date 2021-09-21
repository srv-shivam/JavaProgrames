package classK19SD;
import java.util.Scanner;

public class SolidRhombus_Pattern {

    private static void pattern(int n) {

        for(int i=1; i<=n; i++) {

            int spaces = (n-i);
            for(int j=spaces; j>=1; j--)
                System.out.print(" ");

            for(int j=1; j<=n; j++)
                System.out.print("*");

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        SolidRhombus_Pattern.pattern(n);
    }
}
