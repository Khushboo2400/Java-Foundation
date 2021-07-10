import java.util.Scanner;
public class SOLTUON2 {

	public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
		String C= s.next();
		char CH = C.charAt(0);
		
		if (Character.isUpperCase(CH)==true)
		{System.out.println(1);
		}
		else if (Character.isLowerCase(CH)==true)
		{System.out.println(0);
		}
		else {
		System.out.println(-1);
		}
		
		
	}

}
