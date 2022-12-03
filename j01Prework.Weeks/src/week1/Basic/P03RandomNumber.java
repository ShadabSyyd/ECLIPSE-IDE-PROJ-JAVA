package week1.Basic;

import java.util.Random;

public class P03RandomNumber {
	public static void main(String[] args){
		Random newNo=new Random();
		int a=newNo.nextInt(100);
		int b=newNo.nextInt(1000);
		int c=newNo.nextInt(10000);
		
		
		System.out.println("Random between 0 to 99- "+a);
		System.out.println("Random between 0 to 999- "+b);
		System.out.println("Random between 0 to 9999- "+c);
		
	}
}
