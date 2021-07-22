package dsa450List;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class Node_23 {
	int data;
	Node_23 prev;
	Node_23 next;

	Node_23(int data) {
		this.data = data;
		this.prev = null;
		this.next = null;
	}
}

class CompareNode implements Comparator<Node_23> {

	@Override
	public int compare(Node_23 first, Node_23 second) {
		return first.data - second.data;
	}
}

public class SortAKSortedDLL {

	private Node_23 head = null, tail = null;
	private int length = 0;

	private boolean isEmpty() {
		return length == 0;
	}

	public Node_23 sortKsortedDLL(Node_23 head, int k) {

		if (head == null || head.next == null)
			return head;

		PriorityQueue<Node_23> pq = new PriorityQueue<Node_23>(new CompareNode());

		Node_23 nHead = null, nTail = null;

		for (int i = 0; i <= k && head != null; i++) {

			pq.add(head);
			head = head.next;
		}

		while (!pq.isEmpty()) {

			if (nHead == null) {
				nHead = pq.peek();
				nHead.prev = null;
				nTail = nHead;
			}

			else {
				nTail.next = pq.peek();
				pq.peek().prev = nTail;
				nTail = pq.peek();
			}

			pq.poll();
			
			if (head != null) {

				pq.add(head);
    			head = head.next;
			}
		}

		nTail.next = null;

		return nHead;

	}

	public void insertLast(int data) {

		Node_23 newNode = new Node_23(data);

		if (isEmpty()) {
			head = newNode;
		} else {
			tail.next = newNode;
		}

		newNode.prev = tail;
		tail = newNode;
		++length;
	}

	public void displayForward(Node_23 head) {

		Node_23 ptr = head;
		while (ptr != null) {
			System.out.print(ptr.data + " --> ");
			ptr = ptr.next;
		}
		System.out.print("null");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		SortAKSortedDLL obj = new SortAKSortedDLL();
		
		System.out.print("\nEnter elements : ");
		while(true) {
			int data = sc.nextInt();
			if(data == -1) break;
			obj.insertLast(data);
		}
		
		System.out.print("\nElements : ");
		obj.displayForward(obj.head);
		
		System.out.print("\nEnter K : ");
		int k = sc.nextInt();
		
		System.out.print("\nSorted list : ");
		Node_23 res = obj.sortKsortedDLL(obj.head, k);
		obj.displayForward(res);
		
	}

}
