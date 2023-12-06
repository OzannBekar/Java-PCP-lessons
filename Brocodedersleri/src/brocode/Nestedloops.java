package brocode;
import java.util.Scanner;
public class Nestedloops {

	public static void main(String[] args) {
		int rows;
		int columns;
		String symbol = "";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the row number");
		rows = scan.nextInt();
		System.out.println("Enter the column number");
		columns = scan.nextInt();
		System.out.println("Enter the symbol");
		symbol = scan.next();
		
		for(int i=0; i<rows; i++) {
			System.out.println();
			for(int j=0; j<columns; j++) {
				System.out.print(symbol);
			}
		}
	}

}
