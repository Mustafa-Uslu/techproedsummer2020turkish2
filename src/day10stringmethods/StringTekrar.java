package day10stringmethods;

import java.util.Scanner;

public class StringTekrar {
	//kullanıdan ilk ve soy isimini alın ilk ve soy isiminin kaç harften oluştuguu ekrana yazın
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen adinizi ve soy adinizi giriniz");
		String ad=scan.next();
		String soyad=scan.next();
		
	//	System.out.println(ad.length());
	//  System.out.println(soyad.length());
		int uzunluk=ad.length()+soyad.length();
		System.out.println("Isim ve soyisminizde "+uzunluk+" karakter vardir");
	
	// Kullanıcıdan ilk ve soy ismini alın ilk ve soy isminin ilk harflerini büyük harf olarak ekrana yazdırın
		ad.toUpperCase();
		soyad.toUpperCase();
		String ilkHarf =ad.toUpperCase().substring(0,1);
		String soyIlkHarf=soyad.toUpperCase().substring(0,1);
		
		System.out.println(ilkHarf+soyIlkHarf);
	
				
		scan.close();
	
}
}