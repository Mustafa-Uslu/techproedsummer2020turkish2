package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement03 {

	public static void main(String[] args) {
		
		// Kullanıcıdan bir sayi alın Negatifse ekrana "Negatif yazdırın"
		//Kullanıcıdan bir sayi alın Positive ekrana "Polsitive yazdırın"
		//Kullanıcıdan bir sayi alın 0 ekrana "Notr yazdırın"

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir Sayı giriniz");
		int deger = scan.nextInt();
		 
		if(deger>0) {
			System.out.println("Positif");
		}
			
		if(deger<0) {
			System.out.println("Negatif");
		}
		
		if(deger==0) {
			System.out.println("Notr");
		}
		scan.close();	
	}

}