package static9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import arrayclass.Student;

public class Scollection {
	public Scollection(int i, String string, int j) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ArrayList<Studentcollection> arraylist = new ArrayList();
		arraylist.add(new Studentcollection(1, "name01", 99));
		arraylist.add(new Studentcollection(2, "name02", 90));
		arraylist.add(new Studentcollection(3, "name03", 9));

		System.out.println(arraylist);
		System.out.println("1-------------");
		for (Object object : arraylist) {
			System.out.println(arraylist);
		}
		System.out.println("2-------------");
		for (int z = 0; z < arraylist.size(); z++) {
			System.out.println(arraylist.get(z));
		}
		System.out.println("3-------------");
		Iterator iterator = arraylist.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("4-------------");
		ListIterator listiterator = arraylist.listIterator();
		while (listiterator.hasNext()) {
			System.out.println(listiterator.next());
		}
		System.out.println("5-------------");
		while (listiterator.hasPrevious()) {
			System.out.println(listiterator.previous());
		}
	}

}
