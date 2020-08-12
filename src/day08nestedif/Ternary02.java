package day08nestedif;

import java.util.Scanner;

public class Ternary02 {

	public static void main(String[] args) {
	/*
	 * Kullanıcıdan bir üçgenin  üç kenar uzunluğunu alın eğer üç kenar uzunluğu birbirine eşit ise ekrana
	“Eşkenar üçgen” yazdırın. Diğer durumlarda ekrana “Eşkenar değil” yazdırın.
	 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Ucgenin 1. kenar sayi giriniz");
		int sayi1 = scan.nextInt();
		System.out.println("Ucgenin 2. kenar sayi giriniz");
		int sayi2 = scan.nextInt();
		System.out.println("Ucgenin 3. kenar sayi giriniz");
		int sayi3 = scan.nextInt();
		
		String result = sayi1==sayi2 && sayi2==sayi3 ? "Eskenar ucgendir" : "Eskenar ucgen degil";
		System.out.println(result);
		
		scan.close();
		
		
		/*2.yol
		 * 
		 Kullanıcıdan bir üçgenin üç kenar uzunluğunu alın 
		 Eğer üç kenar uzunluğu birbirine eşit ise ekrana “Eşkenar üçgen” yazdırın. 
		 Diğer durumlarda ekrana “Eşkenar değil” yazdırın.
		 Ternary ile cozun
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ucgenin uc kenar uzunlugunu giriniz");
		int k1 = scan.nextInt();
		int k2 = scan.nextInt();
		int k3 = scan.nextInt();
		
		String result = k1==k2 && k2==k3 ? "Eskenar Ucgen" : "Eskenar Ucgen Degil";
		System.out.println(result);

		 * 
		 */
		
	}

}
