package m02FOpOOPs_II_11_25_22;
//
//public class D20PolymorphismImplementation1 {
//
//}
public class D20PolymorphismImplementation1{

	// Overloaded sum(). This sum takes two int p 
	public int sum(int x, int y){
	return (x + y);
	}

	// Overloaded sum(). This sum takes three int 
	public int sum(int x, int y, int z){
	return (x + y + z);
	}

	// Overloaded sum(). This sum takes two double


	public double sum(double x, double y){
	return (x + y);
	}

	// Driver/code 
	public static void main(String args[]){

	D20PolymorphismImplementation1 s = new D20PolymorphismImplementation1();

	System.out.println(s.sum(10, 20));

	System.out.println(s.sum(10, 20, 30));

	System.out.println(s.sum(10.5, 20.5));
	}
	}