package Searching;

public class Exercise13 {

	public static void main(String[] args) {
		int[] arr= {12,34,67,90,245,78,43,79,91};
		int target=245;
		System.out.println(searchnumber(arr, target));

	}
	static int searchnumber(int[] arr,int target) {
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
