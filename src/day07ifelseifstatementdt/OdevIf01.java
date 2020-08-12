package day07ifelseifstatementdt;

public class OdevIf01 {

	public static void main(String[] args) {
		//if else statement da ya if bolumu yada else bolumu calısır asla ikisi birden calısmaz
				// condition true ise if false ise else bolumu calısır
	
		   /*	Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive,
		    *  are forbidden, so in that case just return 20.
		    *  examples;
		    *  sortaSum(3, 4) => 7
		    *  sortaSum(9, 4) => 20
		    *  sortaSum(10, 11) => 21
		    *  
		    *  === Turkcesi ===
		    *  (2 integer a ve b, verildiğinde ikisinin toplamlarıni geri döner. Bununla birlikte, a ve b
		    *  nin toplamlari 10 ila 19 arasinda olursa bu sonuc yasaklanmıştır, bu durumda sadece 20 geri dönün.)
		    */
				
				System.out.println(sortaSum(3,4));//7
				System.out.println(sortaSum(9,4));//20
				System.out.println(sortaSum(10,11));//21
		
			}
			
			public static int sortaSum( int a , int b) {
				
				if(a+b <10 || a+b > 19) {
			      return a+b;
			      
				}else {
					return 20;
				}

	}

}
