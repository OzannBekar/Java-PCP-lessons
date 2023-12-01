package brocode;

import java.util.Scanner;

public class Mathclass {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		double s;
		double area;
		
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Please enter three values to calculate the are of an triangle");
		
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		s =(a+b+c)/2;
		
		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
	
System.out.println("The area of you triangle is: "+area);
	}


}
