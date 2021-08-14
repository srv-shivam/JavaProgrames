package dsa450List;
import java.util.Scanner;

/**
 * Delete nodes having greater value on right
 *
 * Given a singly linked list, remove all the nodes which have a greater value on its following nodes.
 */
class Node_33 {
    int data;
    Node_33 next;

    Node_33(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList_33 {

    static Node_33 reverseLinkedList(Node_33 head) {

        Node_33 prev = null, curr = head, next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    static Node_33 compute(Node_33 head) {

        if (head == null || head.next == null) return head;

        head = reverseLinkedList(head);

        Node_33 dummy = new Node_33(-1);
        Node_33 d = dummy, curr = head;
        int max_so_far = Integer.MIN_VALUE;

        while(curr != null) {

            if (curr.data >= max_so_far) {
                max_so_far = curr.data;
                d.next = curr;
                d = d.next;
            }
            curr = curr.next;
        }
        d.next = null;
        return reverseLinkedList(dummy.next);
    }

    static void displayLinkedList(Node_33 head) {
        System.out.print("Linked List is : ");
        while(head != null) {
            if (head.next == null) {
                System.out.print(head.data + "\n");
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
        Node_33 head = new Node_33(sc.nextInt());
        --size;
        Node_33 ptr = head;
        while(size--> 0) {
            ptr.next = new Node_33(sc.nextInt());
            ptr = ptr.next;
        }

        LinkedList_33.displayLinkedList(head);

        LinkedList_33.displayLinkedList(LinkedList_33.compute(head));
    }
}
