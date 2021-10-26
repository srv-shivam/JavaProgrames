package recursion;
import java.util.HashSet;

public class UniqueSubSequences {

    private static void subsequences(String str, int idx, String newString, HashSet<String> set) {

        if (idx == str.length()) {
            if (!set.contains(newString)) {
                System.out.println(newString);
                set.add(newString);
            }
            return;
        }

        char currChar = str.charAt(idx);
        subsequences(str, idx + 1, newString + currChar, set);

        subsequences(str, idx + 1, newString, set);

    }

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        subsequences("aaa", 0, "", set);
    }

}
