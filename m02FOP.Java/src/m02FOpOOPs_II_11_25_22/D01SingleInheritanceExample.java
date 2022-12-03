package m02FOpOOPs_II_11_25_22;

class A{

	int a, b;

	public void display(){

	System.out.println(" using display method "+ a+ "," +b);

	}
}

class B extends A{
	int c;
	public void show(){
	System.out.println(" using show method "+a+","+b+","+c);
	}
}

public class D01SingleInheritanceExample{
	public static void main(String[] args){

	B obj = new B();

	obj.a = 10;

	obj.b = 20;

	obj.c = 30;

	obj.display();

	obj.show();
	}
}

	/*
	Output:
	using display method 10, 20 
	using show method 10, 20, 30

	*/
