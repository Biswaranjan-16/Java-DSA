package Searching;

public class Exercise5 {

	public static void main(String[] args) {
		int[] arr= {23,98,78,56,32,19,67,98};
		int target=67;
		System.out.println(searching(arr));

	}

 static boolean searching(int[] arr) {
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
