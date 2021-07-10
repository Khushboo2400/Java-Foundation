import java.util.Scanner;

public class FAHTOCEL {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
 		int F = S.nextInt();
//	//	int cel= (5/9)*(F-32);
	   int cel=(5*(F-32))/9;
		int cal=(int)((5.0/9)*(F-32));
     	System.out.println(cel);
     	System.out.println(cal);

		System.out.println(9/5);
		System.out.println(9.00/5);
		System.out.println(9+5);
		System.out.println(9-5);
		System.out.println(9*5);
		System.out.println(9%5);
		System.out.println('A'+'B');
		char c='a';
		char i=(char)(c+3);
		System.out.println(i);




	}

}
