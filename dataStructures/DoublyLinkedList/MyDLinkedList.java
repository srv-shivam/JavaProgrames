package dataStructures.DoublyLinkedList;

public class MyDLinkedList<E> {
	
	private Node head;
	private Node tail;
	private int length;
	
	MyDLinkedList() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}
	
	
	
	private class Node {
		E data;
		Node prev, next;
		
		Node(E data) {
			this.data = data;
			prev = next = null;
		}
	}
	
	
	public boolean isEmpty() {
		return length == 0; // head == null
	}
	
	
	
	public int length() {
		return length;
	}
	
	
	public E getFirst() {
		return head.data;
	}
	
	public E getLat() {
		return tail.data;
	}
	
	
	public void insertFirst(E data) {
		
		Node newNode = new Node(data);
		
		if(isEmpty()) {
			tail = newNode;
		} else {
			head.prev = newNode;
		}

		newNode.next = head;
		head = newNode;
		++length;
	}
	
	
	
	public void insertLast(E data) {
		
		Node newNode = new Node(data);
		
		if(isEmpty()) {
			head = newNode;
		} else {
			tail.next = newNode;
		}
		
		newNode.prev = tail;
		tail = newNode;
		++length;
	}
	
	
	public void displayForward() {
		
		Node ptr = head;
		while(ptr != null) {
			System.out.print(ptr.data + " --> ");
			ptr = ptr.next;
		}
		System.out.print("null");
	}
	
	
	
	public void displayBackward() {
		
		Node ptr = tail;
		while(ptr != null) {
			System.out.print(ptr.data + " --> ");
			ptr = ptr.prev;
		}
		System.out.print("null");
	}
	
	
	public E deleteFirst() {
		
		if(isEmpty()) return null;
		
		Node temp = head;
		if(head == tail) {
			head = tail = null;
		} else {
			head.next.prev = null;
		}
		
		head = head.next;
		temp.next = null;
		--length;
		
		return temp.data;
	}
	
	public E deleteLast() {
		
		if(isEmpty()) return null;
		
		Node temp = tail;
		
		if(head == tail) {
			head = tail = null;
		} else {
			tail.prev.next = null;
		}
		
		tail = tail.prev;
		temp.next = null;
		--length;
		return temp.data;
		
	}
	
	
	public boolean removeEle(E data) {
		
		if(head == null) return false;
		
		if(head.next == null) {
			head = tail = null;
			return true;
		}
		
		Node ptr = head;
		while(ptr != null) {
			
			if(ptr.data == data) {
				ptr.next.prev = ptr.prev;
				ptr.prev.next = ptr.next;
				ptr.prev = ptr.next = null;
				return true;
			}
			ptr = ptr.next;
		}
		return false;
	}
	
	public void insertData(E data, int pos) {
		
		Node newNode = new Node(data);
		Node ptr = head;
		
		if(head == null) {
			head = newNode;
		}
		
		while(pos > 0 && ptr != null) {
			ptr = ptr.next;
			pos--;
		}
		
		newNode.prev = ptr.prev;
		newNode.next = ptr;
		ptr.prev = newNode;
		newNode.prev.next = newNode;
	}

}
