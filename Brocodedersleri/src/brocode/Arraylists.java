package brocode;

import java.util.ArrayList;

public class Arraylists {

	public static void main(String[] args) {
		
		ArrayList<String> music = new ArrayList<String>(); //Wrapper reference data type inside the box
		
		music.add("Metal");
		music.add("Jazz");
		music.add("Blues");
		music.add("Indie");

		
		
		for(int i=0; i<music.size(); i++) {
			
			System.out.println(music.get(i));
		}
		System.out.println();
			music.remove(0);
			
			for(int i=0; i<music.size(); i++) {
				
				System.out.println(music.get(i));							
		}
			
			
			music.clear();
			
			for(int i=0; i<music.size(); i++) {
				
				System.out.println(music.get(i));

}
}
}