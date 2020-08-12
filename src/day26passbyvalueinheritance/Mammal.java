package day26passbyvalueinheritance;

public class Mammal extends Animal { //eat,drink,feed metodlarini kullanabilir

	public static void main(String[] args) {
		
		Mammal om = new Mammal();
		om.drink();
		om.eat();
		om.feed();
		
	}	
	public void feed() {
			System.out.println("Yavrularini beslerler");
	}

}
