package w03_02_ExceptionHandling;

public class D11UserDefinedExceptionMain{

	public static void main(String args[]) throws D11UserDefinedException {
	
		int a = 100;
		
		System.out.println(a);
		
		throw new D11UserDefinedException("my custom exception");
	}
}