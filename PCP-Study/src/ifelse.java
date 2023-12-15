import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		int a ;
		final int max=15;
		System.out.println("Enter a value");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		if(a<max) {
		System.out.println("The value you entered is lower than max value");
		}
		else 
			System.out.println("The value you entered is higher than max value");
	}
}