package m01FOP.Java;

class algorithm{
	String fullName;
	int age;
	void something(int a, String b) {
		fullName=b;
		age=a;
	}
	void nothing() {
		System.out.println("Name is "+fullName+"\nAge is "+age+"\n");
	}
}
	
public class C01CreateClass {
	public static void main(String[] args) {
	algorithm name1=new algorithm();
	algorithm name2=new algorithm();
	name1.something(32,"Azam");
	name2.something(55,"Altaph");
	name1.nothing();
	name2.nothing();
	}
}

/*
 Write an algorithm to create a class Customer that contains 

          fullName(String) and age(int) as variables in class. 

Create a main method, assign values to the variables in the main method and print the values of variables using the object of Customer class in the main method. 

After writing the algorithm, write suitable code, run the program, and check the output.

 

Algorithm

Step 1: Start

. . .

. . .

. . .

Step n: Stop


 
 */