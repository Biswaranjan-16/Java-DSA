package ArrayList;

import java.util.ArrayList;

public class Exercise15 {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("black");
		list1.add("red");
		list1.add("white");
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("pink");
		list2.add("yellow");
		list2.add("green");
		
		ArrayList<String> list3 = new ArrayList<String>();
		list3.addAll(list1);
		list3.addAll(list2);
		
		System.out.println(list3);

	}

}
