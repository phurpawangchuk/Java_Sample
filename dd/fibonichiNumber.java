package Java_Sample.dd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fibonichiNumber {

	public static void main(String[] args) {
//		int n=6;
//		int result = Fibonachi(n);
//		System.out.print(result);
		
		//removeDuplicate();
		checkArraySum();
		

	}

	private static void checkArraySum() {

		int[] arrayIntegers = {5, 1, 23, 21, 17, 2, 3, 9, 12};
		int sum = 67;
		int i,j,k;
		boolean found = false;
		for(i=0; i<arrayIntegers.length - 2; i++) {
			for(j=i+1; j<arrayIntegers.length - 1; j++) {
				for(k=j+1; k<arrayIntegers.length; k++) {
					if(arrayIntegers[i]+arrayIntegers[j]+arrayIntegers[k] == sum) {
						System.out.println(arrayIntegers[i]+"+"+arrayIntegers[j]+"+"+arrayIntegers[k]);
						
						found = true;
					}
				}
						
			}
		}
			if(found) {
			
				System.out.print("OK");
			}else {
				System.out.print("Not found OK");
			}
		
	}

	private static void removeDuplicate() {
		

		List<String> arrayStrings = Arrays.asList("good", "better", "best", "best", "first", "last", "last", "last","good");
		List<String> tempList = new ArrayList<String>();
		
		for(String s: arrayStrings) {
			boolean found = false;
			for(String s1: tempList) {
				if(s1.equals(s)) {
					found = true;
				}
			}
			if(!found) {
				tempList.add(s);
			}
		}

		System.out.print(tempList);
	}

	private static int Fibonachi(int n) {
		if(n<=1)
			return n;
		
		return Fibonachi(n-1)+Fibonachi(n-2);
	
	}

}
