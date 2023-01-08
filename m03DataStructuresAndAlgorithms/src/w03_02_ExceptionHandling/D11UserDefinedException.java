package w03_02_ExceptionHandling;


public class D11UserDefinedException extends RuntimeException {

	// default constructor

	D11UserDefinedException() {}

	// parametrized constructor 
	D11UserDefinedException(String str) { 
		super(str); 
	}
}