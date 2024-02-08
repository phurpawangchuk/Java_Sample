package Problem3.prob1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EmployeeAdmin {
	
	/**
		Returns a list of Employees whose social security number is on the input list socSecNums
		and whose salary is > 80000. The list must be ordered by social security number,
		from lowest to highest. To sort, you must use a Collections sorting method
		and you must define your own Comparator to be used to compare Employees by ssn. 
	*/
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
		//IMPLEMENT
		
		List<Employee> empList= new ArrayList<Employee>();
		
		for(HashMap.Entry<String, Employee> entry: table.entrySet()) {
			
			Employee employee = entry.getValue();
			String ssn = employee.getSsn();
			
			for(int i=0; i<socSecNums.size();i++){
				if(ssn.equals(socSecNums.get(i)) && employee.getSalary()>80000)
					empList.add(employee);
			}
		}
		

		Collections.sort(empList, (Employee e1, Employee e2)-> e1.getSsn().compareTo(e2.getSsn()));
		
//		
//		Collections.sort(empList, new Comparator<Employee>()
//		{
//			public int compare(Employee e1, Employee e2){
//			   return e1.getSsn().compareTo(e2.getSsn());
//			 }
//		});
		
//		Iterator it= table.entrySet().iterator();
		
//		while(it.hasNext()){
//			
//			Map.Entry m = (Map.Entry) it.next();
//			String sr= (String)m.getKey();
//			Employee x= (Employee)m.getValue();
//			
//			for(int i=0; i<socSecNums.size();i++){
//				if(sr.equals(socSecNums.get(i)) && x.getSalary()>80_000)
//					empList.add(x);
//			}
//			
//		  }
	
		return empList;
		
	}
	
//
//	public static final Comparator 
//	<Employee> nameCompare = new Comparator<Employee>()
//	{
//		public int compare(Employee e1,Employee e2){
//		   return e1.getName().compareTo(e2.getName()) ;
//		   }
//	};
	
}
