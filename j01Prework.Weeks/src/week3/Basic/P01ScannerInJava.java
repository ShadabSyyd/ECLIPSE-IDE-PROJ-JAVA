package week3.Basic;
import java.util.Scanner;

public class P01ScannerInJava {
	public static void main(String[] args) {
	Scanner some=new Scanner(System.in);
	System.out.println("Enter an integer Value");
	int num1=some.nextInt();
	System.out.println("Enter a float Value");
	float num2=some.nextFloat();
	System.out.println("Enter a double Value");
	double num3=some.nextDouble();
	System.out.println("Enter a boolean Value");
	boolean num4=some.nextBoolean();
	System.out.println("Enter a String");
	String word=some.next();
	System.out.println("Enter a char Value");
	char num5=some.next().charAt(0);
	some.close();
	
	System.out.println("integer "+num1);
	System.out.println("float "+num2);
	System.out.println("double "+num3);
	System.out.println("boolean "+num4);
	System.out.println("String "+word);
	System.out.println("char "+num5);
	}

}

/*
 * Create a basic Java program to implement Java I/O operations
 * 
1) Create variable of type int, float, double, boolean, char
2) Take input of all the variables 
3) display all the values on the console

Use Scanner Object in order to perform input operations. 
{Scanner class : is used to take input and is present in java.util package,
objects and package and other topics will be covered in depth in coming modules}
 * 
 */