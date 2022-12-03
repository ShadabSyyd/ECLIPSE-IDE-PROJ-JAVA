package m01FOP.Java;

public class D10_02StaticDemoObjectCreation {
		// int count=0; 			//When its int then it will get memory each time when new object is created
									//Output will be 1 1 1 no Increase i count
									//So We will use static int		
		static int count =0;		//With static memory is allocated once only
		D10_02StaticDemoObjectCreation(){
			count++;
			System.out.println(count);
		}
		public static void main(String[] args) {
			D10_02StaticDemoObjectCreation c1=new D10_02StaticDemoObjectCreation();
			D10_02StaticDemoObjectCreation c2=new D10_02StaticDemoObjectCreation();
			D10_02StaticDemoObjectCreation c3=new D10_02StaticDemoObjectCreation();
			System.out.println(c1+" "+c2+" "+c3);

		}
}
