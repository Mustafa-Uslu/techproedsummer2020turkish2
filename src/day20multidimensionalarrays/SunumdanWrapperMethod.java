package day20multidimensionalarrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SunumdanWrapperMethod {

	public static void main(String[] args) {
		// Array icinde method cagirma
				double[] array2 = {2.5 ,3.6, 5.4};
				walk(2, array2); //
				wandel(4, array2);
				
				Double array3[]= {1.2, 2.3, 3.4, 4.5};
				getal(3, array3);
				cijfer(4, array3);
	
				
			    List<String> strs = new ArrayList<String>();
			    strs.add("Array");
			    strs.add("List");
			    strs.add("ForEach");
	
			    methodx(strs.toArray(new String[strs.size()]));
			    methody(strs);
			}
			
	
			
			public static void walk(int start, double... getallen) {
				double sum=0;
				for(double w: getallen) {
					sum+=w;
				}
				System.out.println("Totaal =" + sum*start);
				System.out.println(getallen.length);
			}
			
			public static void wandel(int start, double array[]) {
				System.out.println(10*start);
				System.out.println(Arrays.toString(array));
			}
			
			
			
			public static void getal(int start, Double array[]) {
				System.out.println(5*start);
				System.out.println(Arrays.toString(array));
			}
	
			
			public static void cijfer(int start, Double...array) {  // VarArgs
				System.out.println("\n"+5*start);
				System.out.println(Arrays.toString(array));
			}
			
	
			
			public static void methodx(String... strs) {
				System.out.println("");
				for (String s : strs)
					System.out.println(s);
			}
			public static void methody(List<String> strs) {
				for (String s : strs)
					System.out.println(s);

	}

}
