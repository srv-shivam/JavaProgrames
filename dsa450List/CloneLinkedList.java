package dsa450List;

import java.util.HashMap;

class Node_30 {
    int data;
    Node_30 next, random;

    Node_30(int data) {
        this.data = data;
        this.next = null;
        this.random = null;
    }
}

public class CloneLinkedList {

    static Node_30 createdCustomLinkedList() {

        Node_30 first = new Node_30(1);
        Node_30 second = new Node_30(2);
        Node_30 third = new Node_30(3);
        Node_30 fourth = new Node_30(4);
        Node_30 five = new Node_30(5);

        first.next = second;
        first.random = first;

        second.next = third;
        second.random = first;

        third.next = fourth;
        third.random = five;

        fourth.next = five;
        fourth.random = third;

        five.next = null;
        five.random = second;

        return first;
    }

    /***************************** First Method (With N Space) *************************/

    static Node_30 cloneLinkedList(Node_30 head) {
        HashMap<Node_30, Node_30> map = new HashMap<Node_30, Node_30>();
        Node_30 nHead = new Node_30(-1);

        Node_30 curr = head;
        Node_30 nCurr = nHead;

        /**
         * This is the While loop for copying the list simply
         * and storing the addresses as (key, value) pair
         */
        while (curr != null) {
            Node_30 newNode = new Node_30(curr.data);
            nCurr.next = newNode;

            map.put(curr, newNode);

            nCurr = nCurr.next;
            curr = curr.next;
        }

        nHead = nHead.next;

        return arrangeRandomPointer(head, nHead, map);

    }

    static Node_30 arrangeRandomPointer(Node_30 head, Node_30 nHead, HashMap<Node_30, Node_30> map) {

        Node_30 c1 = head;
        Node_30 c2 = nHead;

        while (c1 != null) {
            c2.random = (c1 != null ? map.get(c1.random) : null);

            c1 = c1.next;
            c2 = c2.next;
        }

        return nHead;
    }
    /*************************************************************************************************/


    /****************************** Second Method (Without Space) *******************************/

    static void duplicateList(Node_30 head) {

        Node_30 curr = head;

        while(curr != null) {
            Node_30 newNode = new Node_30(curr.data);
            Node_30 forw = curr.next;

            curr.next = newNode;
            newNode.next = forw;

            curr = forw;
        }
    }

    static void copyRandomPointer(Node_30 head) {

        Node_30 curr = head;

        while(curr != null) {

            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }
    }

    static Node_30 extractCopyList(Node_30 head) {

        Node_30 dummy = new Node_30(-1);
        Node_30 curr = head, nCurr = dummy;

        while(curr != null) {
            nCurr.next = curr.next;
            curr.next = curr.next.next;

            nCurr = nCurr.next;
            curr = curr.next;
        }
        return dummy.next;
    }

    static Node_30 copyList(Node_30 head) {
        duplicateList(head);
        copyRandomPointer(head);
        return extractCopyList(head);
    }

    /**************************************************************************************************/

    static void display(Node_30 head) {
        while (head != null) {
            System.out.println("Node Value : " + head.data);
            System.out.println("Node Random Value : " + head.random.data);
            System.out.println();
            head = head.next;
        }
    }


    public static void main(String[] args) {

        Node_30 head = CloneLinkedList.createdCustomLinkedList();

        Node_30 nHead = CloneLinkedList.cloneLinkedList(head);

        System.out.println("/****************First Method***********/\n");

        System.out.println("Original LinkedList : \n");
        display(head);

        System.out.println("Cloned LinkedList : \n");
        display(nHead);

        System.out.println("\nAddress of Original LinkedList Head " + head);
        System.out.println("\nAddress of Original LinkedList Head " + nHead);


        System.out.println("/******************* Second Method ********************/\n");

        Node_30 nHeader = CloneLinkedList.copyList(head);

        System.out.println("Original LinkedList : ");
        display(head);

        System.out.println("Cloned LinkedList : ");
        display(nHeader);

        System.out.println("\nAddress of Original LinkedList Head " + head);
        System.out.println("\nAddress of Original LinkedList Head " + nHeader);
    }

}
