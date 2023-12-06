
import java.util.Scanner;

public class BulletGame {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);

final int MAX = 20;
int ammo;
int a;
int constant = 0;
String answer = "y";
System.out.println("How many ammo do you have(Capacity of a mag is 20): ");
ammo = scan.nextInt();
		
while(MAX<ammo) {
	System.out.println("You entered wrong");
	System.out.println("How many ammo do you have(Capacity of a mag is 20): ");
	ammo = scan.nextInt();
}

System.out.println("How many ammo do you want to use: ");
a = scan.nextInt();
while(ammo<a) {
	
	System.out.println("You dont have that much");
	System.out.println("How many ammo do you want to use: ");
	a = scan.nextInt();
}
if(a == 0)
	System.out.println("Ups you accidentally shoot and lost 1 bullet");
do {
	ammo --;
	a --;
}
while(0<a);

System.out.println("You have "+ ammo + " bullets left");

if(0<ammo)
System.out.println("Do you want to unload your magazine(y/n): ");
answer = scan.next();

if(answer.equalsIgnoreCase("y")) {		

	constant = ammo;
for(int i = 0; i<constant; i++)
{
ammo--;	

}	

System.out.println("You have "+ammo+" ammo left");
}
else
	System.out.println("You have "+ammo+ " ammo left");



	}

}
