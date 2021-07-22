package dsa450List;

import java.util.Scanner;

class ListNode {
	int data;
	ListNode next;

	ListNode(int key) {
		data = key;
		next = null;
	}
}

class Solution_13 {

	static ListNode midNode(ListNode head) {

		ListNode fast = head;
		ListNode slow = head;

		while (fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}

	static ListNode merge(ListNode l1, ListNode l2) {

		if (l1 == null || l2 == null)
			return l1 != null ? l1 : l2;

		ListNode res = new ListNode(-1);
		ListNode tail = res;

		while (l1 != null && l2 != null) {

			if (l1.data < l2.data) {
				tail.next = l1;
				l1 = l1.next;
			} else {
				tail.next = l2;
				l2 = l2.next;
			}
			tail = tail.next;
		}

		if (l1 != null)
			tail.next = l1;
		else
			tail.next = l2;

		return res.next;
	}

	static ListNode mergeSort(ListNode head) {

		if (head == null || head.next == null)
			return head;

		ListNode mid = midNode(head);
		ListNode nHead = mid.next; // right side
		mid.next = null;

		return merge(mergeSort(head), mergeSort(nHead));
	}

}

public class MergeSortLinkedList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter size : ");
		int n = sc.nextInt();
		
		System.out.print("\nEnter elements : ");
		ListNode head = new ListNode(sc.nextInt());
		ListNode tail = head;
		while (n-- > 1) {
			tail.next = new ListNode(sc.nextInt());
			tail = tail.next;
		}
		
		System.out.print("\nUnsorted List : ");
		printList(head);

		System.out.print("\nSorted List : ");
		head = new Solution_13().mergeSort(head);
		printList(head);
		System.out.println();
	}

	public static void printList(ListNode head) {
		if (head == null)
			return;

		ListNode temp = head;
		while (temp != null) {
			System.out.print(temp.data + " --> ");
			temp = temp.next;
		}
		System.out.print("null");
	}

}
