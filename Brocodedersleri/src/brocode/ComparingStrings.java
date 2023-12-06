package brocode;
import java.util.Scanner;

public class ComparingStrings {

	public static void main(String[] args) {
		
		String name1;
		String name2;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter two names: ");
		
		name1 = scan.nextLine();
		name2 = scan.nextLine();
		
		
		int result = name1.compareTo(name2);
		
		if (result<0)
			System.out.println(name1 + " comes first");
		else if (result==0)
			System.out.println("Same name");
		else 
			System.out.println(name2 + " comes first");

	}

}
