package week3.Basic;

public class P03Print10To1WhileLoop {
	public static void main(String[] args){
		int a=10;
		boolean b=true;
		while(b==true){
			System.out.println(a);
			a--;
			b=(a>0)?true:false;
		}
		
		System.out.println("Above method is with Extra Steps\nBasic Way: ");
		
		a=10;
		while(a>0){
			System.out.println(a);
			a--;
		}
		
	}
}


/*
Write a program to print no from 10 to 1 ( 10, 9, 8, 7 ….. 1 ) 

using a while loop.
 */