package Prob1;
import java.util.*;
public class Admin {

	public static HashMap<Key, Student> processStudents(List<Student> students) {
		if (students.isEmpty()) return null;

		HashMap<Key, Student> studentHashMap = new HashMap<>();
		for (Student student : students) {
			Key k = new Key(student.getFirstName(), student.getLastName());
			studentHashMap.put(k, student);
		}
		return studentHashMap;
	}

}
