import java.util.Scanner;

public class sumtilln {

		public static void main(String[] args) {
		 Scanner sob = new Scanner(System.in);
        int n =sob.nextInt();
        int sum=0;
        int i=1;
        while(i<=n) {
        if(i%2==0)
        {
        sum=sum+i;	
        }
        i=i+1;
        }   
        System.out.println(sum);
        
        
        
        
        
        }
        }