package dsa450List;

import java.util.Scanner;

public class String_44 {

    static String firstNonRepeating(String str) {

        if (str == "") return " ";

        String result = String.valueOf(str.charAt(0));
        char firstNon = str.charAt(0);

        for (int i=1; i<str.length(); i++) {
            boolean flag = false;
            for (int j = 0; j<i; j++) {
                if (!(str.charAt(j) == str.charAt(i))) {
                    flag = true;
                }
                else {
                    flag = false;
                }
            }
            if (flag) {
                firstNon = str.charAt(i);
                result += String.valueOf(firstNon);
            }
            else
                result += String.valueOf('#');

        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.next();
        System.out.print("String is : " + str);

        String string = firstNonRepeating(str);
        System.out.print("\nResult is : " + string);
    }
}
