package brocode;

public class overloadedmethods {

	public static void main(String[] args) {
		
	int x =add(5,4);
	System.out.println(x);
	System.out.println();
	int y = add(2,3,5);
	System.out.println(y);
	System.out.println();
	int z = add(5,4,1,1);
	System.out.println(z);
	
	}
	
	static int add(int a,int b) {
		System.out.println("Method #1");
		return a+b;
	}
	static int add(int a,int b,int c) {
		System.out.println("Method #2");
		return a+b+c;
	}
	static int add(int a,int b,int c,int d) {
		System.out.println("Method #3");
	return a+b+c+d;
}
}
