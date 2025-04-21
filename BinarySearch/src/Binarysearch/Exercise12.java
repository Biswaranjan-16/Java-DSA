package Binarysearch;

public class Exercise12 {

	public static void main(String[] args) {
		int[] num= {12,34,22,45,56,85,90,81};
		int target=81;
		System.out.println(linearsearch(num, target));
	}
		static int linearsearch(int[] num,int target) {
			if(num.length==0) {
				return -1;
			}
			
			for(int index=0;index<num.length;index++) {
				int element=num[index];
				if(element==target) {
					return index;
				}
			}
			
			return -1;
		}

	}


