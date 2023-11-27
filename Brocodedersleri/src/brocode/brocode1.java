package brocode;

public class brocode1 {

	public static void main(String[] args) {
		
		String name = "Matematik";
		String lesson = "Ozan";
		String ogrenci = "Ahmet";
		String gelecek;
		
		gelecek = ogrenci;
		ogrenci = lesson;
		lesson = gelecek;
		
			System.out.println("Dersimiz "+name+" Öğretmenimiz "+lesson+" Öğrencimiz "+ogrenci);

	}

}
