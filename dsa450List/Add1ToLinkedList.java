package dsa450List;

import java.util.Scanner;
class PracticeLinkedList3 {
	
	static Node head;
	Node tail;
	int length;
	
	PracticeLinkedList3() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}
	
	
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
			++length;
		} else {
			tail.next = newNode;
			tail = newNode;
			++length;
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
	
	//Add 1 to a number represented as linked list

	public void add_1_ToLinkedList() {
		
		if(head == null) return;
		
		reverseList();
		
		Node current = head;
		Node previous = null;
		int carry = 0;
		
		current.data = current.data + 1;
		
		while(current != null && (current.data > 9 || carry > 0) ) {
			
			previous = current;
			current.data += carry;
			
			carry = current.data/10;
			current.data = current.data%10;
			
			current = current.next;
		}
		
		if(carry > 0) {
			
			Node newNode = new Node(carry);
			previous.next = newNode;
		}
		reverseList();
	}
	
	
	public void displayNumber() {
		if(head == null) return;
		
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data);
			temp = temp.next;
		}
	}
}


public class Add1ToLinkedList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PracticeLinkedList3 list = new PracticeLinkedList3();
		
		System.out.print("Enter elements : ");
		while(true) {
			int a = sc.nextInt();
			if(a == -1) break;
			list.add(a);
		}
		
		System.out.print("\nElements : ");
		list.display();
		
		list.add_1_ToLinkedList();
		System.out.print("\nNumber : ");
		list.displayNumber();
		
	}

}
