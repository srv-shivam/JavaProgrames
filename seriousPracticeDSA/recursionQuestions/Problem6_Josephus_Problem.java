package seriousPracticeDSA.recursionQuestions;

/*
 * Josephus Problem:-
 * Here we are given N person standing in a circle, and they need to kill the Kth-1 person net to the current person
 * And we need to return the survivor of the game
 *
 * eg: I/P: N=5 K=3
 *     O/P: Person 3
 */

import java.util.Scanner;

public class Problem6_Josephus_Problem {

    static int jos(int n, int k) {

        if (n == 1) return 0;

        return ((jos(n-1, k)) + k) % n;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N person: ");
        int n = sc.nextInt();
        System.out.print("Enter value of K: ");
        int k = sc.nextInt();

        System.out.println("Survivor is Person " + jos(n, k));
    }
}
