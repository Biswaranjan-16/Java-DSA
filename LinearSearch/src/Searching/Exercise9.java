package Searching;

public class Exercise9 {

	public static void main(String[] args) {
		int [] arr= {1,5,8,4,9,7};
		int target=7;
		System.out.println(linearsearch(arr,target));
	}

	 static int linearsearch(int[] arr, int target) {
		if(arr.length==0) {
			return -1;
		}
		for(int i=0;i<arr.length;i++) {
			int element=arr[i];
			if(target==element) {
				return i;
			}
		}
		return -1;
	}

}
