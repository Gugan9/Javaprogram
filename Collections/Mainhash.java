package static9;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Mainhash {
	public static void main(String args[]) {
		LinkedHashSet<Integer> hashset = new LinkedHashSet<Integer>();
		hashset.add(10);
		hashset.add(99);
		hashset.add(9);
		hashset.add(9);
		hashset.add(91);
		hashset.add(9);
		hashset.add(-2);
		hashset.remove(-2);
		
		for (Integer i : hashset) {
			System.out.println(i);

		}
	}

}
