package day07ifelseifstatementdt;

public class OdevIf02 {

		public static void main(String[] args) {
			/* Given 3 int values, a b c, return their sum. However, if one of the values 
			 * is the same as another of the values, it does not count towards the sum.
			 * 
			 * examples
			 * loneSum(1, 2, 3) ==> 6
			 * loneSum(3, 2, 3) ==> 2
			 * loneSum(3, 3, 3) ==> 0
	     	 * 
	     	 * Turkcesi
	     	 * (3 int değeri verildiğinde, a b c nin, toplamlarını döndürür. Ancak, değerlerden 
	     	 * biri diger bir deger ile aynıysa, toplam hesabina katilmaz.)
			 */
			
			System.out.println(loneSum(1,2,3));//6
			System.out.println(loneSum(3,2,3));//2
			System.out.println(loneSum(3,3,3));//0​
		}
	
		
		public static int loneSum(int a, int b , int c) {
			
			if(a!=b && a!=c && b!=c) {
				return a+b+c;
			}else if(a==b && a!= c) {
				return c;
			}else if (a==c && a!=b) {
				return b;
			}else if (b==c && b!=a) {
				return a;
			}else {
				return 0;
			}
			

	}

}
