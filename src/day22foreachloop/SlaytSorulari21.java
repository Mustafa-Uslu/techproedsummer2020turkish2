package day22foreachloop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class SlaytSorulari21 {
	public static void main(String[] args) {
		/*Bir integer array oluşturunuz ve bu array’deki tum sayıların çarpımını
		 *  For-each loop kullanarak bulunuz. Sonucu ekrana yazdırınız*/
		int arr[]= {10,11,12,13};	
		int product=1;
		for(int w:arr) {
			product*=w;
		}System.out.println(product);
/*Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin toplamını
 *  For-each loop kullanarak bulunuz. Sonucu ekrana yazdırınız.*/
  List<Integer> il=new ArrayList<>();
il.add(2);
il.add(3);
il.add(4);
il.add(5);
System.out.println(il);
int sum=0;
for(int w:il) {
	sum+=w*w;
	
}System.out.println(sum);
System.out.println(">>>>>>>>>>>>>>>>>>>>>");
/*İki String array oluşturunuz ve bu array’lerdeki ortak elemanları For-each loop kullanarak bulunuz.
 *  Sonucu ekrana yazdırınız.  Ortak eleman yoksa ekrana “Ortak eleman yok” yazdırınız*/

String arr1[]= {"A","B","c","D","E"};
String arr2[]= {"F","B","L","M"};
List<String> sl=Arrays.asList(arr1);
List<String> sl1=Arrays.asList(arr2);
System.out.println(sl);
System.out.println(sl1);
System.out.println(">>>>>>>>>>>>>>>");
int count=0;
for(String w:sl) {
for(String w1:sl1) {
	if(w==w1) {
	System.out.println(w);
	count++;
	}
}
}if(count==0) {System.out.println("Ortak eleman yok");

System.out.println(">>>>>>>>>>>>>>>>");	
/*Bir String oluşturunuz, bu String’deki character’leri yukarıdan aşağıya 
 * for-each loop kullanarak yazdırınız.  İpucu: split()*/

String str="Olumlu dunya";
String arr3[]=str.split("");
System.out.println(Arrays.toString(arr3));
List<String> sl3=Arrays.asList(arr3);
System.out.println(sl3);
for(String w:sl3) {
	System.out.println(w);

}
//Bir Arraydaki en büyük sayıyı yazdirin

		int [] ar = {125, 132, 95, 116, 110};
		int max = ar[0];
		int max2 = ar[0];
		
		for (int w : ar) {
			if (w>max) {
				max = w;
			}
		}
			System.out.println(max);
		
		for (int i = 0; i<ar.length; i++) {
			if (ar[i]>max2) {
				max2 = ar[i];
			}
		}
				
		System.out.println(max2);
}
//Bir Arrayin icindeki butun sayıları toplayınız

		int arr11 [] = {12, 7, 5, -2, 10};
		int sum1 = 0;
		
		for (int i : arr11) {
			sum = sum + i;
		}
		
		System.out.println(sum1);

}
//  Arrayin icinde kaç tane 4 sayısı geciyor onu yazdırın
	
//		int ars [] = {1,2,3,4,5,6,7,8,9,11,4};
//		int counter1 =0;
//		
//		for (int w: ars) {
//			if (w==4) {
//				counter1++;			
//				}
//		}
//		
//		System.out.println(counter);

	}
