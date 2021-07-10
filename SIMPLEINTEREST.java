import java.util.Scanner;
public class SIMPLEINTEREST {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		int P =  input.nextInt();
		int R =  input.nextInt();
        int t =  input.nextInt();
        long si = (P*R*t)/100;
        System.out.println(si);
        
	}

}
