package Searching;

public class Exercise2 {

	public static void main(String[] args) {
		String name="biswajit";
		char ch='j';
		System.out.println(searching(name,ch));

	}

	static boolean searching(String name, char ch) {
	if(name.length()==0) {
		return false;
	}
	for(int i=0;i<name.length();i++) {
		if(ch==name.charAt(i)) {
			return true;
		}
	}
		return false;
	}
	

}
