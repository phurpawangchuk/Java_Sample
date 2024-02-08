package Problem1.Solution.prob1;

import java.util.ArrayList;
import java.util.List;

public class EmployeeInfo {

	/**
	 * Removes from a copy of the input list all duplicate Employees,
	 * and then returns this list.
	 *
	 * An Employee instance is considered to be a duplicate of another Employee
	 * instance if the two instances have the same name and salary.
	 */

	public static List<Employee> removeDuplicates(List<Employee> employees) {

		List<Employee> list = new ArrayList<>();

		for(Employee emp : employees){

			if(!list.contains(emp)){
				list.add(emp);

			}
		}

		return list;
	}



	@SuppressWarnings("unlikely-arg-type")
	private static List<Employee> removeDuplicate(List<Employee> originalList) {
		List<Employee> empList = new ArrayList<>();
		
		for(Employee e: originalList)
		{
			if(!empList.contains(e)) {
				empList.add(e);
			}
		}
		return empList;
		//IMPLEMENT
		
		
	}


	
	//DO NOT MODIFY
	/**
	 * Use the main method to test your solution
	 */
	public static void main(String[] args) {

	List<Employee> newListDuplicateRemoved = removeDuplicate(TestData.originalList);

	//boolean checkDuplicateRemoved = Util.listsAreEqual(TestData.dupsRemoved, newListDuplicateRemoved);
	//System.out.println("Is answer correct? " + checkDuplicateRemoved );

//	for(Employee e: newListDuplicateRemoved) {
//		System.out.println(e.toString());
//	}


	boolean dupsCorrectlyRemoved = Util.listsAreEqual(TestData.dupsRemoved, newListDuplicateRemoved);
//
	System.out.println("Is answer correct? " + dupsCorrectlyRemoved);
	}





}
