package day23daytime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Odev1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Character> list = new ArrayList<>();
		System.out.print("Istediginiz kelimenin harflerini sirayla giriniz, "
				+ "\ncikmak icin sifir(0) a tusuna basiniz ;");
		do {
			list.add(scan.next().charAt(0));
		}while(list.get(list.size()-1)!='0');
		list.remove(list.size()-1);
		System.out.println(list);
		
		zinmaken(list.toArray(new Character[list.size()]));
		scan.close();	
	}
	public static void zinmaken(Character... cs) {
		String zin = "";
		for(char w: cs) {
			zin +=w;
		}System.out.println(zin);;

		
		//homework: kelimenın harflerını alıp onları gırıs sırasına 
		//gore bırlestırerek ekrana basn bır program yazınız. 
		//vararags kullanmalısınız
		String ("E","s","k","i","s","e","h","i","r"," ","G","ü","z","e","l"," ","S","e","h","i","r");

	}
	public static void String(String...s) {
		for(String w : s) {
			System.out.print(w);
		}

	}

}
