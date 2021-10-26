package recursion;
import java.util.Scanner;

public class FirstAndLastOccurrence {

    private static int first = -1, last = -1;
    private static void findFirstAndLastOccurrence(String str, String ch, int index) {
        if (index == str.length()) {
            System.out.print("\nFirst index : " + first + "\nLast index: " + last);
            return;
        }
        if (str.charAt(index) == ch.toCharArray()[0]) {
            if (first == -1) {
                first = index;
            } else {
                last = index;
            }
        }
        findFirstAndLastOccurrence(str, ch, index+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String str = sc.next();
        System.out.print("\nEnter character to find for : ");
        String ch = sc.next();
        findFirstAndLastOccurrence(str, ch, 0);
    }

}
