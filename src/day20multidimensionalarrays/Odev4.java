package day20multidimensionalarrays;

import java.util.Arrays;

public class Odev4 {

	public static void main(String[] args) {
		// 20 ders 4. slayt sorusu 
		// multi dimensional arrayi iç elemanlarının toplamını ayrı bir array yapma
				
				int arr1[][]= {{1,2,3},{4,5},{6,7}};
				int arr2[]=new int[arr1.length];
				int sum=0;
			    for(int i=0;i<arr1.length;i++) {
			    	for(int j=0;j<arr1[i].length;j++) {	
			    	sum=sum+arr1[i]	[j];
			    	}
			    	
			    arr2[i]=sum;
			    sum=0;// toplamı yazdırdıktan sonra sıfırladık üstten tekrar toplayıp gelecek
			   
			    }
			    
			    System.out.println(Arrays.toString(arr2));
	

	}

}
