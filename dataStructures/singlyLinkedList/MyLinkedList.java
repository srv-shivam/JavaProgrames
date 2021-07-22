package dataStructures.singlyLinkedList;

import java.util.*;
public class MyLinkedList<E> {
	
	Node head = null, currPtr = null;
	
	class Node {
		E data;
		Node next;
		
		Node(E data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void addData(E data) {
		
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			currPtr = newNode;
			return ;
		}
		
		currPtr.next = newNode;
		currPtr = newNode;
		return;
	}
	
	public void displayData() {
		
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.data + " --> ");
			temp = temp.next;
		}
		System.out.print(" null ");
	}
	
	public int size() {
		if(head == null) return 0;
		
		Node temp = head;
		int count = 0;
		
		while(temp != null) {
			++count;
			temp = temp.next;
		}
		
		return count;
	}
	
	public int searchData(E data) {
		
		Node temp = head;
		int count = 0;
		
		while(temp != null) {
			if(temp.data == data) {
				++count;
				return count;
			} else {
				++count;
				temp = temp.next;
			}
		}
		return -1;
	}
	
	/**
	 * method getFirst returns the first element of the list
	 * @return data
	 */
	public E getFirst() {
		return head.data;
	}
	
	
	/**
	 * method getLast returns the last element of the list
	 * @return data
	 */
	public E getLast() {
		
		Node temp = head;
		
		while(temp.next != null) {
			temp = temp.next;
		}
		return temp.data;
	}
	
	public E getMid() {
		
		Node temp = head;
		int counter = 0;
		
		while(temp != null) {
			counter++;
			temp = temp.next;
		}
		
		int mid = counter/2;
		
		temp = head;
		while(mid > 0) {
			temp = temp.next;
			mid--;
		}
		
		return temp.data;
	}
	
	
	/**
	 * twoPointerMid is used to find the mid element of the list
	 * @return data
	 */
	public E twoPointerMid() {
		
		Node ptr1 = head;
		Node ptr2 = head;
		
		while(ptr1 != null && ptr1.next != null) {
			
			ptr1 = ptr1.next.next;
			ptr2 = ptr2.next;
		}
		
		return ptr2.data;
	}
	
	public void insertFirst(E data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	public void insertLast(E data) {
		Node newNode = new Node(data);
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
		currPtr = newNode;
	}
	
	public void insert(E data, int pos) {
		Node newNode = new Node(data);
		if(pos == 1) {
			newNode.next = head;
			head = newNode;
		}
		else {
			Node temp = head;
			int count = 1;
			while(count < pos-1) {
				temp = temp.next;
				++count;
			}
			newNode.next = temp.next;
			temp.next = newNode;
		}
	}
	
	public E deleteFirst() {
		if(head == null) {
			return null;
		}
		else {
			Node temp = head;
			head = head.next;
			temp.next = null;
			return temp.data;
		}
	}
	
	public E deleteLast() {
		if(head ==  null || head.next == null) {
			Node temp = head;
			head = null;
			return temp.data;
		}
		Node currNode = head;
		Node prevNode = null;
		while(currNode.next != null) {
			prevNode = currNode;
			currNode = currNode.next;
		}
		prevNode.next = null;
		currPtr = prevNode; // this is for tail pointer
		return currNode.data;
	}
	
	public E delete(int pos) {
		if(pos == 1) {
			Node temp = head;
			head = null;
			return temp.data;
		} 
		else {
			Node temp = head;
			int count = 1;
			while(count < pos-1) {
				++count;
				temp = temp.next;
			}
			Node t = temp.next;
			temp.next = temp.next.next;
			t.next = null;
			return t.data;
		}
	}
	
	public void reverse() {
		
		if(head == null) {
			return;
		}
		Node current = head;
		Node previous = null;
		Node next = null;
		
		while(current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		head = previous;
	}
	
	public E NthNodeFromEnd(int n) throws Exception {
		
		if(n <= 0 || n > size()) {
			throw new Exception(n + " is Illegal arument!!! ");
		}
		
		if(head == null) return null;
		
		Node mainPtr = head;
		Node refPtr = head;
		int count = 0;
		
		while(count < n) {
			refPtr = refPtr.next;
			++count;
		}
		
		while(refPtr != null) {
			refPtr = refPtr.next;
			mainPtr = mainPtr.next;
		}
		
		return mainPtr.data;
	}
	
	public void removeDuplicate() {
		
		if(head == null) return;
		
		Node temp = head;
		
		while(temp != null && temp.next != null) {
			
			if(temp.data == temp.next.data) {
				temp.next = temp.next.next;
			}
			else {
				temp = temp.next;
			}
		}
	}
	
	public void removeDuplicateUnsortedList() {
		
		if(head == null) {
			return;
		}
		
		Set<E> store = new HashSet<E>();
		
		Node current = head.next;
		Node temp = head;
		
		store.add(head.data);
		
		while(current != null) {
			
			if(store.contains(current.data)) {
				
				temp.next = current.next;
				current.next = null;
				current = temp.next;
				
			} else {
				
				store.add(current.data);
				current = current.next;
				temp = temp.next;
				
			}
		}
	}
	
	public void insertInSOrtedList(E data) {
		
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node temp = null;
		Node current = head;
		
		while(current != null && (int)current.data < (int)newNode.data) {
			temp = current;
			current = current.next;
		}
		
		newNode.next = current;
		temp.next = newNode;
	}
	
}
