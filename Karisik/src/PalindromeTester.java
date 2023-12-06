import java.util.Scanner;
public class PalindromeTester {
	

	public static void main(String[] args) {
		
		int left, right;
		String str, another = "y" ;
		
		
		Scanner scan = new Scanner(System.in);
		
		
		while(another.equalsIgnoreCase("y")) {
			
			System.out.println("Enter a potentional palindrome: ");
			str = scan.nextLine();
			
			left = 0;
			right = str.length() - 1;
			
			while(str.charAt(left) == str.charAt(right) && left<right) {
				left++;
				right--;
				
			}
			
			if(left<right)
				System.out.println("That string is not a palindrome");
			else
				System.out.println("That string is a palindrome");
			
			System.out.println("Test another palindorme (y/n)? ");
			another = scan.nextLine();
			
		}
		
		
		
		
		
	}

}
