package day05incrementdecrement;

public class Concatenation {

	public static void main(String[] args) {
		// Concatenate = Birbirine baglamak(Fiil)    Concatenation = Birbirine baglayis(isim)

		String s1 = "Java";
		String s2 = "Kolaydir";
		System.out.println(s1+s2);// JavaKolaydir
		System.out.println(s1 + " " + s2);//Java Kolaydır
		
		String s3 = "Ali ";
		String s4 = "Can";
		System.out.println(s3 + s4);// Ali Can ==>Aradaki boşluk Alinin sonundan geldi
		
		String s5 = "Ayse";
		String s6 = " Han";
		System.out.println(s5 + s6);// Ali Can ==>Aradaki boşluk Han"nin başından geldi
		
	}

}
