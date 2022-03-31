package seriousPracticeDSA.recursionQuestions;

/* Leetcode Question No. 779
 *
 * We need to generate the nth sequence as specified
 * Initially 1st row will be 0 and to generate next row we need to check previous row and replace
 * each 0 with 01 and each 1 with 10 to generate the next row
 *
 * eg: N = 3
 *     Sequence: 0  01  0110
 *
 * NOTE: row 1:        0
 *       row 2:       0 1
 *       row 3:     0 1 1 0
 *       row 4: 0 1 1 0 1 0 0 1
 *
 * Here, we can notice that for 0 -> 0 1 is generated
 *                      and for 1 -> 1 0 is generated
 *
 * Means each pair digits are related with parent if previous row is 0 than if Kth position for this parents
 * pair is odder than it will be same as the parent and if it is evener than it is complimented of it's parent
 *
 */

import java.util.Scanner;

public class Problem11_Kth_Symbol_In_Grammar {

    static int generate(int n, int k) {

        if (n == 1) {
            return 0;
        }

        int parent = generate(n - 1, k >> 2 + k % 2);
        boolean isK = k % 2 == 1; // if ODD = true,  EVEN = false

        if (parent == 1) {
            return isK ? 1 : 0;
        } else {
            return isK ? 0 : 1;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of N and K: ");
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println("Kth bit of Nth row is: " + generate(n, k));
    }

}
