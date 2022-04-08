package seriousPracticeDSA.hashing;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter MyHashMap capacity: ");
        int capacity = sc.nextInt();

        MyHashMap myHashMap = new MyHashMap(capacity);
        int[] keys = {49, 52, 64, 42, 78, 56, 77};

        for (int val : keys) {
            myHashMap.insert(val);
        }

        System.out.print("\nArrangement of keys in MyHashMap: ");
        myHashMap.display();

    }
}
