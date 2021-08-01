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

    /**
     * reverseLinkedList is method which reverse the LinkedList
     * @param head head
     * @return prev
     */
    private static Node_32 reverseLinkedList(Node_32 head) {
        if (head == null || head.next == null) return head;
        Node_32 prev = null, curr = head, next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    private static Node_32 multiply(Node_32 head, int dig) {

        Node_32 dummy = new Node_32(-1);
        Node_32 ac = dummy;
        int carry = 0, sum;

        while(head != null || carry != 0) {

            sum = carry + (head != null ? head.data : 0) * dig;

            int digit = sum % 10;
            carry = sum / 10;

            ac.next = new Node_32(digit);

            if (head != null) head = head.next;
            ac = ac.next;
        }
        return dummy.next;
    }


    private static void addTwoLinkedList(Node_32 dummy, Node_32 prod) {

        int carry = 0;
        Node_32 curr = dummy;

        while (prod != null || carry != 0) {

            int sum = carry + (curr.next != null ? curr.next.data : 0) + prod.data;
            int digit = sum % 10;
            carry = sum / 10;

            if (curr.next != null)
                curr.next.data = digit;
            else
                curr.next = new Node_32(digit);

            if (prod != null) prod = prod.next;
            curr = curr.next;
        }
    }


    /**
     * Code to be written properly
     * @param l1 l1
     * @param l2 l2
     * @return dummy
     */
    static Node_32 multiplyTwoLinkedList(Node_32 l1, Node_32 l2) {

        if (l1 == null || l2 == null) return null;

        l1 = reverseLinkedList(l1);
        l2 = reverseLinkedList(l2);

        Node_32 l2_Itr = l2;
        Node_32 dummy = new Node_32(-1);
        Node_32 curr = dummy;

        while(l2_Itr != null) {

            Node_32 prod = multiply(l1, l2_Itr.data);

            addTwoLinkedList(curr, prod);
            curr = curr.next;

            l2_Itr = l2_Itr.next;
        }
        return reverseLinkedList(dummy.next);
    }

    /**
     * Method multiplyLL will multiply two LinkedList with Time Complexity O(N or M) (maximum between N and M)
     * and with space complexity O(N or M) (maximum between N and M)
     * @param l1 l1
     * @param l2 l2
     */
    private static void multiplyLL(Node_32 l1, Node_32 l2) {

        if (l1 == null || l2 == null) return;

        long num1 = 0, num2 = 0;

        while(l1 != null) {
            num1 = (num1*10) + l1.data;
            l1 = l1.next;
        }

        while(l2 != null) {
            num2 = (num2*10) + l2.data;
            l2 = l2.next;
        }

        long ans = (long) ((num1*num2) % (Math.pow(10,9) + 7));
        System.out.println("\nMultiplication of two LinkedList is : " + ans);

    }

    private static void printLinkedList(Node_32 head) {
        if (head == null) return;

        System.out.print("\nList is : ");
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        //Input for first Linked List

        System.out.print("Enter the size of first Linked List : ");
        int N = sc.nextInt();

        System.out.print("\nEnter the data of first Linked List : ");
        Node_32 head1 = new Node_32(sc.nextInt());
        Node_32 tail = head1;

        for (int i=0; i<N-1; i++) {
            tail.next = new Node_32(sc.nextInt());
            tail = tail.next;
        }

        //Input for second Linked List

        System.out.print("\nEnter the size of second Linked List : ");
        int M = sc.nextInt();

        System.out.print("\nEnter the data of second Linked List : ");
        Node_32 head2 = new Node_32(sc.nextInt());
        tail = head2;

        for (int j=0; j<M-1; j++) {
            tail.next = new Node_32(sc.nextInt());
            tail = tail.next;
        }

        MultiplyTwoLinkedList.printLinkedList(head1);
        MultiplyTwoLinkedList.printLinkedList(head2);

        MultiplyTwoLinkedList.multiplyLL(head1, head2);

        Node_32 ansHead = MultiplyTwoLinkedList.multiplyTwoLinkedList(head1, head2);
        Node_32 a = ansHead;
        long num = 0;

        while (a != null) {
            num = (num*10) + a.data;
            a = a.next;
        }
        System.out.print("\nMultiplication : " + num);

        MultiplyTwoLinkedList.printLinkedList(ansHead);

    }


}
