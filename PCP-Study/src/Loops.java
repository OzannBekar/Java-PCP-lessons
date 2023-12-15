import java.util.Scanner;

public class Loops

{
public static void main(String[] args)
{
 int limit;
 int sum = 0;
 int count = 1;
 
 Scanner scan = new Scanner(System.in);
 
 System.out.println("How many time do you want it to repeat: ");
 limit = scan.nextInt();
 

while (count <= limit){                                             
			
System.out.println(count +". I love Computer Science!!");

sum += count;
count++;

	}
System.out.println("Printed this message " + limit + " times. "
		+ "The sum of the numbers from 1 to "+ limit + " is " + sum );

}

}
