import java.util.Scanner;
public class Divisors {

	public static void main(String[ ] args)
	 { 
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter N: ");
		int N = scan.nextInt();
		int Sum = 0;
		
		for(int i = 1; i<=N ; i++) 
			if(N%i == 0 && i%2 != 0)
				Sum += i;
		
		System.out.println("Sum of positive odd divisors of "+N+ " is "+Sum);	
		 
	
	
	 
		
}
	}