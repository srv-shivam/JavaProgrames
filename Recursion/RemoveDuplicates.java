package Recursion;

public class RemoveDuplicates {

    private static final boolean[] charArray = new boolean[26];

    private static void removeDuplicate(String str, int idx, String newString) {

        if (idx == str.length()) {
            System.out.print(newString);
            return;
        }
        char currChar = str.charAt(idx);
        int index = currChar - 'a';

        if (!charArray[index]) {
            charArray[index] = true;
            newString += currChar;
        }
        removeDuplicate(str, idx + 1, newString);
    }

    public static void main(String[] args) {
        String str = "abbccdad";
        removeDuplicate(str, 0, "");
    }

}
