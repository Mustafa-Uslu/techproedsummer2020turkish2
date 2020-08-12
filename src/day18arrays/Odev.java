package day18arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Odev {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("kac elemanli bir array olsun?");
		int arraySayisi=scan.nextInt();
		
		int arr[]=new int[arraySayisi];
		for(int i=0;i<arr.length;i++) {
			System.out.print(i+" . dizi elemanini giriniz: ");
			arr[i]=scan.nextInt();
			
		}
		// x bos konteyneri ile ilk eleman son eleman degisimi
		System.out.println(Arrays.toString(arr));
		int x=arr[0];
		arr[0]=arr.length;
		arr[arr.length-1]=x;
		
		System.out.println(Arrays.toString(arr));

	}

}
