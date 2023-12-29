
import java.util.Scanner;

public class GradingQuizzes {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		String repeat;
		
		System.out.print("How many questions are in the quiz: ");
		
		int questions = scan.nextInt();
		
		System.out.print("Enter the correct answers: ");
		
		int[] answers = new int[questions];
		
		for(int i = 0; i<questions; i++) {	
			int key = scan.nextInt();
			answers[i] = key	;
		}
		
		do {
		int correct=0;
		System.out.print("Enter your answers: ");
		for(int i = 0; i<questions; i++)
		{
			int studentanswers = scan.nextInt();
			
		if(studentanswers == answers[i])								
				correct++;
				
				
			}
			
		System.out.println(correct +" Answer of yours is true. ");
		
		if(correct != 0)
		System.out.println("Percent of correct is "+ (double) correct*100/questions );
		else
			System.out.println("Percent of correct is 0 " );
				
		
		System.out.println("Wanna do again(y/n): ");
		repeat = scan.next();
		}while(repeat.equals("y"));
		
		
	}
}


