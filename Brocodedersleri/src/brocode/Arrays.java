package brocode;

public class Arrays {

	public static void main(String[] args) {
	
		//Way One
		String[] cars = {"Mustang","Mercedes","BMW"};
		
		cars[0] = "Porsche";
		
		for(int i=0; i<cars.length; i++)
			System.out.println(cars[i]);
		System.out.println();
		
		//Way Tne
		String[] carss = new String[3];
		
		carss[0] = "Mustang";
		carss[1] = "Mercedes";
		carss[2] = "BMW";
		
		for(int i=0; i<carss.length; i++)
			System.out.println(carss[i]);
		
		//2D ARRAYS
		
		//Way One
		String[][] CARS = {
							{"Mustang","Mercedes","BMW"},
							{"Porsche","Corvette","Camaro"},
							{"Tesla","Lambo","Ranger"}
							};
		for(int i=0; i<CARS.length; i++) {
			System.out.println();
		for(int j=0; j<CARS[i].length; j++)
			System.out.print(CARS[i][j]+" ");
		}	
		System.out.println();
		
		//Way Two
		String[][] CARSS = new String[3][3];
		
		CARSS[0][0] = "Mustang";
		CARSS[0][1] = "Mercedes";
		CARSS[0][2] = "BMW";
		CARSS[1][0] = "Porsche";
		CARSS[1][1] = "Corvette";
		CARSS[1][2] = "Camaro";
		CARSS[2][0] = "Tesla";
		CARSS[2][1] = "Lambo";
        CARSS[2][2] = "Ranger";
				
		for(int i = 0; i<CARSS.length; i++) {
			System.out.println();
		for(int j = 0; j<CARSS[i].length; j++)
			System.out.print(CARSS[i][j]+" ");
			
				
		
		
		}
		
		}
	
	}


