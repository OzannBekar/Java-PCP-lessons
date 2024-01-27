package brocode;

public class Methods {

	public static void main(String[] args) {
		
		String name = "John";
		int age = 27;
		
		int a=5;
		int b=10;		
		
		nameandage(name,age);
		int z =add(a,b);
		int p =ageplus(z,age);
		
System.out.println("5 + 10 is = " +z);
System.out.println("My age plus the addition is = "+p);

	}

	//method
	static void nameandage(String name,int age) {
		System.out.println("I'm "+name+" and I'm "+age+ " years old.");
}
	
	//normal way
	static int add(int x,int y) {
		
		int z = x+y;
		
	return z;
}
	
	
	//shorter
	static int ageplus(int z,int age) {
		
		return z+age;
		
	}
}