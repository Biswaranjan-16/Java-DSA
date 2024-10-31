package ArrayList;

import java.util.ArrayList;

public class Exercise7 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(12);
		list.add(54);
		list.add(32);
		list.add(54);
		list.add(76);
		list.add(33);
		list.add(99);

		//System.out.println(list);
         
		if(list.contains(12)) {
			System.out.println("number is available ");
		}else {
			System.out.println("number is not available");
		}

	}

}
