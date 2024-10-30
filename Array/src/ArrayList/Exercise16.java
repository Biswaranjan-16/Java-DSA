package ArrayList;

import java.util.ArrayList;

public class Exercise16 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(12);
		list.add(54);
		list.add(32);
		list.add(54);
		list.add(76);
		list.add(33);
		list.add(99);

		System.out.println("original array :"+list);
		
		Object list1 = list.clone();
		System.out.println("clone array :"+list1);

	}

}
