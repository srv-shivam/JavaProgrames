package dsa450List;

import java.util.Scanner;

class Node_34 {
    int data;
    Node_34 next;

    Node_34(int data) {
        this.data =  data;
        this.next = null;
    }
}

public class LinkedList_34 {

    static Node_34 segregate_ODD_EVEN(Node_34 head) {

        if (head == null || head.next == null) return head;

        Node_34 dummy1 = new Node_34(-1);
        Node_34 dummy2 = new Node_34(-1);
        Node_34 d1 = dummy1, d2 = dummy2, curr = head;

        while(curr != null) {

            /**
             * curr.data % 2 == 0 can be also witten as,
             * 1) (curr.data ^ 1) == curr.data + 1 results in EVEN
             * 2) (curr.data & 1) == 0 results in EVEN
             * 3) (curr.data | 1) > curr.data results in EVEN
             * and vice versa
             */
            if ((curr.data ^ 1) == (curr.data + 1)) {
                d1.next = curr;
                d1 = d1.next;
            }
            else {
                d2.next = curr;
                d2 = d2.next;
            }
            curr = curr.next;
        }
        d1.next = dummy2.next;
        d2.next = null;
        return dummy1.next;
    }

    static void displayLinkedList(Node_34 head) {
        System.out.print("LinkedList is : ");
        while (head != null) {
            if (head.next == null) {
                System.out.println(head.data);
                break;
            }
            System.out.print(head.data + " -> ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of LinkedList : ");
        int size = sc.nextInt();
        System.out.print("Enter the data : ");
        Node_34 head = new Node_34(sc.nextInt());
        Node_34 tail = head;
        --size;
        while(size --> 0) {
            Node_34 newNode = new Node_34(sc.nextInt());
            tail.next = newNode;
            tail = tail.next;
        }
        displayLinkedList(head);

        displayLinkedList(segregate_ODD_EVEN(head));
    }
}
