package Binarysearch;

public class Exercise2 {

	public static void main(String[] args) {
		int[] arr= {4,17 ,18,19, 24, 27, 33, 56, 80, 95};
		int target =19;
		int ans=binarysearch(arr,target);
		System.out.println(ans);
	}

	static int binarysearch(int[] arr, int target) {
		int start=0;
		int end=arr.length-1;
		
		while(start<=end) {
			int mid=start +(end-start)/2;
			
			if(target<arr[mid]) {
				end=mid-1;
			}else if(target > arr[mid]) {
				start=mid+1;
			}else {
				return mid;
			}
		}
		
		return 0;
	}

}
