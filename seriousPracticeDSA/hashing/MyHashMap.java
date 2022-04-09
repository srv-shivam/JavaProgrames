package seriousPracticeDSA.hashing;

import java.util.Arrays;

public class MyHashMap {
    static int[] hashTable;
    static int capacity, size;

    MyHashMap(int cap) {
        capacity = cap;
        size = 0;
        hashTable = new int[capacity];
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

            // After traversing whole hashTable when "i" arrives back to initial value
            // of i which was set before the loop, means we didn't find the key
            if (i == h)
                return false;
        }
        return false;
    }

    boolean insert(int key) {

        // HashTable is completely filled no space to insert
        if (size == capacity)
            return false;

        int i = hash(key);

        while (hashTable[i] != -1 && hashTable[i] != -2 && hashTable[i] != key)
            i = (i + 1) % capacity;

        // Key is already present
        if (key == hashTable[i])
            return false;
        else {
            hashTable[i] = key;
            ++size;
            return true;
        }
    }

    boolean erase(int key) {
        int h = hash(key);
        int i = h;

        while (hashTable[i] != -1) {
            if (hashTable[i] == key) {
                hashTable[i] = -2;
                --size;
                return true;
            }
            i = (i + 1) % capacity;

            if (i == h)
                return false;
        }
        return false;
    }

    void display() {
        for (int val : hashTable) {
            System.out.print(val + " ");
        }
    }
}