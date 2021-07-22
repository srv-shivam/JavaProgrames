package dsa450List;

import java.util.Scanner;

class Node_18 {
	int data;
	Node_18 next;

	Node_18(int d) {
		data = d;
		next = null;
	}
}

class Solution_18 {

	boolean isPalindrome(Node_18 head) {

		if (head == null)
			return false;
		if (head.next == null)
			return true;

		Node_18 fast = head;
		Node_18 slow = head;

		while (fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}

		Node_18 mid = null;

		if (fast != null)
			mid = slow.next;
		else
			mid = slow;

		/*
		 * Reversed the 2nd half of the list with the help of mid Node
		 */
		Node_18 prev = null, next = null;

		while (mid != null) {
			next = mid.next;
			mid.next = prev;
			prev = mid;
			mid = next;
		}

		/*
		 * Now comparing each elements from the 1st and 2nd half(Reversed) of LL
		 */
		while (prev != null) {
			if (prev.data != head.data)
				return false;
			prev = prev.next;
			head = head.next;
		}

		return true;
	}
}

public class PalindromeOfLinkedList {

	Node_18 head;
	Node_18 tail;

	/* Function to print linked list */
	void printList(Node_18 head) {
		Node_18 temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	/* Inserts a new Node at front of the list. */
	public void addToTheLast(Node_18 node) {

		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			tail = node;
		}
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size : ");
		int n = sc.nextInt();

		System.out.print("\nEnter elements : ");
		int a1 = sc.nextInt();
		Node_18 head = new Node_18(a1);
		Node_18 tail = head;

		for (int i = 1; i < n; i++) {
			int a = sc.nextInt();
			tail.next = new Node_18(a);
			tail = tail.next;
		}

		Solution_18 g = new Solution_18();

		System.out.print("Is Palindrome : " + g.isPalindrome(head));
	}
}
