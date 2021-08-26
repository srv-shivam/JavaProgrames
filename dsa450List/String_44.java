package dsa450List;

import java.util.*;

public class String_44 {

    static String computeFirstNonRepeating(String str) {
        int[] c = new int[26];
        Queue<Character> q = new LinkedList<>();
        StringBuilder result = new StringBuilder();

        for (int i=0; i<str.length(); i++) {

            ++c[str.charAt(i)-'a'];

            if (c[str.charAt(i)-97] == 1) {
                q.add(str.charAt(i));
            }

            while (!q.isEmpty()) {
                if (c[q.peek()-97] == 1) {
                    result.append(q.peek());
                    break;
                }
                else q.remove();
            }
            if (q.isEmpty()) result.append("#");
//            else result += q.peek();
        }
        return result.toString();
    }

    /**
     * Solution using Map and Queue
     **/
    static String firstNonRepeating(String str) {

        if (Objects.equals(str, "")) return " ";

        Map<Character, Integer> charMap = new HashMap<>();
        Queue<Character> q = new LinkedList<>();
        String result = "";

        for (int i=0; i<str.length(); i++) {

            charMap.put(str.charAt(i), charMap.getOrDefault(str.charAt(i), 0) + 1);

            if (charMap.get(str.charAt(i)) == 1) {
                q.add(str.charAt(i));
            }

            while (!q.isEmpty()) {
                if (charMap.get(q.peek()) == 1) {
                    break;
                } else {
                    q.remove();
                }
            }

            if (q.isEmpty()) result += "#";
            else result += q.peek();
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.next();
        System.out.println("String is : " + str);

        String string = computeFirstNonRepeating(str);
        System.out.print("\nResult is : " + string);

    }
}
