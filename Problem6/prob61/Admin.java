package prob61;

import java.util.ArrayList;
import java.util.List;

import prob61.Student;

public class Admin {
	public static List<Student>/*<implement>*/ convertArray(Object[] studentArray) {
		/* implement */
		List<Student> stdList = new ArrayList<>();
		
		for(Object obj: studentArray) {
			stdList.add((Student) obj);
		}
		
		return stdList;
	}
	
	
	public static double computeAverageGpa(List<Student>/*<implement>*/ studentList) {
		/*implement */
		double average=0.0;
		for(Student std: studentList) {
			average += std.computeGpa();
		}
		return average/studentList.size();
	}
}
