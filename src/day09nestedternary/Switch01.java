package day09nestedternary;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan bir harf alin
		 Harf 'a' veya 'A' ise ekrana "Ilk harf" yazdirin 
		 Harf 'b' veya 'B' ise ekrana "Ikinci harf" yazdirin
		 Harf 'c' veya 'C' ise ekrana "Ucuncu harf" yazdirin
		 Diger durumlarda ekrana "Tanimlanamadi" yazdirin
		 */
		
		Scanner scan = new Scanner(System.in);			
		System.out.println("Bir harf giriniz");
		char ch = scan.next().charAt(0);
		//1.yol: if-else-if kullandik
		if(ch=='a' || ch=='A') {
			System.out.println("ilkharf");
		}else if(ch=='b' || ch=='B') {
			System.out.println("ikinciharf");
		}else if(ch=='c' || ch=='C') {
			System.out.println("ucuncuharf");
		}else {
			System.out.println("Tamamlanamadi");
		}
		//2. yol : switch statement
		switch(ch) {		
	    case 'a':
	    case 'A':
	    	System.out.println("Ilk harf");
	    	break;
	    case 'b':
	    case 'B':
	    	System.out.println("Ikinci harf");
	    	break;
	    case 'c':
	    case 'C':
	    	System.out.println("Ucuncu harf");
	    	break;
	    default:
	    	System.out.println("Tanimlanamadi");	

		
		}
		scan.close();
	}
 	
	
}
