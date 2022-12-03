package m01FOPWeek1LiveClass;
class inter{
	float a=L11AccessingClassTarget.salary;
}
public class L11AccessingClassMain {
	public static void main(String[] args) {
		inter obj1=new inter();
		
		float b=obj1.a; 
//		 float a=L11AccessingClassTarget.salary;
		System.out.println(b);
		System.out.println(obj1.a);
		
		
		int amz=L11AccessingClassTarget.methodExample();
		System.out.println(amz);
		
		
		//Simulation of System.out.println to understand calling methods from another file (Below)
		
		
		//We Created a method in L11AccessingClassSimulatingPrintlnFormat.java and named the method "println(){}"
		
		//then we created an object named "calledObject" in L11AccessingClassTarget.java 
		                                                //which calls from L11AccessingClassSimulatingPrintlnFormat.java
		
		//Called the "calledObject" from L11AccessingClassTarget and accessed "println{}" method from L11AccessingClassSimulatingPrintlnFormat
		
		L11AccessingClassTarget.calledObject.println();
	}
}
