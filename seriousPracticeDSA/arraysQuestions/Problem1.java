package seriousPracticeDSA.arraysQuestions;

/*
 * Count/Find A Pair of numbers in array with given vale K
 */
import java.util.Scanner;

public class Problem1 {

    static void countPair(int[] arr, int n, int k) {

        int count = 0;

        for (int i=0 ; i<n; ++i) {
            for(int j=i; j<n; ++j) {

                if ((arr[j] < k) && (arr[i] + arr[j]) == k) ++count;
            }
        }
        System.out.println("Total count of Pair : " + count);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size : ");
        int n = sc.nextInt();

        System.out.print("Enter elements : ");
        int []arr = new int[n];

        for(int i=0; i<n; ++i) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter vale K : ");
        int k = sc.nextInt();

        countPair(arr, n, k);
    }
}
