package dsa450List;
import java.util.Scanner;

class Node_31 {
    int data;
    Node_31 next;

    Node_31(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeKSortedLinkedList {

    private static Node_31 sortLinkedList(Node_31 l1, Node_31 l2) {

        if (l1 == null || l2 == null) return l1 != null ? l1 : l2;

        Node_31 dummy = new Node_31(-1);
        Node_31 c1 = l1, c2 = l2, curr = dummy;

        while(c1 != null && c2 != null) {

            if (c1.data < c2.data) {
                curr.next = c1;
                c1 = c1.next;
            } else {
                curr.next = c2;
                c2 = c2.next;
            }
            curr = curr.next;
        }

        curr.next = c1 != null ? c1 : c2;
        return dummy.next;
    }

    private static Node_31 mergeLinkedList(Node_31[] arr, int start, int end) {
        if (start > end) return null;
        if (start == end) return arr[start];

        int mid = (start + end)/2;
        Node_31 l1 = mergeLinkedList(arr, start, mid);
        Node_31 l2 = mergeLinkedList(arr, mid+1, end);

        return sortLinkedList(l1, l2);
    }


    private static void printLinkedList(Node_31 head) {
        if (head == null)  {
            System.out.println("null");
        }
        else {
            System.out.print("Linked List is  : ");
            while(head != null) {
                System.out.print(head.data + " ");
                head = head.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Length of Head Node Array : ");
        int K = sc.nextInt();

        Node_31[] arr = new Node_31[K];

        System.out.print("\nEnter the data : ");
        for (int i=0; i<K; i++) {

            System.out.print("\nEnter the Length of " + " LinkedList " + (i+1) + " : ");
            int n = sc.nextInt();

            System.out.print("\nEnter the data of " + " LinkedList " + (i+1) + " : ");
            Node_31 head = new Node_31(sc.nextInt());
            Node_31 tail = head;

            for (int j=0; j<n-1; j++) {
                tail.next = new Node_31(sc.nextInt());
                tail = tail.next;
            }

            arr[i] = head;
        }

        Node_31 nHead = MergeKSortedLinkedList.mergeLinkedList(arr, 0, K-1);
        MergeKSortedLinkedList.printLinkedList(nHead);
    }
}
