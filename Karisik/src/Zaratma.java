import java.util.Random;

public class Zaratma {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
	int	zar1;
	int	zar2;
	int toplam;
		
	zar1 = ran.nextInt(6)+1;
	zar2 = ran.nextInt(6)+1;
	toplam = zar1+zar2;
	System.out.println("Zar1: "+ zar1 +"\nZar 2: "+ zar2 + "\nToplam: "+ toplam);

		

	}

}
