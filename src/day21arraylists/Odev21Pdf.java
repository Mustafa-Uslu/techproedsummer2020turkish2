package day21arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Odev21Pdf {

	public static void main(String[] args) {
//		I.	  Elemanlari A,C E, ve F olan bir String ArrayList olusturup ekrana yazdirin
		
		
			List<String> harf=new ArrayList();
			
			harf.add("A");
			harf.add("C");
			harf.add("E");
			harf.add("F");
			System.out.println("I.Question   ==>  "+harf);
	System.out.println("===================================");	
	
	   /*II.soru   Indexsiz add() methodunu kullanarak "B" yi ekleyiniz
	               Index'li add() methodunu kullanarak L'yi 1 numarali index'e ekleyiniz
	                ArrayList'i ekrana yazdirin ,list soyle olmali  [ A,L,C,E,F,B ]. */
	
	       harf.add("B");
	       harf.add(1, "L");
			System.out.println("II.Question  ==>  "+harf);
			
	System.out.println("===================================");	
	
	    /* III.soru   set() methodu kullanarak ,E'yi D yapiniz.
	                   Array list ekran da   [  A,L,C, D ,F, B ]     */
	
	       harf.set(3, "D");
	        System.out.println("III.Question ==>  "+harf);
	        
	System.out.println("===================================");	
	
	    /*IV. soru   remove()methodu kullanarak ,F'yi siliniz.
	      ArrayList'i ekrana yazdiriniz [ A,L,C,D,B ]        */
	    
	      harf.remove("F");
	      System.out.println("IV.Question  ==>  "+harf);
	
	System.out.println("===================================");	
	
	     /*V.soru    sort() methodu kullanarak elemanlari alfabetik siraya diziniz
	                 ArrayList'i ekrana yazdiriniz [ A,B,C,D,L ]	   */
	      
	     Collections.sort(harf);
	     System.out.println("V.Question   ==>  "+harf);
	     
	 System.out.println("===================================");	    
	     
	 
	     /*VI.soru    contains()methodu kullanarak L'ninlist'de var oldugunu ve
	      M;nin list'de var olup olmadigini dogrulayiniz   */
	 
	    
	     System.out.println("VI.Question   ==>  "+harf.contains("L"));  //True   
	     
	System.out.println("===================================");	

	// VII.soru  size() methodunu kullanarak List'in kac eleman oldugunu ekrana yazdiriniz
	     
	      System.out.println("VII.Question   ==>  "+harf.size());//5
	
	System.out.println("===================================");
	
	
	
	      //VIII.soru clear () methodunu kullanarak list'teki tum elemanlari siliniz
	
	      harf.clear();
	      System.out.println("VIII.Question   ==>  "+harf);
	      
	System.out.println("===================================");
	
	//IX. soru  isEmpty() methodunu kullanarak list'deki tum elemanlari sildigini dogrulayin
	            
	
	
	      System.out.println("IV.Question    ==>  "+harf.isEmpty());//true
	System.out.println("===================================");
	      System.out.println(" THE END");
	

	}

}
