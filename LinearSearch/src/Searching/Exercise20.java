package Searching;

public class Exercise20 {

	public static void main(String[] args) {
		int[] arr= {12,65,78,90,43,-2,-34};
		System.out.println(Minimumnumber(arr));
	}
	static int Minimumnumber(int[] arr) {
		if(arr.length==0) {
			return -1;
		}
		int ans=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<ans) {
				ans=arr[i];
			}
		}
	return ans;	
	}

}
