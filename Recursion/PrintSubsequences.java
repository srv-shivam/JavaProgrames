package Recursion;

public class PrintSubsequences {

    private static void subsequences(String str, int idx, String newString) {

        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        // to be in newString
        subsequences(str, idx + 1, newString + currChar);

        // to not be in newString
        subsequences(str, idx + 1, newString);
    }

    public static void main(String[] args) {
        subsequences("abc", 0, "");
    }

}
