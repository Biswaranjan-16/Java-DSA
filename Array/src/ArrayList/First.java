package ArrayList;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a= {1,2,3,4,5,6,7,8};
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
	//	System.out.println(a[2]);

	}

}
