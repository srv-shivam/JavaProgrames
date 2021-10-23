package stack;

import java.util.EmptyStackException;

public class Stack {

    private Node top;
    private int length;

    private class Node {
        private int data;
        private Node next;

        public Node (int data) {
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

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        ++length;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int result = top.data;
        top = top.next;
        --length;
        return result;
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }

}
