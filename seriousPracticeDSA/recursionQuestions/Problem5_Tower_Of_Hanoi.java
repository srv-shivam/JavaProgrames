package seriousPracticeDSA.recursionQuestions;

/*
 * Program to write Tower of Hanoi Problem
 */

import java.util.Scanner;

public class Problem5_Tower_Of_Hanoi {

    static void generateMoves(int discs, char start, char auxiliary, char destination) {

        if (discs == 1) {
            System.out.println("Move " + discs + " from " + start + " to " + destination);
            return;
        }

        generateMoves(discs - 1, start, destination, auxiliary);
        System.out.println("Move " + discs + " from " + start + " to " + destination);
        generateMoves(discs - 1, auxiliary, start, destination);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of discs: ");
        int discs = sc.nextInt();

        generateMoves(discs, 'A', 'B', 'C');
    }
}
