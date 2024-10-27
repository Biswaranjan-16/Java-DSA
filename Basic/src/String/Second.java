package String;

public class Second {

	public static void main(String[] args) {
		String greet=mygreet("Biswaranjan Biswal");
		System.out.println(greet);
	}

	static  String mygreet(String name) {
		String message="hello " +name;
		return message;
		
	}
}
