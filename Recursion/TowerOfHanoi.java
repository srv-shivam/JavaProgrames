package Recursion;
import java.util.Scanner;

public class TowerOfHanoi {

    // If disk numbers are like 1 > 2 > 3 > 4 ....... > n-3 > n-2 > n-1 > n
    private static void towerOfHanoi(int i, int n, String src, String helper, String dest) {

        if (i == n) {
            System.out.println("Transfer of disk " + i + " from " + src + " to " + dest);
            return;
        }
        towerOfHanoi(i+1, n, src, dest, helper);
        System.out.println("Transfer of disk " + i + " from " + src + " to " + dest);
        towerOfHanoi(i+1, n, helper, src, dest);
    }

    // If disk numbers are like n > n-1 > n-2 > n-3 > ....... > 4 > 3 > 2 > 1
    private static void towerOfHanoi2(int n, String src, String helper, String dest) {

        if (n == 1) {
            System.out.println("Transfer of disk " + n + " from " + src + " to " + dest);
            return;
        }
        towerOfHanoi2(n-1, src, dest, helper);
        System.out.println("Transfer of disk " + n + " from " + src + " to " + dest);
        towerOfHanoi2(n-1, helper, src, dest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();
//        towerOfHanoi(1, n, "S", "H", "D");
        towerOfHanoi2(n, "A", "B", "C");
    }

}
