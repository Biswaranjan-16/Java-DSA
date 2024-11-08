package Searching;

public class Exercise6 {

	public static void main(String[] args) {
		int[] arr= { 10, 20, 30, 40, 50, 56, 67, 78, 87, 90, 99};
		int target=43;
		System.out.println(linearsearch(arr));

	}

	 static boolean linearsearch(int[] arr) {
		if(arr.length==0) {
			return false;
		}
		for(int i=0;i<arr.length;i++) {
			int element=arr[i];
			if(arr[i]==element) {
				return true;
			}
		}
		return false;
	}

}
