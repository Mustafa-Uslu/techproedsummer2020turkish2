package day07ifelseifstatementdt;

import java.util.Scanner;

public class Ifelseif01 {

	public static void main(String[] args) {
		/* Kullanicidan sayi alin
		 Sayi sifirdan buyuk ise ekrana "Pozitif" yazdirin
		 Sayi sifir ise ekrana "Notr" yazdirin
		 Sayi sifirdan kucuk ise ekrana "Negatif" yazdirin
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		double s= scan.nextDouble();
		
		if(s>0) {
			System.out.println("Positif");
		}else if (s==0) {
			System.out.println("Notr");
		}else if(s<0) {
			System.out.println("Negatif");
		}else {
			System.out.println("Ben sana bir sayi gir dedim");
			
			/*
		 Kullanicidan sayi alin
		 Sayi sifirdan buyuk ise ekrana "Pozitif" yazdirin
		 Sayi sifir ise ekrana "Notr" yazdirin
		 Sayi sifirdan kucuk ise ekrana "Negatif" yazdirin
		*/
		
			/* yukarıdaki code ile aynıdır.Codu Kisaltmak icin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		double s = scan.nextDouble();
		
		if(s>0) {
			System.out.println("Pozitif");
		}else if(s==0) {
			System.out.println("Notr");
		}else{
		System.out.println("Negatif");
			 */
		}
		scan.close();
	}

}
