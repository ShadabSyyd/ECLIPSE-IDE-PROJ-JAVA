package m02FOpOOPs_II_11_25_22;

abstract class Animal{

	public abstract void makeSound();

	}

class Cat extends Animal{

	public void makeSound(){ System.out.println("Meow");

	}
}

class D08AbstractionExample{
	public static void main(String[] args){ 
		Cat obj = new Cat(); // object of Cat class
		obj.makeSound();
	}
}

		//Output: Meow
