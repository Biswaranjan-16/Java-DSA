package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise14 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("black");
		list.add("red");
		list.add("white");
		list.add("green");
		list.add("pink");
		list.add("blue");
		list.add("yellow");
		list.add("sky");
		list.add("brown");
		
		System.out.println("before swap"+list);
		
		Collections.swap(list, 0, 2);
		System.out.print("after swap"+list);

	}

}
