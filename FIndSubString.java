package Java_Sample;

import java.util.ArrayList;
import java.util.List;

//rcursive call to fins substring in java

public class FIndSubString {

	static List<String> arrList = new ArrayList<String>();
	
	public static void main(String[] args) {
		String string = "ABC";
		FindSubStringRec(string, "",0);
		
		System.out.print(arrList);

	}

	private static void FindSubStringRec(String string, String ans,int count) {
		
		if(string.length() == 0) {
			arrList.add(ans);
//			System.out.print(ans+"\n");
//			System.out.print("count==="+count+"\n");
			return;
		}
		count++;
		FindSubStringRec(string.substring(1), ans+string.charAt(0), count);
		FindSubStringRec(string.substring(1), ans, count);
		
		
	}

}
