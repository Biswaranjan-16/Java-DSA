package ArrayList;

import java.util.ArrayList;

public class Exercise13 {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("black");
		list1.add("red");
		list1.add("white");
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("black");
		list2.add("yellow");
		list2.add("green");
		
		ArrayList<String> list3 = new ArrayList<String>();
	
		for(String e:list1) 
			list3.add(list2.contains(e) ? "yes":"no");
		System.out.println(list3);
	}

}
