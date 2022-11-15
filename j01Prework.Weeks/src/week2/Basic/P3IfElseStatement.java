package week2.Basic;
import java.util.Scanner;
public class P3IfElseStatement {
	public static void main(String[] args) {
		Scanner point=new Scanner(System.in);
		
		
		System.out.println("Enter the Number");
		int Num1=point.nextInt();
		point.close();
		if(Num1%2==0 && Num1!=0)
			System.out.println("Number is Even");
		else
			System.out.println("Number is Not Even");
	}
}




/*
Description ~
Write a program in java to check whether the given number is an even number of not using an if else statement. 
If the number is even, it should print “Number is even’, otherwise it should print “Number is odd".

Test Cases.
Test Case 1
Input
7
Output
Number is even
Test Case 2
Input
6
Output,
Number is odd

Hint : Use modulus operator to determine whether no is even or odd.
*/