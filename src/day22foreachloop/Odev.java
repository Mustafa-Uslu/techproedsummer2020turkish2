package day22foreachloop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Odev {

	public static void main(String[] args) {
		// İki String List oluşturunuz ve bu List’lerdeki
				// ortak elemanları bulunuz. Sonucu ekrana yazdırınız. 
				// Ortak eleman yoksa ekrana “Ortak eleman yok” yazdırınız 
	
				
				List<String> l1 = new ArrayList<>();
				l1.add("A");
				l1.add("B");
				l1.add("C");
				l1.add("D");
				
				List<String> l2 = new ArrayList<>();
				l2.add("X");
				l2.add("B");
				l2.add("Y");
				l2.add("D");
				
				int count = 0;
				
				for (String w: l1) {
					for (String x : l2) {
						if (w.equals(x)) {
							System.out.print(w + " ");
							count++;
						}
					}
				}
				if (count == 0) {
					System.out.println("Ayni eleman yok");
				}
				System.out.println(" ");
				
				System.out.println(count);
	
	// Bir String oluşturunuz, bu String’deki character’leri yukarıdan aşağıya
			//for-each loop kullanarak yazdırınız
			
			String str = "Hello World";
			String harf []= str.split("");
			
			System.out.println(Arrays.toString(harf));
			
			for (String w : harf) {
				System.out.println(w);
			}

	}
}
