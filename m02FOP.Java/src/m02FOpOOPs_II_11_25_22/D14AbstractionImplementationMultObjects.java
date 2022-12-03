package m02FOpOOPs_II_11_25_22;


abstract class Shapes{
	abstract void run();
}

class Rectangular extends Shapes{
	void run() {
		System.out.println("Shape is Rectangular");
	}
}

class Circular extends Shapes{
	void run() {
		System.out.println("Shape is Circular");
	}
}

public class D14AbstractionImplementationMultObjects {
	public static void main(String[] args) {
		Shapes obj1= new Rectangular();
		obj1.run();
		
		Shapes obj2= new Circular();
		obj2.run();
	}
}
