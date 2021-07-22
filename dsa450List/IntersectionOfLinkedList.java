package dsa450List;

import java.util.Scanner;

class Node1 {
	int data;
	Node1 next;
	
	Node1(int data) {
		this.data = data;
		this.next = null;
	}
}

class SolutionLinkedList_11 {
	
	public static Node1 intersection(Node1 first, Node1 second) {
		
		if(first == null) return second;
		if(second == null) return first;
		
		Node1 head = new Node1(-1);
		Node1 tail = head;
		
		while(first != null && second != null) {
			
			if(first.data == second.data) {
				Node1 newNode = new Node1(first.data);
				tail.next = newNode;
				tail = tail.next;
				
				first = first.next;
				second = second.next;
			}
			else if(first.data < second.data) {
				first = first.next;
			} else {
				second = second.next;
			}
		}
		
		return head.next;
	}
}

public class IntersectionOfLinkedList {

	public static Node1 insert() {
		Scanner sc = new Scanner(System.in);
		Node1 head, tail;
		int data = sc.nextInt();
		
		head = new Node1(data);
		tail = head;
		
		while(true) {
			data = sc.nextInt();
			if(data == -1) break;
			
			tail.next = new Node1(data);
			tail = tail.next;
		}
		
		return head;
	}
	
	public static void display(Node1 head) {
		if(head == null) return;
		
		while(head != null) {
			System.out.print(head.data + " --> ");
			head = head.next;
		}
		System.out.print("null");
	}
	
	public static void main(String[] args) {
		
		
		System.out.print("\nEnter for list 1 : ");
		Node1 list1 = insert();
		
		System.out.print("\nEnter for list 2 : ");
		Node1 list2 = insert();
		
		System.out.print("\nList 1 : ");
		display(list1);
		
		System.out.print("\nList 2 : ");
		display(list2);
		
		Node1 res = SolutionLinkedList_11.intersection(list1, list2);
		
		System.out.print("\nResultant list : ");
		display(res);
	}

}
