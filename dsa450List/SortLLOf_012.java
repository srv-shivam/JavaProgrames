package dsa450List;

import java.util.Scanner;

class Node_29 {
	int data;
	Node_29 next;

	Node_29(int data) {
		this.data = data;
		this.next = null;
	}
}

public class SortLLOf_012 {

	private static Node_29 head = null, tail = null;

	static void add(int data) {
		Node_29 newNode = new Node_29(data);

		if (head == null) {
			head = newNode;
			tail = head;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	static void print(Node_29 head) {
		while (head != null) {
			System.out.print(head.data + " --> ");
			head = head.next;
		}
		System.out.print("null");
	}

	static Node_29 sortLL_012(Node_29 head) {

		if (head == null)
			return null;

		Node_29 temp = head;
		int count0 = 0, count1 = 0, count2 = 0;

		while (head != null) {
			if (head.data == 0)
				++count0;
			 else if (head.data == 1) 
				++count1;
			 else 
				++count2;
			head = head.next;
		}

		head = temp;

		while (temp != null) {
			if (count0 > 0) {
				temp.data = 0;
				--count0;
			} else if (count1 > 0) {
				temp.data = 1;
				--count1;
			} else {
				temp.data = 2;
				--count2;
			}
			temp = temp.next;
		}

		return head;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter elements : ");
		while (true) {
			int data = sc.nextInt();
			if (data == -1)
				break;
			add(data);
		}

		System.out.print("\nElements : ");
		print(head);

		System.out.print("\nSorted array of 0's  1's  2's  : ");
		print(sortLL_012(head));
	}

}
