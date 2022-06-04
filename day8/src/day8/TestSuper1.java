package day8;

class Animal{
	final String color ="white";
	
	Animal(){
		System.out.println("This constractor has just created");
	}
	
	public void eat() {
		System.out.println("Animal eating.....");
	}
	
	
}

class Dog extends Animal{
	String color = "black";
	
	Dog(){
		super();
		System.out.println("Dog constractor was created with special work");
	}
	
	public void eat() {
		System.out.println("Dog eating ....");
	}
	
	public void bark() {
		System.out.println("wolf .....");
	}
	void DisplayMethod() {
		System.out.println(color);//prints color of Dog class
		System.out.println(super.color);//prints color of Animal class ( super key word help us to access instant variables of parent class)
		
		eat();
		super.eat();
		}
}



public class TestSuper1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d = new Dog();
		d.DisplayMethod();

	}

}
