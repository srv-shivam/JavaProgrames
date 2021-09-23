package classK19SD;
import java.util.Scanner;

public class FactorialWith_Recursion {

    // Factorial of number using recursion
    private static void factorialOfNumber(int n, int factorial) {
        if (n==1) {
            System.out.println("Factorial is : " + factorial);
            return;
        }
        factorial *= n;
        factorialOfNumber(n-1, factorial);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        factorialOfNumber(n, 1);
    }
}
