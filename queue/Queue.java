package queue;

import java.util.NoSuchElementException;

public class Queue<E> {

    private Node front, rear;
    private int length;

    private class Node {
        private E data;
        private Node next;

        public Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    Queue() {
        this.front = null;
        this.rear = null;
        this.length = 0;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void enqueue(E data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
        ++length;
    }

    public E dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        E data = front.data;
        front = front.next;
        --length;
        return data;
    }

    public void printQueue() {
        Node current = front;

        while (current != null) {
            if (current.next == null) {
                System.out.print(current.data + " -> null");
            } else {
                System.out.print(current.data + " -> ");
            }
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        queue.printQueue();

        queue.dequeue();
        queue.enqueue(60);
        queue.dequeue();
        queue.dequeue();

        System.out.print("\nAfter performing few dequeue() operations : ");
        queue.printQueue();

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        queue.dequeue(); // this line will throw NoSuchElementException as queue is empty
    }


}
