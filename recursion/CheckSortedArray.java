package recursion;

import java.util.Scanner;

public class CheckSortedArray {

    private static boolean checkArraySorted(int arr[], int index) {

        if (index == arr.length - 1) {
            return true;
        }

        if (arr[index] < arr[index+1]) {
            return checkArraySorted(arr, index + 1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.print("Enter array elements : ");
        for (int i=0; i<size; i++)
            arr[i] = sc.nextInt();

        if (checkArraySorted(arr, 0))
            System.out.print("Array is sorted!!");
        else
            System.out.print("Array is not sorted!!");
    }

}
