package ArrayList;

public class Maximuminrange {
	public static void mainm(String[] args) {
		int[] arr= {1,3,54,67,85,};
		
		System.out.println(maxrange(arr,1,3));

	}

	static int maxrange(int[] arr, int start, int end) {
		int maxval=arr[start];
		for(int i=start;i<end;i++) {
			if(arr[i]>maxval) {
				maxval=arr[1];
			}
		}
		return maxval;
	}

	
	
}
