package m02FOpOOPs_II_11_25_22;


interface Animal121{

// interface method

public void makeSound(); 
public void sleep();
}

class Dog121 implements Animal121{

	public void makeSound(){
	
		System.out.println("Dog Barks");
	}
	
	
	public void sleep(){
	
		System.out.println("Sleeps as Zzzz");
}
}


class D12InterfaceExample{

	public static void main(String[] args){
	
	Dog121 obj = new Dog121();
	
	obj.makeSound();
	
	obj.sleep();

}
}


//Output: Dog Barks
//Sleeps as 'Zzzz'