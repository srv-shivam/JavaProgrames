package seriousPracticeDSA.recursionQuestions;

import java.util.Scanner;

/*
 * Program to find position of the element in an array using recursion
 */
public class Problem7 {

    // To apply binary search first array should be sorted
    // Time Complexity: O(Log N)
    // Space Complexity: O(Log N)
    static int binarySearch(int[] arr, int key, int mid, int start, int end) {

        if (start > end) {
            return -1;
        }

        if (arr[mid] == key) {
            return mid;
        }

        if (arr[mid] > key) {
            return binarySearch(arr, key, (start+end)/2, start, mid-1);
        } else {
            return binarySearch(arr, key, (start + end) / 2, mid + 1, end);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i=0; i<n; ++i) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int pos = binarySearch(arr, key, n/2, 0, n-1);

        System.out.println("Element found at position: " + (pos==-1?pos:pos+1));
    }
}
