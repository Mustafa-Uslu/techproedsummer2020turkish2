package day06ifstatementdt;

import java.util.Scanner;

public class Odev {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen renk Giriniz");
		String renk=scan.nextLine();
		
		if(renk.equals("Kirmizi")) {
			System.out.println("Kirmizi'da gecersen kaza yaparsin");
    }
	    if(renk.equals("Sari")) {
		 System.out.println("Sari'da Dikkatli ol");
		 
   }
        if(renk.equals("Yesil")) {
		System.out.println("Yesil'de Gec");
   }
        scan.close();	
		
	}

}
