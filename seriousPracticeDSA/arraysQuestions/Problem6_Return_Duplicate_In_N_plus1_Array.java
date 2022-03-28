package seriousPracticeDSA.arraysQuestions;

/*
 * Return the duplicate element in array of size N+1 with elements containing [1..N] without using extra space
 *
 * eg: I/P: [3,1,3,4,2]   Here, N=5, Elements range between [1..4]
 *     O/P: 3
 */
import java.util.Scanner;

public class Problem6_Return_Duplicate_In_N_plus1_Array {

    static int duplicateElement(int[] arr) {

        for (int i=0; i<arr.length; ++i) {

            int idx = Math.abs(arr[i]);
            int value = arr[idx];

            if (value < 0) {
                return idx;
            } else {
                arr[idx] *= -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i=0; i<n; ++i) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Duplicate element: " + duplicateElement(arr));
    }

}
