package dsa450List;

import java.util.Scanner;

import dsa450List.PracticeLinkedList2.Node;
class PracticeLinkedList2 {
	
	static Node head;
	Node tail;
	int length;
	
	PracticeLinkedList2() {
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
	
	
	public Node reverseKgroup(Node head, int k) {
		
		if(head == null) return null;
		
		Node previous = null;
		Node current = head;
		Node next = current.next;
		
		int count = 0;
		while(current != null && count<k) {
			
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
			++count;
		}
		
		if(next != null) {
			head.next = reverseKgroup(next, k);
		}
		
		PracticeLinkedList2.head = previous;
		return previous;
	}
	
}


public class ReverseKNodes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PracticeLinkedList2 list = new PracticeLinkedList2();
		
		System.out.print("Enter elements : ");
		while(true) {
			int data = sc.nextInt();
			if(data == -1) break;
			list.add(data);
		}
		
		System.out.print("\nElements : ");
		list.display();
		
		System.out.print("\nEnter value of k : ");
		int K = sc.nextInt();
		System.out.print("\nElements after reverse : ");		
		Node node = list.reverseKgroup(list.head, K);
//		list.reverse_K_Nodes(K);
		list.display();
	}

}
