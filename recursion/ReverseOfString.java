package recursion;
import java.util.Scanner;

public class ReverseOfString {

    private static void printReverseString(int index, String str) {
        if (index == 0) {
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        printReverseString(index-1, str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.next();
        printReverseString(str.length()-1, str);
    }
}
