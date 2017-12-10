
/**
 * Author Daniel M.Idrees enggdaniyal@hotmail.com
 */

public class Mammal extends Animal {

	
	public Mammal() {
		System.out.println("Constructor of Mammal Class is called");
	}
	
	//A method which will be overridden in the child class
	protected void eat() {
		System.out.println("Eat Function of Mammal Class");
	}
	
	public int someOtherMethodMammal() {
		System.out.println("Function which will be overloaded");
		return 0;
	}
	//same method name but different signature. This is called method overloading
	public void someOtherMethodMammal(int temp) {
		System.out.println("Overloaded function with " + temp );
	}
	
	public void parentEat(){
		super.eat();
	}
	
	public static void main(String[] args) {
		
	/*	Animal animal = new Mammal(); //Will invoke the constructor of base class and the same class.
		Mammal mammal = new Mammal(); //Will invoke the constructor of base class and the same class.
		
		mammal.someOtherAnimal(); //inherited the function of parent class
		
		//method overloading example
		mammal.someOtherMethodMammal();
		mammal.someOtherMethodMammal(0);*/
		
		Animal animal = new Animal();
		Mammal mammal = new Mammal();
		
	//	animal.eat();
	//	mammal.eat();
		
		Animal animal2 = new Mammal();
		//Mammal mammal2 = new Animal (); // not allowed
	//	animal2.eat();
		// Now Will this eat() will be called from Parent class
		// or Child Class? 
		
		//Overloading Example
		mammal.someOtherMethodMammal();
		mammal.someOtherMethodMammal(4);
		
		
		
		
		
	}

}
