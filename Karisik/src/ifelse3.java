import java.util.Scanner;
public class ifelse3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		int t;
		System.out.println("Enter three value: ");
		a = scan.nextInt(); b = scan.nextInt(); c= scan.nextInt();
		
		if (a > b)	
		{
			t = a;
			a = b;
			b = t;
		}
		if (b > c)			
		{
			t = b;
			b = c;
			c = t;
		}
		if (a > b)
		{
			t = a;
			a = b;
			b = t;
		}	
		System.out.println("Smaller to higher: " + a + " < " + b + " < " + c);
	}
	}		