package m01FOP.Java;

public class D10_01StaticKeywordDemonstration{
	static int count=10;
	static int i=5;
	
	public static void main(String[] args) {
		while(count-->0) {
			checkStatic();
		}	
	}
	public static void checkStatic(){
//		int i=5;                  
					/*If we use this int i and comment static i then value will change because its allocated
					only once*/
		i++;
		System.out.print(" "+i);
		System.out.println(" "+count);		
		
	}

}
