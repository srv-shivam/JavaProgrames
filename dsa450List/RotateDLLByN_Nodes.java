package dsa450List;

import java.util.Scanner;
class Node_24 {
	int data;
	Node_24 prev, next;
	
	Node_24(int data) {
		this.data = data;
		this.prev = null;
		this.next = null;
	}
}

public class RotateDLLByN_Nodes {
	
	private static Node_24 head = null, tail = null;
	private static int length = 0;
	
	private static void insert(int data) {
		Node_24 newNode = new Node_24(data);
		
		if(head == null) {
			head = newNode;
			tail = head;
		}
		tail.next = newNode;
		tail = tail.next;
		++length;
	}
	
	private static void display(Node_24 head) {
		while(head != null) {
			System.out.print(head.data + " <-> ");
			head = head.next;
		}
		System.out.print("null");
	}
	
	private static int length() {
		return length;
	}
	
	/*
	 * method to rotate DLL by counter-clockwise with N nodes 
	 */
	private static Node_24 rotateByN(Node_24 head, int N) {
		
		if(length() <= N) return null;
		
		Node_24 temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		
		temp.next = head;
		head.prev = temp;
		
		while(--N > 0 && head != null) {
			head = head.next;
		}
		
		Node_24 nHead = head.next;
		nHead.prev = null;
		head.next = null;
				
		return nHead;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter elements : ");
		
		while(true) {
			int data = sc.nextInt();
			if(data == -1) break;
			insert(data);
		}
		
		System.out.print("\nElements : ");
		display(head);
		
		System.out.print("\nEnter N : ");
		int N = sc.nextInt();
		
		System.out.print("\nRotated list by N nodes : ");
		Node_24 res = rotateByN(head, N);
		display(res);
	}

}
