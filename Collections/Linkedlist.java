package static9;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedlist {
	public static void main(String[] args) {
		LinkedList<Studentcollection> linkedList = new LinkedList();
		linkedList.add(new Studentcollection(1, "name 99", 9));
		linkedList.add(new Studentcollection(2, "name 90", 1));
		linkedList.add(new Studentcollection(3, "name 9", 2));
		System.out.println(linkedList);
		System.out.println("1-------------");
		for (int a = 0; a<linkedList.size(); a++) {
			System.out.println(linkedList.get(a));
		}
		System.out.println("2-------------");
		for (Object object : linkedList) {
			System.out.println(linkedList);
		}
		System.out.println("3-------------");
		Iterator iterator = linkedList.iterator();
		while(  iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		System.out.println("4-------------");
		ListIterator listiterator=linkedList.listIterator();
		while(  listiterator.hasNext()) {
			System.out.println(listiterator.next());
			}
		System.out.println("5-------------");
		while (listiterator.hasPrevious()) {
			System.out.println(listiterator.previous());
		}
	}
}
