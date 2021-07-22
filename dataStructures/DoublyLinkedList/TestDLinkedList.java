package dataStructures.DoublyLinkedList;

import java.util.Scanner;
public class TestDLinkedList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		MyDLinkedList<Integer> list = new MyDLinkedList<Integer>();
		
		System.out.print("Enter elements(Tap -1 to exit) : ");
		while(true) {
			int a = sc.nextInt();
			
			if(a == -1) break;
			list.insertFirst(a);
		}
		
		System.out.println("When elements inserted in front");
		
		System.out.print("\nIn forward : ");
		list.displayForward();
		
		System.out.print("\nIn backward : ");
		list.displayBackward();
		
//=====================================================================================
//=====================================================================================
		
		
//		MyDLinkedList<Integer> list2 = new MyDLinkedList<Integer>();
//		
//		System.out.print("\n\nEnter elements(Tap -1 to exit) : ");
//		
//		while(true) {
//			int a = sc.nextInt();
//			
//			if(a == -1) break;
//			list2.insertLast(a);
//		}
//		
//		System.out.println("When elements inserted in last");
//		
//		System.out.print("\nIn forward : ");
//		list2.displayForward();
//		
//		System.out.print("\nIn backward : ");
//		list2.displayBackward();
	
		
		System.out.print("\nDeleted Node : " + list.deleteFirst());
		System.out.print("\nList after deletion : ");
		list.displayForward();
		
		
		System.out.print("\nDeleted Node : " + list.deleteLast());
		System.out.print("\nList after deletion : ");
		list.displayForward();
		
//		System.out.print("\nEnter element to remove : ");
//		int data = sc.nextInt();
//		
//		System.out.print("\nList after removal of element : ");
//		list.removeEle(data);
//		list.displayData();
		
//		System.out.print("\nEnter element and position ar which it is to be inserted : ");
//		int ele = sc.nextInt();
//		int pos = sc.nextInt();
//		list.insertData(ele, pos);
		
//		System.out.print("\nList after inserting new element : ");
//		list.displayData();
		
		
	}

}
