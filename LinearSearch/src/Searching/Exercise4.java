package Searching;

public class Exercise4 {

	public static void main(String[] args) {
		int[] arr= {34,98,45,24,90,54,2,-8};
		System.out.println(min(arr));

	}

	 static int min(int[] arr) {
		
		int ans=arr[0];
		for(int i=1;i< arr.length;i++) {
			if(arr[i]<ans) {
				ans=arr[i];
			}
		}
		return ans;
	}

}