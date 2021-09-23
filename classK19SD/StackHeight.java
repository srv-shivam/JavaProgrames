package classK19SD;
import java.util.Scanner;

public class StackHeight {

    private static int calPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return calPower(x, n/2) * calPower(x, n/2);
        }
        else {
            return calPower(x, n/2) * calPower(x, n/2) * x;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x and n : ");
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(x + " to the power of " + n + " is : " + calPower(x, n));
    }
}
