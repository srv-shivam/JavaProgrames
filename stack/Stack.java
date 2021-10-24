package stack;

import java.util.EmptyStackException;

public class Stack<E> {

    private Node top;
    private int length;

    private class Node {
        private E data;
        private Node next;

        public Node (E data) {
            this.data = data;
            this.next = null;
        }
    }

    Stack() {
        this.top = null;
        this.length = 0;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void push(E data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        ++length;
    }

    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        E result = top.data;
        top = top.next;
        --length;
        return result;
    }

    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }

}
