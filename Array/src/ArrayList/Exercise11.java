package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise11 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(12);
		list.add(54);
		list.add(32);
		list.add(54);
		list.add(76);
		list.add(33);
		list.add(99);

		System.out.println(list);
		
		Collections.reverse(list);
		
		System.out.println(list);

	}

}
