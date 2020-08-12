package day28overriding;

public class Cat extends Animal {

	public static void main(String[] args) {
		 Cat cat =new Cat();
		cat.sound();
		cat.numOfFoot();
	}
	public void sound() {
		System.out.println("Miyavlar");

}
	@Override
	public void numOfFoot() {
		System.out.println("4 Ayaklidir");
		
	}
	@Override
	public Cat myMethod() {
        return null;
	}
	
}