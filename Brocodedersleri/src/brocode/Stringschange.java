package brocode;

public class Stringschange {

	public static void main(String[] args) {
		
		String name = "Ozan";
		String lesson = "Matematik";
		String Teacher = "Salim";
		String zapp;
		
		zapp = name;
		name = lesson;
		lesson = zapp;
		zapp = lesson;
		lesson = Teacher;
		Teacher = zapp;
		
			System.out.println("Name: "+name+" Lesson: "+lesson+" Teacher: "+Teacher);

	}

}
