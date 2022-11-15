package week2.Basic;

public class P5Interchange2Numbers {
	public static void main(String[] args){
		int a=22,b=33,c;
		System.out.println("Value of A is "+a+"\nValue of B is "+b);
		c=a;
		a=b;
		b=c;
		System.out.printf("Value of A is %d\nValue of B is %d",a,b);
	}

}
