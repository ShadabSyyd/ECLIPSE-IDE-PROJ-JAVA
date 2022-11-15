package week2.Basic;

public class P2TernaryOperator {

	public static void main(String[] args) {
		int num2=221;
		
//BASIC METHOD
//		if(num2%2==0 && num2!=0)
//			System.out.println(num2+" is Even");
//		else
//			System.out.println(num2+" is Not an Even Number");
		
//ERROR NOT WORKING IN JAVA
//		(num2%2==0 && num2!=0)? System.out.println(num2+" is Even"):System.out.println(num2+" is not an Even Number");
		
		
		
//RIGHT HAND VARIABLE METHOD FOR TERNARY OPERATORS
		String result=(num2%2==0 && num2!=0)?"Even" :"Not Even";
		System.out.println(num2+" is "+result);
	}

}


//Write a program in java to check whether the given number is an even number or not using ternary Operator.