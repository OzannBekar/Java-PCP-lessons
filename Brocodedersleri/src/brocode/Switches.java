package brocode;

import java.util.Scanner;

public class Switches {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
		
		String lesson;
		System.out.println("Enter a lesson: ");
		lesson = scan.nextLine();	
				
		
		
		switch(lesson) {
		case "English": System.out.println("English lesson");
		break;
		case "Physic": System.out.println("Physic lesson");
		break;
		case "Computer": System.out.println("Computer lesson");
		break;
		case "Turkish literature": System.out.println("Turkish lesson");
		break;
		case "Lab": System.out.println("Lab Lesson");
		break;
		case "Math": System.out.println("Math lesson");
		break;
		default: System.out.println("This is not a lesson");
			
		
		}	
		}
				
				
		

	}


