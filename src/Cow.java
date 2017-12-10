
/**
 * Author Daniel M.Idrees enggdaniyal@hotmail.com
 */

public class Cow extends Mammal {


	public Cow() {
		
		System.out.println("Constructor of Cow Class is called");
	}
	
	//same method exists in the parent class Mammal. This is called method overriding
	public void eat() {
		super.parentEat();
		super.eat();
		System.out.println("Eat Function of Cow Class");	
	}
	
	public void someOtherMethodCow() {
		
	}
	
	public static void someStaticMethod(){
		System.out.println("Static number from Animal is " + Animal.num);
	}
	
	public static void main(String[] args) {
	//	Cow cow = new Cow(); //it will invoke the constructor of grand parent, parent and the same class
	//	cow.eat(); //check what it prints
		
		
	//	Animal animal = new Cow() ; //object of grand parent class but the reference of grand child class
	//	animal.someOtherAnimal(); //only methods in Animal class can be called.
	//	animal.eat();
		Animal.num = 10;
		Cow.someStaticMethod();
		
//		Cow cow = new Animal(); // not allowed
		
	//	Mammal mammal = new Cow();   //object of parent class but the reference of child class
									 
	//	mammal.eat(); //methods present in Animal and Mammal Class can be called.
		
		//Mammal obj = new Animal() or = new Mammal(); not allowed. Child object can not refer to parent class.
	}

}
