package ArrayList;

import java.util.ArrayList;

public class Exercise4 {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(45);
		list.add(56);
		list.add(78);
		list.add(39);
		list.add(23);
		list.add(20);
		
		System.out.println(list);
		
		int num1=list.get(0);
		System.out.println("first number is :"+num1);
		
		int num2=list.get(3);
		System.out.println("fourth number is :"+num2);
		
		

	}

}
