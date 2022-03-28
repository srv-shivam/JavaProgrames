package seriousPracticeDSA.arraysQuestions;

/*
 * Program to find the position and element of 2nd largest element of array
 */
import java.util.Scanner;

public class Problem3_Find_Pos_Of_2nd_Largest_Element {

    static int secondLargestElement(int[] arr) {

        int largest = -1;
        int secondLargest = -1;
        int pos = -1;

        for (int i=0; i<arr.length; ++i) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
                pos = i;
            }
            else if(arr[i]!=largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: (Greater than 2) ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i=0; i<n; ++i) {
            arr[i] = sc.nextInt();
        }

        int pos = secondLargestElement(arr);
        System.out.println("Element: " + pos);
    }
}
