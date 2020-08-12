package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement01 {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir sayi alin bu sayi 3'e bolunuyorsa ekrana
		 "3'un kati" yazdirin.
		 3'e bolunmuyorsa ekrana "3'e bolunmuyor" yazdirin
		*/

		
	Scanner scan = new Scanner(System.in);
	System.out.println("Bir tamsayi giriniz");
	int num = scan.nextInt();
	
	if(num%3==0) {
		System.out.println("3'un kati");
	}
		
	if(num%3!=0) {
		
		System.out.println("3'e bolunmuyor");
	}

// 2, yol
	
	if(num%3==0) {
		System.out.println("3e bolunur");
	}else {
		System.out.println(" bolunmez");
	}
	scan.close();
}
}
