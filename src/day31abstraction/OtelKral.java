package day31abstraction;

public class OtelKral extends AbstractProje{

	public static void main(String[] args) {
	 OtelKral krl=new OtelKral();
	 krl.cay();
	 krl.kahvalti();
	 krl.wifi();
	 	 
		 
	}

	@Override
	public void kahvalti() {
		System.out.println("Acik Büfe Kahvalti hazir,Insan gibi ye...");
		
	}

	@Override
	public void cay() {
		System.out.println("Cay ic iyidir");
	}
	

}
