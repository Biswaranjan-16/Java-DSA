package Star;

public class Exercise1 {

	public static void main(String[] args) {
		//Exercise1(4);
		Exercise2(5);
		//Exercise3(6);

	}
	static void Exercise2(int n) {
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void Exercise3(int n) {
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=n;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void Exercise1(int n) {
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=n-row+1;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
