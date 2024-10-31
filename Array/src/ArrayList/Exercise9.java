package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise9 {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();

		list1.add(12);
		list1.add(54);
		list1.add(32);
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(76);
		list2.add(33);
		list2.add(99);

//		System.out.println(list1);
//		System.out.println(list2);
		
		Collections.copy(list1, list2);
		
		System.out.println(list1);
		System.out.println(list2);
		


	}

}
