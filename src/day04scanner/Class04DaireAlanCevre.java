package day04scanner;

import java.util.Scanner;

final class Class04DaireAlanCevre {

	public static void main(String[] args) {
		
		/* 	Yariçapi kullanicidan alinan bir dairenin çevresini ve alanini hesaplayan
		bir program yaziniz. (float kullaniniz)
		Not 1: pi sayisi: 3.14159
		Not 2: Alan: 3.14159 x radius x radius
		Not 3: Cevre: 2 x 3.14159 x radius
	*/
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Lutfen hesaplanacak olan dairenin yaricapini giriniz.");
	float yaricap=scan.nextFloat();
	
	float pi=3.14159f;
	
	float alan=(pi*yaricap*yaricap);
	float cevre=(2*pi*yaricap);
	
	System.out.println("Alan Ölcusu = "+alan);
	System.out.println("Cevre Ölcusu = "+cevre);
	
	scan.close();
	
	}

}
