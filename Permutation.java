package Java_Sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://www.youtube.com/watch?v=vKQ6oUH02gw

public class Permutation {

	public static void main(String[] args) {
		
		char[] arr = {'A','B','C'};
		
		//permutation(arr, 0);
		Permutation(arr, 0,0);
		

	}

//	private static void permutation(char[] arr, int fi) {
//		if(fi == arr.length-1) {
//			for(int j=0; j<=fi; j++)
//				System.out.print(arr[j]);
//			
//			System.out.println("\n");
//			
//			//return;
//		}
//		
//		for(int i=fi; i<arr.length; i++) {
//			swap(arr,i,fi);
//			permutation(arr,fi+1);
//			swap(arr,i,fi);
//		}
//	}

	private static void swap(char[] arr, int i, int fi) {
		char temp = arr[i];
		arr[i] = arr[fi];
		arr[fi] = temp;
		
	}

	private static void Permutation(char[] ch, int fi, int cnt)
	{
		if(fi == ch.length -1) {
			for(int j=0; j<=fi; j++)
				System.out.print(ch[j]);
			
			
			System.out.println("\n");
			
			
		}
		//System.out.println("\ncnt ="+cnt);
		for(int i=fi; i<ch.length; i++) {
			swap(ch, i, fi);
			Permutation(ch, fi+1,cnt++);
			swap(ch, i, fi);
		}
		
	}
}
