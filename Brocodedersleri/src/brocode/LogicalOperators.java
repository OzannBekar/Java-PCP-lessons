package brocode;

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		
		int temp = 25;
		
		
		if (20<temp && temp<30) // and logic
			System.out.println("It is Warm outside");	
			else if (30<temp)
				System.out.println("It it Hot outside");		
			else
				System.out.println("It is cold outside");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("You are playing a game! Press q ort Q to quit: ");
		
		String response = scan.next();
		
		if (response.equals("q") || response.equals("Q")) // Or logic
			System.out.println("You quit the game");
		else 
			System.out.println("You are still playing the game");
		
		
		if (!response.equals("q") && !response.equals("Q")) // Not and and logic
			System.out.println("You are still playing the game");
		else 			
			System.out.println("You quit the game");
		
		

	}

}
