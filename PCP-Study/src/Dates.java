import java.util.Scanner;
public class Dates
{
public static void main(String[] args)
{
int month, day, year; //date read in from user
int daysInMonth = 0; //number of days in month read in
boolean monthValid=false, yearValid = false, dayValid=false; //true if input from user is valid
boolean leapYear = false; //true if user's year is a leap year
Scanner scan = new Scanner(System.in);

System.out.println("Enter the year");
year = scan.nextInt();
System.out.println("Enter the month");
month = scan.nextInt();
System.out.println("Enter the day");
day = scan.nextInt();

if(1<=month && month<=12)
  monthValid = true;

if(1000<=year && year<=1999)
	yearValid = true;

if(year%400 == 0 || year%4 == 0 && year%100 != 0)
	leapYear = true;

switch(month) {
case 1: daysInMonth = 31;
	break;
case 2: 
	if(leapYear == true)
	daysInMonth = 29;
else 
	daysInMonth = 28;
	break;
case 3: daysInMonth = 31;
	break;
case 4: daysInMonth = 30;
	break;
case 5: daysInMonth = 31;
	break;
case 6: daysInMonth = 30;
	break;
case 7: daysInMonth = 31;
	break;
case 8: daysInMonth = 31;
	break;
case 9: daysInMonth = 30;
	break;
case 10: daysInMonth = 31;
	break;
case 11: daysInMonth = 30;
	break;
case 12: daysInMonth = 31;	
}
if (0<day && day<=daysInMonth)
	dayValid = true;

if (dayValid == true && monthValid == true && yearValid == true)
	if(leapYear == true)
		System.out.println(day+"/"+month+"/"+year+"date is valid and a leap year.");
		else
			System.out.println(day+"/"+month+"/"+year+" date is valid and  not a leap year");
			else
				System.out.println(day+"/"+month+"/"+year+" date is not valid");
}
}