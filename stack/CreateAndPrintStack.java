package stack;

public class CreateAndPrintStack {

    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(25);
        stack.push(30);

        System.out.println("Top = " + stack.peek());
        System.out.println("Popped = " + stack.pop());
        System.out.println("New Top = " + stack.peek());

        System.out.println("\nTop = " + stack.peek());
        System.out.println("Popped = " + stack.pop());
        System.out.println("New Top = " + stack.peek());

        System.out.println("\nTop = " + stack.peek());
        System.out.println("Popped = " + stack.pop());
        System.out.println("New Top = " + stack.peek());

        System.out.println("\nTop = " + stack.peek());
        System.out.println("Popped = " + stack.pop());
        System.out.println("New Top = " + stack.peek());

        System.out.println("\nTop = " + stack.peek());
        System.out.println("Popped = " + stack.pop());
        System.out.println("New Top = " + stack.peek());

        System.out.println("\nTop = " + stack.peek());
        System.out.println("Popped = " + stack.pop());
        System.out.println("New Top = " + stack.peek()); // Exception will occur, as Stack is empty

    }

}
