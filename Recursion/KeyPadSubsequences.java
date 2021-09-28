package Recursion;

public class KeyPadSubsequences {

    private static final String[] keyPad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    private static void printCombinations(String str, int idx, String combinations) {

        if (idx == str.length()) {
            System.out.println(combinations);
            return;
        }

        char currChar = str.charAt(idx);
        String mapping = keyPad[currChar - '0'];

        for (int i=0; i<mapping.length(); i++) {
            printCombinations(str, idx + 1, combinations + mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str = "123";
        printCombinations(str, 0, "");
    }

}
