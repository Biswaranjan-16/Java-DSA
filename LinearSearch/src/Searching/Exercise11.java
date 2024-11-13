package Searching;



public class Exercise11 {

	public static void main(String[] args) {
		int[] arr= {1,3,5,2,7,8,9};
		
		System.out.println(lnearsearch(arr));

	}

	 static int lnearsearch(int[] arr) {
		if(arr.length==0) {
			return -1;
		}
		int ans=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i] <ans) {
				ans=arr[i];
				
			}
		}
		return ans;
	}

}
