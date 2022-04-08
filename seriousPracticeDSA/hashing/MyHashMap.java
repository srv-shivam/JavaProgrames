package seriousPracticeDSA.hashing;

import java.util.Arrays;

public class MyHashMap {

    static int[] hashTable;
    static int capacity, size;

    MyHashMap(int cap) {
        capacity = cap;
        size = 0;
        Arrays.fill(hashTable, -1);
    }

    int hash(int key) {
        return (key % capacity);
    }

    boolean search(int key) {
        int h = hash(key);
        int i = h;
        while (hashTable[i] != -1) {
            if (hashTable[i] == key)
                return true;
            // we are circularly rotating i in hashTable array
            i = (i + 1) % capacity;

            // After traversing whole hashTable when i arrives back to initial value
            // of i which was set before the loop, means we didn't find the key
            if (i == h)
                return false;
        }
        return false;
    }

    void insert(int key) {
        int h = hash(key);
        int i = h;

        while (hashTable[i] != -1) {
            i = (i + 1) % capacity;

            if (i == h) {
                System.out.println("Error!!");
                return;
            }
        }
        hashTable[i] = key;
    }

    void delete(int key) {
        int h = hash(key);
        int i = h;

        while (hashTable[i] != -1) {
            if (hashTable[i] == key) {
                hashTable[i] = -2;
                return;
            }
            i = (i + 1) % capacity;

            if (i == h) {
                System.out.println("Error!!");
                return;
            }
        }
    }
}