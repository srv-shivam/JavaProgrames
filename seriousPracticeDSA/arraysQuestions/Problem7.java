package seriousPracticeDSA.arraysQuestions;

/*
 * WAP to left rotate array elements with D position
 *
 * eg: I/P: 2 8 3 9 1 6  D: 3
 *     O/P: 9 1 6 2 8 3
 */

import java.util.Scanner;

public class Problem7 {

    private static void reverse(int[] arr, int start, int end) {

        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            ++start; --end;
        }
    }

    static void rotateByDPosition(int[] arr, int D) {

        int d = D%6;

        reverse(arr, 0, d-1);

        reverse(arr, d, arr.length-1);

        reverse(arr, 0, arr.length-1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; ++i) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value of d: ");
        int d = sc.nextInt();

        rotateByDPosition(arr, d);

        System.out.print("Updated Array: ");
        for(int val : arr) {
            System.out.print(val + " ");
        }
    }
}
