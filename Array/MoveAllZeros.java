package Array;
import java.util.Scanner;

public class MoveAllZeros {

    static void moveAllZerosToEnd(int[] arr, int n) {

        int j=0; // j will point to the indexes where value is 0
        for(int i=0; i<n; ++i) {
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0) {
                ++j;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter data :");
        for(int i=0; i<n; ++i) {
            arr[i] = sc.nextInt();
        }

        MoveAllZeros.moveAllZerosToEnd(arr, n);
        System.out.print("\nUpdated Array : ");
        for(int i=0; i<n; ++i) {
            System.out.print(arr[i] + " ");
        }
    }

}
