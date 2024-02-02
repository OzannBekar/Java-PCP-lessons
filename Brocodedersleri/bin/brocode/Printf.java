package brocode;

public class Printf {

	public static void main(String[] args) {
		
		Boolean MyBoolean = true;
		String MyString = "Azir";
		int MyInt = 120;
		char MyChar = 'A';
		double MyDouble = 1000;
		double Mydouble = -1000;
		
		
		System.out.printf("The answer is %b",MyBoolean);
		System.out.println();
		System.out.printf("My charachter is %s",MyString);
		System.out.println();
		System.out.printf("A hunder twenty is: %d",MyInt);
		System.out.println();
		System.out.printf("First letter of Azir is: %c",MyChar);
		System.out.println();
		System.out.printf("A thousand is: %f",MyDouble);
		System.out.println();
		
		///////////////////////////////////////////////////////////////
		
		System.out.printf("This champ is a mid laner %20s",MyString);
		System.out.println();
		System.out.printf("You have this much money %.1f",MyDouble);
		System.out.println();
		System.out.printf("You have this much money %20f",MyDouble);
		System.out.println();
		System.out.printf("You have this much money %-20f",MyDouble);
		System.out.println();
		System.out.printf("You have this much money %+f",MyDouble);
		System.out.println();
		System.out.printf("You have this much money %+f",Mydouble);
		System.out.println();
		System.out.printf("You have this much money %020f",MyDouble);
		System.out.println();
		System.out.printf("You have this much money %,.0f",MyDouble);
	}

}
