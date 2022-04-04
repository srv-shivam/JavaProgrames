package seriousPracticeDSA.linkedListQuestions;

/*
 * Program to swap the Kth Node from beginning and end
 *
 * eg: I/P: 1 -> 2 -> 3 -> 4 -> 5 -> null   K = 2
 *     O/P: 1 -> 4 -> 3 -> 2 -> 5 -> null
 */

import java.util.Scanner;

class ListNode {
    int value;
    ListNode next;

    ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}

public class Problem1_Swap_kth_Node {

    static ListNode swapNodes(ListNode head, int k) {

        if (head == null) return head;

        ListNode curr = head;
        int size = 1;

        while (curr.next != null) {
            ++size;
            curr = curr.next;
        }

        int count = 1;
        int backCount = (size - k) + 1;

        ListNode c1 = head;
        ListNode c2 = head;
        curr = head;

        while (curr != null) {
            if (count == k) {
                c1 = curr;
            }
            if (count == backCount) {
                c2 = curr;
            }
            ++count;
            curr = curr.next;
        }

        int temp = c1.value;
        c1.value = c2.value;
        c2.value = temp;
        System.out.println("Size: " + size);
        return head;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        ListNode head = new ListNode(sc.nextInt());
        ListNode tail = head;
        n -= 1;

        while (n-- > 0) {
            tail.next = new ListNode(sc.nextInt());
            tail = tail.next;
        }
        System.out.print("Enter value of K: ");
        int k = sc.nextInt();

        head = swapNodes(head, k);
        tail = head;

        while (tail != null) {
            if (tail.next == null) {
                System.out.print(tail.value + " -> null");
                break;
            }
            System.out.print(tail.value + " -> ");
            tail = tail.next;
        }
    }

}
