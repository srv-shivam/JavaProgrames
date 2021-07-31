package dsa450List;

import java.util.Scanner;

class Node_32 {
    int data;
    Node_32 next;

    Node_32(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MultiplyTwoLinkedList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /**
         * Input for first Linked List
         */
        System.out.print("Enter the size of first Linked List : ");
        int N = sc.nextInt();

        System.out.print("\nEnter the data of first Linked List : ");
        Node_32 head1 = new Node_32(sc.nextInt());
        Node_32 tail = head1;

        for (int i=0; i<N-1; i++) {
            tail.next = new Node_32(sc.nextInt());
            tail = tail.next;
        }

        /**
         * Input for second Linked List
         */
        System.out.print("\nEnter the size of second Linked List : ");
        int M = sc.nextInt();

        System.out.print("\nEnter the data of second Linked List : ");
        Node_32 head2 = new Node_32(sc.nextInt());
        tail = head2;

        for (int j=0; j<M-1; j++) {
            tail.next = new Node_32(sc.nextInt());
            tail = tail.next;
        }

    }


}
