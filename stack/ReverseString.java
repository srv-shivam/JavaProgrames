package stack;

import java.util.Scanner;

public class ReverseString {

    static String reverse(String str) {
        Stack<Character> stack  = new Stack<>();
        char[] chars = str.toCharArray();

        for (char c : chars) {
            stack.push(c);
        }

        for (int i=0; i< chars.length; ++i) {
            chars[i] = stack.pop();
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.next();

        System.out.println("Before Reverse : " + str);
        System.out.println("After Reverse : " + reverse(str));
    }

}
