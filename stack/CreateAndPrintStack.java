package stack;
import java.util.Scanner;

public class CreateAndPrintStack {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        Stack.push(10);
        Stack.push(12);
        Stack.push(8);
        Stack.pop();
        Stack.push(6);
//        Stack.peek();
        Stack.push(4);

        Node temp = Stack.top;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

}
