package w03_02_ExceptionHandling;
////doubt in program

public class D09throwForCustomExceptions {

	public static void main(String args[]) {	
		try {
		int a = 100/0;
		System.out.println(a);
		
		}catch(ArithmeticException e){
//		System.err.println("Some Error");//Basic Message
//		throw new ArithmeticExceptionException("My custom exception message");
		
//		throw new ArithmeticExceptionException() is 
//			Very Dangerous because if we use this instead of throw that means this exceptions will be impossible
//				to track if the big code has thousands of classes for industrial approach so we will avoid it
			
		throw e;   //best way
		
//		throw new MyCustomException();//giving some kind of error because its not customize so not compile
		}
	}
}