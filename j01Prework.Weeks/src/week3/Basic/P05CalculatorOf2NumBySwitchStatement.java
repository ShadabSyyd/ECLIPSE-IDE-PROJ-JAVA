package week3.Basic;
import java.util.Scanner;

public class P05CalculatorOf2NumBySwitchStatement {
		public static void main(String[] args) {
			Scanner im= new Scanner(System.in);
			System.out.println("Enter First Number:");
			int a=im.nextInt();
			System.out.println("Enter Second Number:");
			int b=im.nextInt();
			System.out.println("Enter Operation\n1 → addition\r\n2 → subtraction\n3 → multiplication\r\n4 → division:");
			int swit=im.nextInt();
			im.close();
			switch(swit){
			case 1:{
				System.out.println("Addition of "+a+" and "+b+" is "+(a+b));
			}break;
			case 2:{
				System.out.println("Sbstraction of "+a+" and "+b+" is "+(a-b));
			}break;
			case 3:{
				System.out.println("Multiplication of "+a+" and "+b+" is "+(a*b));
			}break;
			case 4:{
				if(b!=0) {
					System.out.println("Division of "+a+" and "+b+" is "+((float)a/(float)b));
				}
				else 
					System.out.println("Cannot be Divided");
			}break;
			default:
				System.out.println("Try Again\nEnter a Number Between 1 to 4");
			}
		}
	}

	/* 
	Write a program in java to implement a basic calculator using switch case statement
	Accept two no as user input and print the result based on operation.
	Display list of options 
	        1 → addition
	        2 → subtraction
	        3 → multiplication
	        4 → division
	Perform division only if the second number is not equal to 0. If the second number is 0 print “Cannot be divided” on console.
	 */