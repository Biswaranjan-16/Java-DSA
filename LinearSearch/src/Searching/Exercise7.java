package Searching;

public class Exercise7 {

	public static void main(String[] args) {
		int[] arr= { 10, 20, 30, 40, 50, 56, 67, 78, 87, 90, 99};
		int target=67;
		System.out.println(linearsearch(arr,target,5,9));
				

	}

	 static int linearsearch(int[] arr, int target, int i, int j) {
		if(arr.length==0) {
			return -1;
		}
		for(int index=i;index<j;index++) {
			int element=arr[index];
			if( target== element) {
				return index;
			}
		}
		return -1;
	}

}
