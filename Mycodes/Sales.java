
import java.util.Scanner;


public class Sales
{
public static void main(String[] args)
{
	Scanner scan = new Scanner(System.in);
System.out.println("Enter the number of the sales people: ");	
int salespeople = scan.nextInt();
int[] sales = new int[salespeople];
int sum, max, maxID,min,minID;


for (int i=0; i<sales.length; i++)
 {
System.out.print("Enter sales for salesperson " + (i+1) + ": ");
sales[i] = scan.nextInt();
 }
System.out.println("\nSalesperson Sales");
System.out.println("------------------ ");

sum = 0;
max = sales[0];
maxID = 1;
min = sales[0];
minID = 1;
for (int i=0; i<sales.length; i++)
	
 {
	
System.out.println(" " + (i+1) + " " + sales[i]);
sum += sales[i];
if(sales[i]>max) {
	max = sales[i];
	maxID = i+1;
}
if(sales[i]<min) {
	min = sales[i];
	minID = i+1;
	
}
 }

System.out.println("\nTotal sales: " + sum);

System.out.println("\nAverage sale: " + (double)sum/sales.length);
System.out.println("Salesperson "+maxID+" had the highest sale with "+max +" liras.");
System.out.println("Salesperson "+minID+" had the lowest sale with "+min +" liras.");

System.out.print("\nEnter a limit value: ");

int limit = scan.nextInt();

int count = 0;
for(int i = 0; i<sales.length; i++)
	if(sales[i] > limit)
	{
	System.out.println("Salesperson " + (i+1) + " exceeded the limit with " + sales[i]+" liras.");
	count++;
	}		

System.out.println(count + " salespe" + (count>1? "ople":"rson") + " exceeded the limit.");
}

}