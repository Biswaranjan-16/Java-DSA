package ArrayList;

import java.util.ArrayList;

public class Exercise2 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add(" biswa ");
		list.add(" juli ");
		list.add(" tiku ");
		list.add(" miku ");
		list.add(" biju ");
		list.add(" suba ");
		
		System.out.println(list);
		
		for(String newlist:list) {
			System.out.print(newlist);
		}

	}

}
