package classK19SD;
import java.util.Scanner;

public class PyramidNumber_Pattern {

    private static void pattern(int n) {

        for(int i=1; i<=n; i++) {

            //Spaces
            for(int j=1; j<=(n-i); j++)
                System.out.print(" ");

            //Numbers
            for(int j=1; j<=i; j++)
                System.out.print(i+" ");

            System.out.println();

        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        PyramidNumber_Pattern.pattern(n);
    }
}
