package week1.Basic;
import java.util.Scanner;
public class BasicInp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
			System.out.print("Enter the Val of a:");
			int a=in.nextInt();
			
			System.out.print("Enter the Val of b:");
			long b=in.nextLong();
			
			in.close();
			
			int c=a+(int)b;              //Narrowing the Data
			
			System.out.println("Value of A+B is "+ (a+b) + " in long");
			System.out.println("Value of A+B is "+ c  +" in long");
			
			System.out.printf("Quick fix the above: A+B is %d\n",a+b);
			
			
			System.out.print(a+b);
			System.out.print("No New Line ");
		
	}
}