package brocode;

import java.util.ArrayList;
public class For_eachloop {

	public static void main(String[] args) {
		
		String[] students = {"Sertac","Ozan","Zeynep","Sude","Uzeyir"};
		
		for(String i : students)
			System.out.println(i);

		System.out.println();
		
		ArrayList<String> animals = new ArrayList<>();
		
		animals.add("bear");
		animals.add("eagle");
		animals.add("fish");
		animals.add("turtle");
		animals.add("dolphin");
		
		for(String i : animals)
			System.out.println(i);
		
		
	}

}
