package dsa450List;

import java.util.Scanner;
class Node_25 {
	int data;
	Node_25 prev, next;
	
	Node_25(int data) {
		this.data = data;
		this.prev = null;
		this.next = null;
	}
}

public class ReverseDLL_InGrp {
	
	private static Node_25 head = null, tail = null;
	private static int length = 0;
	
	private static void insert(int data) {
		Node_25 newNode = new Node_25(data);
		
		if(head == null) {
			head = newNode;
			tail = head;
		}
		tail.next = newNode;
		tail = tail.next;
		++length;
	}
	
	private static void display(Node_25 head) {
		while(head != null) {
			System.out.print(head.data + " <-> ");
			head = head.next;
		}
		System.out.print("null");
	}
	
	private static int length() {
		return length;
	}
	
	private static Node_25 push(Node_25 head, Node_25 new_node) {

        new_node.prev = null;

        new_node.next = head;

        if (head != null)
            head.prev = new_node;

        head = new_node;
        return head;
	}
	
	/**
	 * reverseGrp Method will rotate the DLL in particular given group size
	 * @param Node head, int K
	 */
	
	private static Node_25 reverseGrp(Node_25 head, int k) {

		Node_25 current = head;
        Node_25 next = null;
        Node_25 newHead = null;
        int count = 0;
 
        while (current != null && count < k)
        {
            next = current.next;
            newHead = push(newHead, current);
            current = next;
            count++;
        }

        if (next != null)
        {
            head.next = reverseGrp(next, k);
            head.next.prev = head;
        }

        return newHead;

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
		
		System.out.print("\nEnter K : ");
		int k = sc.nextInt();
		System.out.print("\nReversed List : ");
		display(reverseGrp(head, k));
	}

}
