package classK19SD;
import java.util.Scanner;

public class FibonacciSeries_Recursion {

    private static void fibonacciSequence(int a, int b, int n) {
        if (n==0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        fibonacciSequence(b, c, n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        int a = 0, b = 1;
        System.out.print(a + "\n" + b + "\n");
        fibonacciSequence(a, b, n-2);
    }

}
