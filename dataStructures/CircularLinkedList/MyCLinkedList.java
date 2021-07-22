package dataStructures.CircularLinkedList;

public class MyCLinkedList<E> {

	private Node last;
	private int length;

	private class Node {
		private E data;
		private Node next;

		Node(E data) {
			this.data = data;
			this.next = null;
		}
	}

	MyCLinkedList() {
		this.last = null;
		this.length = 0;
	}

	public int length() {
		return length;
	}

	public boolean isEmpty() {
		return length == 0;
	}

	public E getLastReference() {
		return last.data;
	}

	public void insertFirst(E data) {
		Node newNode = new Node(data);

		if (last == null) {
			last = newNode;
		} else {
			newNode.next = last.next;
		}
		last.next = newNode;
		++length;
	}

	public void insertLast(E data) {
		Node newNode = new Node(data);

		if (last == null) {
			last = newNode;
		} else {
			newNode.next = last.next;
		}
		last.next = newNode;
		last = newNode;
		++length;

	}

	public E deleteFirst() {

		if (last == null)
			return null;

		Node temp = last.next;
		last.next = temp.next;
		temp.next = null;
		--length;
		return temp.data;
	}

	public void display() {

		if (isEmpty())
			return;

		Node temp = last.next;
		while (temp != last) {
			System.out.print(temp.data + " --> ");
			temp = temp.next;
		}
		System.out.print(temp.data + " ");
	}

}
