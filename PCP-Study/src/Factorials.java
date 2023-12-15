import java.util.Scanner;
public class Factorials {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int number;
		int fact = 0;
		int i = 1;
		int s = 0;
		
		
		System.out.println("Please enter a nonnegative number to "
				+ "print factorial of that number: ");		
	number = scan.nextInt();	
	while (number<0) {		
		System.out.println("Please enter a nonnegative number to "
				+ "print factorial of that number");
		number = scan.nextInt();	
	}	
	if(0 == number)
		System.out.println("Result:1");
	else {
	while (i < number) {				
		System.out.print(i+"*");
		i += 1;		
	}
	s = number;
	System.out.print(i+ "=");
	while (1 < number) {		
		number -= 1;
		s *= number;		
	}	
	System.out.print(s);	
	}
	}
}
