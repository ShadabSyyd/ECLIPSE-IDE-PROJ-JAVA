package w03_02_ExceptionHandling;

import java.util.ArrayList;

public class D03TryCatchImplementationClass {

	public void writeList() { 
		try {
			ArrayList<Integer> list = new ArrayList(10);
			
			//List<Integer> list = new ArrayList(10);
			
			list.add(10);
			list.add(1,20);
			
			
			System.out.println("Entering " + "try statement"); 
			
			Integer a= list.get(2); //OutOfBound
//			Integer a= list.get(1); //In Bound
			
			//Integer is int of ArrayList
			System.out.println("accessing the first element: " + a);
			
		} catch (IndexOutOfBoundsException e) {
			System.err.println("Caught IndexOutOfBoundsException: "+e.getMessage());
		} finally {
			System.out.println("this will always be executed");
		}
	}
}
