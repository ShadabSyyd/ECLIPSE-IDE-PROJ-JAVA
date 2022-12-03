package m01FOPWeek1LiveClass;

public class L06StringArray {
	public static void main(String[] args) {
		
		String[] methodOne=new String[2];                      //Method 1
		
		methodOne[0]="Some";
		methodOne[1]="Values";
		
		
		String[] methodTwo=new String[5];                     //Method 2 
		for(int a=0;a<methodTwo.length;a++) {
			methodTwo[a]="000000";                            //We can use random input too
		}
		
		for(int a=0;a<methodOne.length;a++)
			System.out.println(methodOne[a]);
		
		for(int a=0;a<methodTwo.length;a++)
			System.out.println(methodTwo[a]);
		
	}
}
