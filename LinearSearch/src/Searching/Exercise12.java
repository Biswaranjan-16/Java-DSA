package Searching;

public class Exercise12 {

	public static void main(String[] args) {
		int[] arr= {12,43,65,24,67,89,20,98};
		int target=98;
		System.out.println(linearsearch(arr,target));

	}

	 static int linearsearch(int[] arr, int target) {
		if(arr.length==0) {
			return -1;
		}
		
		for(int i=0;i<arr.length;i++) {
			int ans=arr[i];
			if(target==ans) {
				return i;
			}
		}
		return -1;
	}

}
