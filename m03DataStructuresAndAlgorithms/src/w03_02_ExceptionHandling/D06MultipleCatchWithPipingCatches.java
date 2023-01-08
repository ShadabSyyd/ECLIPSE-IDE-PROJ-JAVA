package w03_02_ExceptionHandling;

public class D06MultipleCatchWithPipingCatches {


	public static void main(String[] args) { 
		try {
		
			int arr[]= new int[10];
			arr[9]=20/0;      //ArithmeticException
//			arr[10]= 20 / 0;  //ArithmeticException +ArrayOutOfBoundException
//			arr[10]= 20;     //ArrayOutOfBoundException
//			String a=null;
//			a.charAt(0);        //NullPointerException
			
			System.out.println("try block ends here");
		}catch (ArithmeticException|ArrayIndexOutOfBoundsException|NullPointerException ae) {
			
			//System.out.println("divide by zero not possible"+ ae.getMessage());
			System.out.println("Piping Catch Block: "+ ae);//TO get default message
		}
		
		catch (Exception e) {
			System.out.println("any other generic exception: "+ e);			
			//We cannot Pipe Super Class with Sub Class ArithmeticException|ArrayIndexOutOfBoundsException|NullPointerException 
		} 
			System.out.println("I am out of try-catch block");
	}
}