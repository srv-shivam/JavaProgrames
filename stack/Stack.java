package stack;

public class Stack {

    static Node top = null;
    private static int length = 0;

    static int getLength() {
        return length;
    }

    static Node push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        ++length;
        return top;
    }

    static int pop() {
        int data = top.data;
        top = top.next;
        --length;
        return data;
    }

    static int peek() {
        return top.data;
    }

}
