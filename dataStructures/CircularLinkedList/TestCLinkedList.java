package dataStructures.CircularLinkedList;

import java.util.Scanner;
public class TestCLinkedList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		MyCLinkedList<Integer> list = new MyCLinkedList<Integer>();
		MyCLinkedList<Integer> list2 = new MyCLinkedList<Integer>();

		
		System.out.print("Enter elements (press -1 to exit):  ");
		
		while(true) {
			int a = sc.nextInt();
			if(a == -1) break;
			list2.insertFirst(a);
			list.insertLast(a);
		}
		
		System.out.print("\nElements inserted at first : ");
		list2.display();
		
		System.out.print("\nElements inserted at last : ");
		list.display();
		
		list2.deleteFirst();
		list.deleteFirst();
		
		System.out.print("\nElements inserted at first(After deletion) : ");
		list2.display();
		
		System.out.print("\nElements inserted at last(After deletion) : ");
		list.display();
	}

}
