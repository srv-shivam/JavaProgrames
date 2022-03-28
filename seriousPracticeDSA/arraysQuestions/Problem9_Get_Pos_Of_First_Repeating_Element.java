package seriousPracticeDSA.arraysQuestions;

/**
 * Program to get the index of first repeating element in an array
 *
 * eg: I/P: arr [1 5 3 4 3 5 6]
 *     O/P: 2 (5 is the first repeating element whose index is 2 (follow 1 based indexing))
 */

import java.util.HashMap;
import java.util.Scanner;

public class Problem9_Get_Pos_Of_First_Repeating_Element {

    // Time Complexity: O(N^2)
    // Space Complexity: O(1)
    static int firstRepeated1(int[] arr) {

        for (int i=0; i<arr.length-1; ++i) {
            for (int j=i+1; j< arr.length; ++j) {
                if (arr[i] == arr[j]) return i+1;
            }
        }
        return -1;
    }


    // Time Complexity: O(N)
    // Space Complexity: O(N)
    static int firstRepeated(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<arr.length; ++i) {

            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        int i = 1;
        for (int val : arr) {
            if (map.get(val) > 1)
                return i;
            ++i;
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        System.out.print("Enter elements : ");
        int[] arr = new int[n];
        for (int i=0; i<n; ++i) {
            arr[i] = sc.nextInt();
        }

        int pos1 = firstRepeated1(arr);
        System.out.println("First repeated element position (Using O(N^2 approach)): " + pos1);

        int pos2 = firstRepeated(arr);
        System.out.println("First repeated element position: (Using O(N) space and time ) " + pos2);
    }

}
