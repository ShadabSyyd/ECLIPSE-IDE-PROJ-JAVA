package week1.Basic;
import java.util.Scanner;
public class BasicInpWithClose {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.print("Enter the Val of a:");
			int a=in.nextInt();
			System.out.print("Enter the Val of b:");
			long b=in.nextLong();
			
			int c=a+(int)b;              //Narrowing the Data
			
			System.out.println("Value of A+B is "+ (a+b) + " in long");
			System.out.printf("Quick fix the above: A+B is %d\n",a+b);
			System.out.println("Value of A+B is "+ c  +" in long");
			System.out.println(a+b);
		}
	}

}