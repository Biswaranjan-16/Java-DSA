package Basic;

public class Reverse {

	public static void main(String[] args) {
		int num=123466547;
		int ans=0;
		while(num>0) {
			int rev= num% 10;
			ans=ans * 10+rev;
			num /=10;
			
		}
		System.out.println(ans);
	}

}
