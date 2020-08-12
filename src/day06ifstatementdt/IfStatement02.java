package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement02 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan bir gun alın eğer gun 
		 “Cuma” ise ekrana “Müslümanlar icin kutsal gün” yazdırın.
	     “Cumartesi” ise ekrana “Yahudiler icin kutsal gün” yazdırın. 
	     “Pazar” ise ekrana “Hristiyanlar icin kutsal gün” yazdırın
		*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir Gun giriniz");
		String gun = scan.next();
		//String'leri karsilastirirken sakin haaa "==" kullanmayin
		//String'leri karsilastirirken kesinlikle equals() kullanin
		//equals() boolean return eder.
		
		if(gun.equals("Cuma")) {
			System.out.println("Muslumanlar icin Kutsal Gun");
		}
			
		if(gun.equals("Cumartesi")) {
			System.out.println("Yahudiler icin Kutsal Gun");
		}
		if(gun.equals("Pazar")) {
			System.out.println("Hristiyanlar icin Kutsal Gun");
		}
			
		scan.close();	

	}

}
