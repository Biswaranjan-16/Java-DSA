package Searching;

public class Exercise18 {

	public static void main(String[] args) {
		String name="Biswa";
		char target='u';
		System.out.println(Search(name, target));

	}
	static Boolean Search(String name,char target) {
		if(name.length()==0) {
			return false;
		}
		for(int i=0;i<name.length();i++) {
			if(target==name.charAt(i)) {
				return true;
			}
		}
		
		return false;
	}

}
