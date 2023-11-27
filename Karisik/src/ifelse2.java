
import java.util.Scanner;


public class ifelse2 {

	public static void main(String[] args) {
		
		double currentSalary;
		double rating;
		double raise = 0;
		Scanner scan = new Scanner(System.in);
        
		
		System.out.print ("Enter the curren salary: ");
		currentSalary = scan.nextDouble();
		System.out.print ("Enter the performance rating(between 1-3): ");
		rating = scan.nextDouble();
		
		
		if(rating == 1) 
			raise = currentSalary * 0.06;
		
		else if (rating == 2) 
			raise = currentSalary * 0.04;
		
		else if (rating == 3) 
			raise = currentSalary * 0.015;	
				
				
					
			
		currentSalary = currentSalary + raise;
		System.out.println ("New Salary: " + currentSalary);
		System.out.println ("Raise: " + raise);
		
		
				
				
		
	}

}
