package day07ifelseifstatementdt;

import java.util.Scanner;

public class Ifelseif02 {

	public static void main(String[] args) {
		/*Kullanicidan bir harf alin
		 Bu harf 'a' veya 'A' ise ekrana "Ilk harf" yazdirin
		 Bu harf 'b' veya 'B' ise ekrana "Ikinci harf" yazdirin
		 Bu harf 'c' veya 'C' ise ekrana "Ucuncu harf" yazdirin
		 Diger harfler icin "Sirasini bilmiyorum" yazdirin
		 */
		 
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir Harf giriniz");
		char Harf = scan.next().charAt(0);
		
		if(Harf=='a' || Harf=='A') {
			System.out.println("ilk harf");
		}else if(Harf=='b' || Harf=='B') {
			System.out.println("ikinci harf");
		}else if(Harf=='c' || Harf=='C') {
			System.out.println("Ucuncu harf");
		} else{
		System.out.println("Sırasını bilmiyorum");
		
	}
		scan.close();
	}
}