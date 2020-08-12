package day04scanner;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		
		/*
		 Kullanıcıdan dikdörtgenin boyutlarını alan ve sonra diktörtgenin alan ve 
        cevresini hesaplayıp ekrana yazdıran bir program yazınız. 
        Not: Alan: Boy x En
        Not: Çevre: 2x(Boy + En)
		*/
		/*2.yol 
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Lutfen Dikdortgenin Kenar olculerini Giriniz");
		int eni=scan1.nextInt();
		int boyu=scan1.nextInt();
		System.out.println("Alan= " + eni*boyu);
		System.out.println("Cevre= " + 2*(eni+boyu));
		scan.close();
		*/
	Scanner scan=new Scanner (System.in);
	System.out.println("Dikdörtgenin en ve boyunu giriniz.");
	double en = scan.nextDouble();
	double boy = scan.nextDouble();
	System.out.println("Alan= " + en*boy);
	System.out.println("Cevre= " + 2*(en+boy));
	scan.close();
	 }
}