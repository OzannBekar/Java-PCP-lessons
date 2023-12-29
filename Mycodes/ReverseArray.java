import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a positive integer");
		
		int N = scan.nextInt();
		int[] answers = new int[N];
		
		
		System.out.println("Enter the values:");
		for ( int i=0; i<N; i++)
		{
			answers[i] = scan.nextInt();
			System.out.println(i + " -> " + answers[i]);
		}
			int temp;
			for(int i = 0; i<N/2; i++) {
				temp = answers[i];
				answers[i] = answers[(N-1)-i];
				answers[(N-1)-i] = temp;
	}

			for(int i = 0; i<N; i++)
				System.out.println(i + " -> " + answers[i]);
}
}