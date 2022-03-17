package arrayclass;

import java.util.Arrays;

public class Application {
	public static void main(String[] args) {
		Student[] sArray = { new Student(1, "name0", 99, 99), new Student(2, "name1", 20, 90) };
		Arrays.sort(sArray);
		for (Student student : sArray) {
			System.out.println(student);
		}
	}
}
