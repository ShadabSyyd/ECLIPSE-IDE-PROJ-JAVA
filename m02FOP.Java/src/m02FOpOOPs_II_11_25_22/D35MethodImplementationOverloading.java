package m02FOpOOPs_II_11_25_22;

public class D35MethodImplementationOverloading {
	void multiply(int a, int b)
	{
		System.out.println("Result is "+(a*b)) ;
	}
	void multiply (int a, int b, int c) {
		System.out.println("Result is "+(a*b*c));
	}

	public static void main(String[] args){
		D35MethodImplementationOverloading obj = new D35MethodImplementationOverloading ();
		obj.multiply (18,10); 
		obj.multiply (18,10,2);
	}
}