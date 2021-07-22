package dataStructures.singlyLinkedList;

import java.util.Scanner;

public class TestLinkedList {

	public static void main(String[] args) throws Exception {
		
		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a  = sc.nextInt();
			
			if(a == -1) break;
			list.addData(a);
		}
		
//		list.addData(1);
//		list.addData(2);
//		list.addData(3);
//		list.addData(4);
		
		System.out.print("Elelemnts : ");
		list.displayData();
		
//		list.addData(5);
//		System.out.print("\nElements : ");
//		list.displayData();
		
		System.out.print("\nEnter element to serach : ");
		int data = sc.nextInt();
		System.out.println("\nElement present at position : " + list.searchData(data));
		
		System.out.println("\nFirst element of the list : " + list.getFirst());
		
		System.out.println("\nLast element of the list : " + list.getLast());
		
//		System.out.println("\nMiddle element of the list : " + list.getMid());
		
//		list.addData(6);
//		list.addData(7);
		
//		System.out.print("\nElements : ");
//		list.displayData();
		
		System.out.println("\nMiddle element of list : " + list.getMid());
		
		System.out.println("\nMiddle element using two pointer : " + list.twoPointerMid());
		
		System.out.println("Adding data to any position");
		list.insert(12, 3);
		list.displayData();
		
		list.insertFirst(22);
		System.out.print("\nAfter inserting element at first ");
		list.displayData();
		
		list.insertLast(44);
		System.out.print("\nAfter inserting element at last ");
		list.displayData();
		
		System.out.print("\nDeleted element : ");
		System.out.print(list.deleteFirst());
		System.out.print("\nAfter deleting first element ");
		list.displayData();
		
		System.out.print("\nDeleted element : ");
		System.out.print(list.deleteLast());
		System.out.print("\nAfter deleting last element ");
		list.displayData();
		
		System.out.print("\nDeleted element : ");
		System.out.print(list.delete(4));
		System.out.print("\nAfter deleting at any position : ");
		list.displayData();
		
		System.out.print("\nReverse of list : ");
		list.reverse();
		list.displayData();
		
//		System.out.print("\nSize : " + list.size());
		System.out.println("\nNth node from end : " + list.NthNodeFromEnd(3));
		
		list.removeDuplicate();
		System.out.print("\nAfter removing duplciate elements : ");
		list.displayData();
		
		list.reverse();
		System.out.print("\nAfter inserting value into sorted list : ");
		list.insertInSOrtedList(10);
		list.displayData();
		
		MyLinkedList<Integer> l = new MyLinkedList<Integer>();
		
		System.out.print("\nEnter elements : ");
		while(true) {
			int a  = sc.nextInt();
			
			if(a == -1) break;
			l.addData(a);
		}
		
		System.out.print("\nElements : ");
		l.displayData();
		
		l.removeDuplicateUnsortedList();
		
		System.out.print("\nAfter removal : ");
		l.displayData();
		
	}

}
