package Binarysearch;

public class Exercise12 {

	public static void main(String[] args) {
		int[] num= {12,34,22,45,56,85,90,81};
		int target=81;
		System.out.println(linearsearch(num, target));
	}
		static int linearsearch(int[] arr,int target) {
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


