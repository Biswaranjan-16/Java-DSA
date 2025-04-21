package Binarysearch;

public class Exercise13 {

	public static void main(String[] args) {
		int[] arr= {12,34,65,90,87,65,43,27,19};
		int target=19;
		System.out.println(linearsearch(arr, target));

	}
	
	static int linearsearch(int[] arr,int target) {
		if(arr.length==0) {
			return -1;
		}
		
		for(int index=0;index<arr.length;index++) {
			int element=arr[index];
			if(element==target) {
				return index;
			}
		}
		
		return -1;
	}

}
