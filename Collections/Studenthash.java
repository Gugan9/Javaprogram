package static9;

import java.util.HashSet;

public class Studenthash {
	
	public static void main(String args[]) {
		HashSet<Studentcollection> hashset = new HashSet<Studentcollection>();
		hashset.add(new Studentcollection(1,"name1",9));
		hashset.add(new Studentcollection(1,"name1",9));
		hashset.add(new Studentcollection(2,"name2",2));
		for (Studentcollection studentcollection : hashset) {
			System.out.println(studentcollection);
		}
}}
