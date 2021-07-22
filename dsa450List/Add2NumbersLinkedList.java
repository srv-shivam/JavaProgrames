package dsa450List;

import java.util.Scanner;
import java.util.*;

class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}
}

class SolutionLinkedList {

	static Node reverse(Node head) {

		Node current = head;
		Node previous = null;
		Node next = null;

		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}

		return previous;
	}

	// Function to add two numbers represented by linked list.
	static Node addTwoLists(Node first, Node second) {
		// code here
		// return head of sum list

		if (first == null)
			return second;
		if (second == null)
			return first;

		first = reverse(first);
		second = reverse(second);

		int v1 = 0, v2 = 0, sum = 0, carry = 0;
		Node sumHead = new Node(-1);
		Node ptr = sumHead;

		while (first != null || second != null) {

			if (first != null) {
				v1 = first.data;
				first = first.next;
			} else
				v1 = 0;

			if (second != null) {
				v2 = second.data;
				second = second.next;
			} else
				v2 = 0;

			sum = v1 + v2 + carry;
			carry = sum / 10;
			sum = sum % 10;
			Node newNode = new Node(sum);
			ptr.next = newNode;
			ptr = ptr.next; // ptr = newNode;
		}

		if (carry > 0) {
			Node newNode = new Node(carry);
			ptr.next = newNode;
		}

		return reverse(sumHead.next);
	}
}

class Add2NumbersLinkedList {

	static void printList(Node n) {
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.println();
	}
	
	static void print(Node n) {
		while (n != null) {
			System.out.print(n.data + " --> ");
			n = n.next;
		}
		System.out.print("null");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of 1st list : ");
		int n = sc.nextInt();
		System.out.print("\nEnter values : ");
		int val = sc.nextInt();

		Node first = new Node(val);
		Node tail = first;
		for (int i = 0; i < n - 1; i++) {
			val = sc.nextInt();
			tail.next = new Node(val);
			tail = tail.next;
		}
		
		System.out.print("\nEnter size of 2nd list : ");
		int m = sc.nextInt();
		System.out.print("\nEnter values : ");
		val = sc.nextInt();

		Node second = new Node(val);
		tail = second;
		for (int i = 0; i < m - 1; i++) {
			val = sc.nextInt();
			tail.next = new Node(val);
			tail = tail.next;
		}
		
		System.out.print("\nList 1 : ");
		print(first);
		
		System.out.print("\nList 2 : ");
		print(second);

		SolutionLinkedList g = new SolutionLinkedList();
		Node res = g.addTwoLists(first, second);
		System.out.print("\n\nResultant List : ");
		print(res);
		System.out.print("\n\nSum is : ");
		printList(res);
	}
}