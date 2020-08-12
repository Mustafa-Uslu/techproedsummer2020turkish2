package day15constructors;

public class Soru {

	
	public static void main(String[] args) {

		cevir("Saat",5);

}



public static void cevir(String birim, int miktar) {

		 switch(birim) {

		   case "saat":

		           System.out.println(miktar*60*60);

		        break;

		   case "mil":

			      System.out.println(miktar*1.6);

			   break;

		   case "kilogram":

			      System.out.println(miktar*1000);

			   break;

		   default:

			   System.out.println("saat, mil ve kilogram disinda bir birim girmeyiniz");		

		}		

}
}
