package w03_02_ExceptionHandling;

public class D07NestedTryImplementation { 
	public static void main(String args[]) {
	
		try { // block 1 
			try{ // block 2 
				try{ //block 3 
					int arr[] = {1, 2, 3, 4};
					System.out.println(arr[10]);
				} catch (ArrayIndexOutOfBoundsException e) { 
					System.out.println("ArrayIndexOutOfBounds Exception in block 3"); 
					throw e;
				} 
			}catch (ArrayIndexOutOfBoundsException e2) { 
				System.out.println("ArrayIndexOutOfBounds Exception in block 2");
				throw e2;
			}
		}catch (ArrayIndexOutOfBoundsException e4){
			System.out.println("ArrayIndexOutOfBoundsException in block 1");
		}
	}
}
