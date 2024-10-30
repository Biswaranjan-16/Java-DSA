package ArrayList;

import java.util.ArrayList;

public class Exercise3 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("tiku");
		list.add("juli");
		list.add("biswa");
		list.add("miku");
		list.add("biju");
		list.add("suba");
		
		System.out.println(list);
		
		list.add(0, "biswa");
		list.add(2, "tiku");
		
		System.out.println(list);

	}

}
