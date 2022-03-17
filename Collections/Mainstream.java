package Mapmain;

import java.awt.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Mainstream {
	public static void main(String args[], java.util.List<Studentcollection> res) {
		ArrayList<Studentcollection> z = new ArrayList<Studentcollection>();
		z.add(new Studentcollection(1, "name1", 99));
		z.add(new Studentcollection(1, "name2", 9));
		z.add(new Studentcollection(1, "name3", 19));
		ArrayList<Studentcollection> res1 = new ArrayList <Studentcollection>();
		
		System.out.println(res);
		res=z.stream().filter(Studentcollection->Studentcollection.getAge()>12).collect(Collectors.toList());

	}
}
