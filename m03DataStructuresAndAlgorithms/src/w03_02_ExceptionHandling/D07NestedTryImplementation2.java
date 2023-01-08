package w03_02_ExceptionHandling;

public class D07NestedTryImplementation2 { 
	public static void main(String args[]) {
	
		try { // block 1 
			try{ // block 2 
				try{ //block 3 
					int arr[] = {1, 2, 3, 4};
					System.out.println(arr[10]);
				} catch (NullPointerException e) { 
					System.out.println("NullPointerException in block 3"); 
					throw e;
				} 
			}catch (StringIndexOutOfBoundsException e2) { 
				System.out.println("StringIndexOutOfBounds Exception in block 2");
				throw e2;
			}
		}catch (ArrayIndexOutOfBoundsException e4){
//		}catch (ClassCastException e4){//If we use this exep then AIOB will be commented and no exception will be catched so program
												//will throw an exception and will be terminated

			System.out.println("ArrayIndexOutOfBoundsException in block 1");
//			System.out.println("ClassCastException in block 1");
			
		}
		System.out.println("Program Ends");
	}
}
