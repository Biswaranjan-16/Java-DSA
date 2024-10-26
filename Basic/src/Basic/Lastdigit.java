package Basic;

public class Lastdigit {

	public static void main(String[] args) {
		int a=65787576;
		int count=0;
		while(a>0) {
			int last=a % 10;
			if(last == 7) {
			count ++;
		}
        a=a/10;
		}
System.out.println("Number of 7 :"+ count);
	}

}
