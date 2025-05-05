package Number;

public class Exercise2 {

	public static void main(String[] args) {
	Exercise2(5);

	}
	static void Exercise2(int n) {
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}

}
