package dsa450List;

import java.util.Scanner;

class PracticeLinkedList {
	
	Node head, tail;
	
	PracticeLinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	/**
	 * Node class
	 * @author SHIVAM
	 *
	 */
	class Node {
		private int data;
		private Node next;
		
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	
	public void add(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	public void display() {
		if(head == null) return;
		
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " --> ");
			temp = temp.next;
		}
		System.out.print("null");
	}
	
	// displaying the list using recursion
	public void display(Node temp) {
		if(temp == null) {
			System.out.print("null");
			return;
		}
		
		System.out.print(temp.data + " --> ");
		display(temp.next);
	}
	
	public void reverseList() {
		
		if(head == null) return;
		
		Node current = head;
		Node previous = null;
		Node next = null;
		
		while(current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		tail = head;
		head = previous;
	}
	
	// Recursive approach to reverse the Linked List
	public void reverseListUsingRecursion(Node previous, Node current) {
		
		if(current == null) {
			tail = head;
			head = previous;
			return;
		}
		
		Node next = current.next;
		current.next = previous;
		previous = current;
		reverseListUsingRecursion(previous, next);
		
	}
	
}


public class ReverseLinkedList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PracticeLinkedList list = new PracticeLinkedList();
		
		System.out.print("Enter elements : (-1 for exit) ");
		
		while(true) {
			int data = sc.nextInt();
			if(data == -1) break;
			list.add(data);
		}
		
		System.out.print("\nElements : ");
		list.display();
		
		System.out.print("\nElements : ");
		list.display(list.head);
		
		list.reverseList();
		
		System.out.print("\nElements After reverse : ");
		list.display();
		
		list.reverseListUsingRecursion(null, list.head);
		list.reverseListUsingRecursion(null, list.head);
		
		System.out.print("\nElements After reverse using recursion : ");
		list.display();
		
		sc.close();
	}

}
