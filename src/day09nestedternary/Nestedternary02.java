package day09nestedternary;

import java.util.Scanner;

public class Nestedternary02 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan bir ucgenin uc kenar uzunlugunu alin
		 Ucu birbirine esitse ucgenin cevresini kontrol edin
		 Cevre 30 dan buyuk ise "Ne buyuksun!" yazdirin degilse "Normal" yazdirin
		 Ucu birbirine esit degilse ucgenin cevresini kontrol edin
		 Cevre 20 den kucuk ise "Ne kucuksun!" yazdirin degilse "Normal" yazdirin
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ücgenin 1.kenaini giriniz");
		int s1 = scan.nextInt();
		System.out.println("ücgenin 2.kenaini giriniz");
		int s2 = scan.nextInt();
		System.out.println("ücgenin 3.kenaini giriniz");
		int s3 = scan.nextInt();
		
String result = (s1==s2 && s2==s3) ? ((s1+s2+s3>30) ? ("Ne Buyuksun!") : ("Normal"))
		         : ((s1+s2+s3<20) ? ("Ne kucuksun!") : ("Normal sayi"));
		System.out.println(result);
		
		scan.close();

	}

	
	
	
	
}
