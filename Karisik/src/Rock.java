import java.util.Scanner;
import java.util.Random;
public class Rock
{
 public static void main(String[] args)
{
String personPlay; //User's play -- "R", "P", or "S"
String computerPlay=""; //Computer's play -- "R", "P", or "S"
int computerInt; //Randomly generated number used to determine
//computer's play

Scanner scan = new Scanner(System.in);
Random generator = new Random();
System.out.println("Enter your play: R, P, or S");
personPlay = scan.next();
personPlay = personPlay.toUpperCase();


computerInt = generator.nextInt(3);

switch (computerInt)
{
case 0: 
	computerPlay =  "R" ;
break;
case 1: 
	computerPlay =  "P";
break;
case 2: 
	computerPlay =  "S";
}

System.out.println("Computer play is " + computerPlay);
//See who won. Use nested ifs instead of &&.


if (personPlay.equals(computerPlay))
	
System.out.println("It's a tie!");

else if (personPlay.equals("R"))
	
if (computerPlay.equals("S"))
	
System.out.println("Rock crushes scissors. You win!!");

else 	
	System.out.println("Paper wraps rock. You lose!!");
	
else if (personPlay.equals("S"))
	 if (computerPlay.equals("P"))
		System.out.println("Scissors cuts paper. You win!!");
	 else 
		 System.out.println("Rock crushes scissors. You lose!!");
	
	else if (personPlay.equals("P"))
	if (computerPlay.equals("S"))
		System.out.println("Scissors cuts paper. You lose!!");
	else
		System.out.println("Paper wraps rock. You win!!");
}
}