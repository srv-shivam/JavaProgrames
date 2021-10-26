package recursion;

public class StringPermutation {

    private static void printPermutation(String str, String permutation) {

        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }

        for (int i=0; i<str.length(); i++) {
            char currChar = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i+1);
            printPermutation(newString, permutation + currChar);
        }

    }

    public static void main(String[] args) {
        String str = "abc";
        printPermutation(str, "");
    }
}
