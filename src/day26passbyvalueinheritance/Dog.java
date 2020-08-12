package day26passbyvalueinheritance;

public class Dog extends Mammal { //eat,drink.fead,bark,smell methodlarini kullanir.

	public static void main(String[] args) {
		
		Dog od = new Dog();
		od.eat();
		od.drink();
		od.feed();
		od.bark();
		od.smell();
		
	}

	public void bark() {
	System.out.println("Havlarlar");
}

	public void smell() {
	System.out.println("Iyi koku alirlar");
}

	
}
