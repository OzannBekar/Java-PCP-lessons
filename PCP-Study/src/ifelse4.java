
import java.util.Scanner;
public class ifelse4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		System.out.println("Enter three value: ");
		a = scan.nextInt(); b = scan.nextInt(); c= scan.nextInt();
		
		if (a<=b)	
		{
			if(b<=c)			
			System.out.println("Smaller to higher: " + a + " < " + b + " < " + c);		
			else 			
				if(a<=c)
					System.out.println("Smaller to higher: " + a + " < " + c + " < " + b);								
			else 
				System.out.println("Smaller to higher: " + c + " < " + a + " < " + b);
		}
		else
		{
			if(a<=c)
				System.out.println("Smaller to higher: " + b+ " < " + a + " < " + c);
			else
				System.out.println("Smaller to higher: " + b + " < " + c + " < " + a);
		}
		
	
	}
}
