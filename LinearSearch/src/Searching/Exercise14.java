package Searching;

public class Exercise14 {

	public static void main(String[] args) {
		int[] arr= {51,45,32,78,98,65};
		System.out.println(minimumnumber(arr));

	}
	static int minimumnumber(int[] arr) {
		int ans=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i] > ans) {
				ans=arr[i];
			}
		}
		return ans;
	}

}
