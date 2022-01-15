package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfWords {

    private static void countWordFrequency(String[] strArray) {
        if (strArray.length == 0) return;

        Map<String, Integer> hm = new HashMap<>();
        for (String s : strArray) {
            if (hm.containsKey(s)) {
                hm.put(s, hm.get(s) + 1);
            } else {
                hm.put(s, 1);
            }
        }

        System.out.println("Frequency count : " + hm);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArray = str.split(" ");

        countWordFrequency(strArray);

    }
}
