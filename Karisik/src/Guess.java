// ************************************************************
// Guess.java
//
// Play a game where the user guesses a number from 1 to 10
//
// ************************************************************
import java.util.Scanner;
import java.util.Random;
public class Guess
{
public static void main(String[] args)
{
int numToGuess; 
int guess; 
int count = 1;
int higher = 0;
int lower = 0;

Scanner scan = new Scanner(System.in);

Random generator = new Random();

numToGuess = generator.nextInt(10)+1;

System.out.println("Enter a integer to guess the number(1-10): ");
guess = scan.nextInt();


while (guess != numToGuess)
 {	
if(guess<numToGuess) {
	System.out.println("The number is higher than your guess");
	higher++;
}
else {
	System.out.println("The number is lower than your guess");	
    lower++;
 }

guess = scan.nextInt();

count++;
}
System.out.println("Congratulations your guess is correct");
System.out.println("You tried for "+(count)+" times");
System.out.println(lower+" times of lower than your guess and "+higher+" times of higher than your guess");

}
}