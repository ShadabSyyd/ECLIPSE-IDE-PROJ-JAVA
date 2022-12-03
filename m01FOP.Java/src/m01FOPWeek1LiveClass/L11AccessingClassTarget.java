package m01FOPWeek1LiveClass;

public class L11AccessingClassTarget {
	
	
	 static float salary=100;  //If we want to call this value from here to another class then we need to declare this as static
	 
							   //We also need to make this static as public or default or protected but not private
	 
	 
	 
	 public static int methodExample(){    //Static needed & either public, default or protected is needed to access for prob L11
		 System.out.println("Method is used");
		 return 22;		 
	 }
	 
//Instance of L11AccessingClassSimulatingPrintlnFormat
	 static L11AccessingClassSimulatingPrintlnFormat calledObject=new L11AccessingClassSimulatingPrintlnFormat();
}
