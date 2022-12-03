package m01FOPWeek1LiveClass;

public class L07ConcatinatingStrings {
	public static void main(String[] args) {
		
		String[] methodOne=new String[2];                      //Method 1
		
		methodOne[0]="Some";
		methodOne[1]="Values";
		
		String arrayDem=methodOne[0]+" "+methodOne[1];
		String arrayDem2=methodOne[0]+" "+"Values"+" "+"Assigned";
		
		
		//Output
		for(int a=0;a<methodOne.length;a++)
			System.out.println(methodOne[a]);
		System.out.println(arrayDem);
		System.out.println(arrayDem2);

	}
}
