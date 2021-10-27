package queue;

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
        this.front = this.rear = null;
        length = 0;
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
            System.out.println("Empty Queue!! No elements present");
            return null;
        } else {
            E data = front.data;
            front = front.next;
            --length;
            return data;
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        Queue<Integer>.Node temp = queue.front;

        while (temp != null) {
            if (temp.next == null) {
                System.out.print("null");
            } else {
                System.out.print(temp.data + " -> ");
            }
            temp = temp.next;
        }

        queue.dequeue();
        queue.enqueue(60);
        queue.dequeue();
        queue.dequeue();

        temp = queue.front;
        System.out.print("\nAfter performing few dequeue() operations : ");
        while (temp != null) {
            if (temp.next == null) {
                System.out.print("null");
            } else {
                System.out.print(temp.data + " -> ");
            }
            temp = temp.next;
        }
    }


}
