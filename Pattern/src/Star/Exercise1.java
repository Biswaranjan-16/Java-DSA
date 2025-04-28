package Star;

public class Exercise1 {

	public static void main(String[] args) {
		Exercise1(4);

	}
	static void Exercise1(int n) {
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
