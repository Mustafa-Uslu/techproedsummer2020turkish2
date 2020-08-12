package day09nestedternary;

import java.util.Scanner;

public class SwitchSoru {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir Gun giriniz");
		String G = scan.next();
		 
		switch(G) {		
		
	    case "pazar":
	    case "PAZAR":
	    	System.out.println("Ilk GUN");
	    	break;
	    case "pazartesi":
	    case "PAZARTESI":
	    	System.out.println("Ikinci GUN");
	    	break;
	    case "sali":
	    case "SALI":
	    	System.out.println("ucuncu GUN");
	    	break;
	    case "carsamba":
	    case "CARSAMBA":
	    	System.out.println("Dorduncu GUN");
	    	break;
	    case "persembe":
	    case "PERSEMBE":
	    	System.out.println("Besinci GUN");
	    	break;
	    case "cuma":
	    case "CUMA":
	    	System.out.println("Altinci GUN");
	    	break;
	    case "cumartesi":
	    case "CUMARTESI":
	    	System.out.println("Yedinci GUN");
	    	break;
	    default:
	    	System.out.println("Tanimlanamadi");
		
		}
		scan.close();
	}

}
