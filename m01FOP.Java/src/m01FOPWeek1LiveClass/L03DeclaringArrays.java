package m01FOPWeek1LiveClass;

public class L03DeclaringArrays {
	public static void main(String[] args) {
		
		
		int[] methodOne= new int[5];				  //Method 1 Initialization and Declaring Size
		String[] methodTwo;                           //Method 2 Initialization Only
		
		for(int a=0;a<methodOne.length;a++) {
			methodOne[a]=10000001;					  //Method 1 Initializing the Values	
		}
		
		
		methodTwo=new String[5];                     //Method 2 Declaration
		for(int a=0;a<methodOne.length;a++) {
			methodTwo[a]="000000";                   //Method 2 Initializing the Values
		}
		
		
		for(int a=0;a<methodOne.length;a++) {        //Output
			System.out.println(methodOne[a]);
			System.out.println(methodTwo[a]);
		}
				
	}
}
