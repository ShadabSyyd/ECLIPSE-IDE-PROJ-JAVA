package m02FOpOOPs_II_11_25_22;

abstract class Animal21{

	// abstract method 
	public abstract void makeSound(); 
	public void sleep(){ // Regular method 
		System.out.println("Sleeps as 'Zzzz' ");

	}

}

class Cat21 extends Animal21{

	public void makeSound(){

	System.out.println("Cat Meows");
	}
}

class D10PartialAbstractionExample{

	public static void main(String[] args){ 
	Cat21 obj = new Cat21(); 
	obj.makeSound(); 
	obj.sleep();
	}
}

	//Output: Dog Barks 
	//Sleeps as 'zzz'