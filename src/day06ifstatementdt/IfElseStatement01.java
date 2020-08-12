package day06ifstatementdt;

public class IfElseStatement01 {

	public static void main(String[] args) {
		
		int num = 5;
		
		//if - else statement'da ya if bolumu veya else bolumu calisir asla
		//ikisi birden calismaz.
		
		//Condition true ise "if" bolumu calisir, condition false ise "else" bolumu calisir
		
		//1.yol (bu daha iyi, 1 condition var. Az is hizli calisma demek.
		if(num<0) {
			System.out.println("Negatif");
		}else {
			System.out.println("Negatif degil");
		}
		//2.yol (2 condition var )
		if(num<0) {
			System.out.println("Negatif");
		}
		if(num>=0) {
			System.out.println("Negatif degil");
		}

	}

}
