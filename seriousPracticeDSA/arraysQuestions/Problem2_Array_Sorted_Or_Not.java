package seriousPracticeDSA.arraysQuestions;

/*
 * Check If Array is sorted or not
 * eg: I/P: 10 12 18 24
 *     O/P: Yes
 *
 *     I/P: 1 9 45 2 12
 *     O/P: NO
 */
import java.util.Scanner;

public class Problem2_Array_Sorted_Or_Not {

    static boolean isSorted(int[] arr) {

        boolean flag1 = true;
        boolean flag2 = true;

        for (int i=1; i<arr.length; ++i) {
            if (arr[i] > arr[i-1]) {
                flag1 = false;
                break;
            }
        }

        for (int i=1; i<arr.length; ++i) {
            if (arr[i] < arr[i-1]) {
                flag2 = false;
                break;
            }
        }

        return flag1 || flag2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i=0; i<n; ++i) {
            arr[i] = sc.nextInt();
        }

        if (isSorted(arr)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
