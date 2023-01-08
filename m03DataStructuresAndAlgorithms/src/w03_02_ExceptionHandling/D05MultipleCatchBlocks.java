package w03_02_ExceptionHandling;

public class D05MultipleCatchBlocks {


	public static void main(String[] args) { 
		try {
		
			int arr[]= new int[10];
//			arr[9]=20/0;      //ArithmeticException
			arr[10]= 20 / 0;  //ArithmeticException +ArrayOutOfBoundException
//			arr[10]= 20;     //ArrayOutOfBoundException
//			String a=null;
//			a.charAt(0);        //NullPointerException
			
			System.out.println("try block ends here");
		}catch (ArithmeticException ae) {
			//System.out.println("divide by zero not possible"+ ae.getMessage());
			System.out.println("divide by zero not possible"+ ae);//TO get default message
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("cannot access an array element outside of array length");
		} 
		catch (Exception e) {
//			System.out.println("any other generic exception: "+ e.getMessage());
			System.out.println("any other generic exception: "+ e);
			
		} 
			System.out.println("I am out of try-catch block");
	}
}