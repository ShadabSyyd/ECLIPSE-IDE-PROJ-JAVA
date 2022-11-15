package week2.Basic;
import java.util.Scanner;
public class P4LeapYear {
	public static void main(String[] args) {
		Scanner po=new Scanner(System.in);
		
		System.out.println("Enter the Year: ");
		int year=po.nextInt();
		po.close();
		if ((year%400==0) || (year%4==0 && year%100!=0)) {
			System.out.println(year+" is a leap year");
		}
//Integrated Above
//		else if(year%4==0 && year%100!=0){
//			System.out.println(year+" is a Leap Year");
//		}
//Not Needed
//		else if(year%100==0 && year%400!=0){
//		System.out.println(year+" is NOT a leap year");
//		}
		else {
			System.out.println(year+" is NOT a leap year");
		}
	}
}


/*

Description
Write a java program to check whether a year is a leap year or not
A year is a leap year if the following conditions are satisfied
1. The year is multiple of 400
2. The year is multiple of 4 and not multiple of 100


//if leap year is perfectly divisible by 400 print leap year

//print not a leap year if divisible by 100 and not divisible by 400

//print leap year if divisible by 4 and not divisible by 100

// rest all years are non leap years

 */