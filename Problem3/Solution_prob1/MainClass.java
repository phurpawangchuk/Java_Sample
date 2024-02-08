package prob1;

import java.util.ArrayList;
import java.util.HashMap;

public class MainClass {
	
	public static void main(String[] args){
		
		HashMap<String,Employeee> test= new HashMap<String,Employeee>();
		
		test.put("1254", new Employeee("1254","John",100000));
		test.put("9862", new Employeee("9862","Dave",70000));
		test.put("8947", new Employeee("8947","Rick",90000));
		test.put("4586", new Employeee("4586","Abey",200000));
		test.put("2389", new Employeee("2389","Cary",85000));
		
		ArrayList<String> ssnc= new ArrayList<String>();
		
		ssnc.add("4586");
		ssnc.add("2147");
		ssnc.add("1258");
		ssnc.add("8947");
		ssnc.add("1254");
		ssnc.add("9862");
		ssnc.add("1440");
		
		System.out.println(NewEmp.highSal(test, ssnc));
		
		
	}

}
