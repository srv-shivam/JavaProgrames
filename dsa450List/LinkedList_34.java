package dsa450List;
import java.util.Scanner;

/**
 * Delete nodes having greater value on right
 *
 * Given a singly linked list, remove all the nodes which have a greater value on its following nodes.
 */
class Node_34 {
    int data;
    Node_34 next;

    Node_34(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList_34 {

    static Node_34 compute(Node_34 head) {



        return null;
    }

    static void displayLinkedList(Node_34 head) {
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
        Node_34 head = new Node_34(sc.nextInt());
        --size;
        Node_34 ptr = head;
        while(size--> 0) {
            ptr.next = new Node_34(sc.nextInt());
            ptr = ptr.next;
        }

        LinkedList_34.displayLinkedList(head);
    }
}
