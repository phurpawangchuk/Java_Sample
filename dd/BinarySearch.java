package Java_Sample.dd;

public class BinarySearch {

	public static void main(String[] args) {
		int[] numners = {1,4,5,6,9,12,23};
		
		int result = BSearch(numners,0,numners.length-1);
		System.out.print(result);

	}

	private static int BSearch(int[] numners,int start, int end) {
		if(start == end) {
			return numners[start];
		}
		int mid = (int)(start+end)/2;
		System.out.println(start+" "+mid+" "+end);
		return BSearch(numners, start, mid)+BSearch(numners, mid+1, end);
		
	}

}
