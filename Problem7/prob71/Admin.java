package prob71;
import java.util.*;

import prob71.Student;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		//implement
		HashMap<Key, Student> stdListHashMap = new HashMap<>();
		for(Student stu: students) {
			Key key = new Key(stu.getFirstName(), stu.getLastName());
			stdListHashMap.put(key, stu);
		}
			
		return stdListHashMap;
	}
}
