package prob1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class NewEmp {
	
	public static List<Employeee> highSal(HashMap<String,Employeee>table, ArrayList<String>socSecNum){
		
		List<Employeee> temp= new ArrayList<Employeee>();
		
		Set k= table.entrySet();
		Iterator it= k.iterator();
		
		while(it.hasNext()){
			Map.Entry m = (Map.Entry) it.next();
			String sr= (String)m.getKey();
			Employeee x= (Employeee)m.getValue();
			
			for(int i=0; i<socSecNum.size();i++){
				if(sr.equals(socSecNum.get(i))&&x.getSalary()>80_000)
					temp.add(x);
			}
			
		  }
		
		Collections.sort(temp,namComp);
		
		return temp;
		
	}
	
	public static final Comparator <Employeee>namComp=new Comparator<Employeee>(){
		public int compare(Employeee e1,Employeee e2){
		   return e1.getName().compareTo(e2.getName()) ;}
	};

}
