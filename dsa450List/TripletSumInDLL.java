package dsa450List;

import java.util.Scanner;

public class TripletSumInDLL {

	private static Node head = null, tail = null;
	private static int length = 0;

	static boolean isEmpty() {
		return length == 0;
	}

	private static class Node {
		int data;
		Node next;
		Node prev;

		public Node(int data) {
			this.data = data;
			this.prev = null;
			this.next = null;
		}
	}

	static void insertLast(int data) {

		Node newNode = new Node(data);

		if (isEmpty()) {
			head = newNode;
		} else {
			tail.next = newNode;
		}

		newNode.prev = tail;
		tail = newNode;
		++length;
	}

	static void displayForward() {

		Node ptr = head;
		while (ptr != null) {
			System.out.print(ptr.data + " --> ");
			ptr = ptr.next;
		}
		System.out.print("null");
	}

	private static Node lastNode(Node head) {
		while (head.next != null)
			head = head.next;
		return head;
	}
	
	static int pairSum(Node first, Node last, int x, int actual) {
		
		int count = 0;
		while(first != last && last.next != first) {
			
			if((first.data + last.data) == x) {
				System.out.print("(" + (actual-x)+", "+first.data+", "+last.data+")\n");
				++count;
				first = first.next;
				last = last.prev;
			} else if((first.data + last.data) < x) {
				first = first.next;
			} 
			else {
				last = last.prev;
			}
		}
		return count;
	}

	static void tripletSum(Node head, int x) {

		Node first = null;
		Node last = lastNode(head);
		int count = 0;
		
		for(Node current = head; current != null; current = current.next) {
			first = current.next;
			
			count += pairSum(first, last, x - current.data, x);
		}
		
		if (count == 0)
			System.out.print("\nPair not found!!!");
		else
			System.out.print("\nCount of triplets : " + count);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter element : ");

		while (true) {
			int data = sc.nextInt();
			if (data == -1)
				break;
			insertLast(data);
		}

		System.out.print("\nElements : ");
		displayForward();

		System.out.print("\nEnter X = ");
		tripletSum(head, sc.nextInt());
	}
}
