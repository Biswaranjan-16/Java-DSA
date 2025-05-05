package Searching;

public class Exercise19 {

	public static void main(String[] args) {
		int[] arr= {12,4,67,43,98,65,33,66,55};
		int target=65;
		System.out.println(Linearserach(arr, target, 2, 8));

	}
	static int Linearserach(int[] arr,int target,int i,int j) {
		if(arr.length==0) {
			return -1;
		}
		for(int index=i;index<j;index++) {
			int element=arr[index];
			if(target==element) {
				return index;
			}
		}
		return -1;
	}

}
