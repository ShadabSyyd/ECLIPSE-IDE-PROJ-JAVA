package m02FOpOOPs_II_11_25_22;


class Animal33{
	void eat(){
		System.out.println("Animals Eat");
	}
}

class Herbivores33 extends Animal33{
	void eat(){
	System.out.println("Herbivores Eat Plants"); 
	}
}

class Omnivores33 extends Animal33{
	void eat(){ System.out.println("Omnivores Eat Plants and meat");
	}
}


class D33MethodOverRidingExample{
	public static void main(String args[]) {
	
		Animal33 A = new Animal33();
		Animal33 h = new Herbivores33(); //upcasting
		Animal33 o = new Omnivores33(); //upcasting
		
		A.eat();
		h.eat();
		o.eat();
	}
}