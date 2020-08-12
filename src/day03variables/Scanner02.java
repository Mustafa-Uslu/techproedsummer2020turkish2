package day03variables;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		//1) Kullanicidan Tam ismini alin ekrana yazin
		//2) Kullanicidan yasini alin ekrana yazin
		//3) Kullanicidan isminin ilk harfini alin ekrana yazin alin
		//4) Kullanicinin cocuk sayisini byte ile aliniz

		System.out.println("Tam isminizi giriniz");
		String tamisim =scan.nextLine();	
		System.out.println(tamisim);
		
		System.out.println("Yasinizi giriniz");//Data type int ise; nextInt() methodunu kullaniniz
		int yasiniz = scan.nextInt();
		System.out.println(yasiniz);
		
		System.out.println("isminizin ilk harfini giriniz");//Kullanicidan char almak icin scan.next().charAt(0); kullanilir
		char ilkharf = scan.next().charAt(0);	
		System.out.println(ilkharf);
		
		System.out.println("Cocuk sayinizi giriniz");
		byte cocuksayisi = scan.nextByte();	
		System.out.println(cocuksayisi);
		
		scan.close();	
		
		/*
		Scanner scan2 =new Scanner(System.in);
		System.out.println("Tam Adini Gir");
		String Adi=scan2.nextLine();
		System.out.println(Adi);
		*/
	}

}
