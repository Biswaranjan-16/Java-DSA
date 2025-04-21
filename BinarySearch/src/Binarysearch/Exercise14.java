package Binarysearch;

public class Exercise14 {

	public static void main(String[] args) {
		String str="biswa";
		char target='a';
		System.out.println(stringsearch(str, target));

	}
	static boolean stringsearch(String  str,char target) {
		
		if(str.length()==0) {
			return false;
		}
		for(int i=0;i<str.length();i++) {
			if(target==str.charAt(i)) {
				return true;
			}
		}
		return false;
	}

}
