
//https://www.youtube.com/watch?v=vKQ6oUH02gw

public class Permutation {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3};
		permutation(arr, 0);
		

	}

	private static void permutation(int[] arr, int fi) {
		if(fi == arr.length-1) {
			for(int j=0; j<=fi; j++)
			System.out.print(arr[j]);
			
			System.out.println("\n");
			
			return;
		}
		
		for(int i=fi; i<arr.length; i++) {
			swap(arr,i,fi);
			permutation(arr,fi+1);
			swap(arr,i,fi);
		}
	}

	private static void swap(int[] arr, int i, int fi) {
		int temp = arr[i];
		arr[i] = arr[fi];
		arr[fi] = temp;
		
	}

}
