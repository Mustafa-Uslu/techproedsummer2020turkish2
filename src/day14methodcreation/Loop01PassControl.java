package day14methodcreation;

import java.util.Scanner;

public class Loop01PassControl {

	public static void main(String[] args) {
		/*
		 Kullanicidan passwordunu alip, password'un "AliCan" 
		 olup olmadigini kontrol eden, password dogru ise ekrana
		"Dogru", password yanlis ise ekrana "Yanlis" ve
 		"Passwordunuzu giriniz" yazdiran program asagidakilerden 
 		hangileri gibi olabilir?
		 */
		Scanner scan = new Scanner(System.in);

		String password = "";

		

		do {			

			System.out.println("Passwordunuzu giriniz");

			password = scan.nextLine();

			

			if(password.equals("Canim")) {

				System.out.println("Dogru");

			}else {

				System.out.println("Yanlis");

			}

			

		}while(!(password.equals("Canim")));
		
		
		//2. yol
		
		Scanner scan1 = new Scanner(System.in);

		String password1 = "";

		

		do {			

			System.out.println("Passwordunuzu giriniz");

			password1 = scan1.nextLine();

			

			if(password1.equals("AliCan")) {

				System.out.println("Dogru");

			}else {

				System.out.println("Yanlis");

			}

			

		}while(!(password1.equals("AliCan")));
		
		//3.yol 
		Scanner scan2 = new Scanner(System.in);

		System.out.println("Passwordunuzu giriniz");

		String password2 = scan2.nextLine();

		

		while(!(password2.equals("AliCan"))) {

			System.out.println("Yanlis");

			System.out.println("Passwordunuzu giriniz");

			password2 = scan2.nextLine();	

		}



		System.out.println("Dogru");
		
		
	}

}
