package m02FOpOOPs_II_11_25_22;

class D32MethodOverloadingExample {
	public void calculateSquare ( ){
		System.out.println("Method with No Argument Called ");
	}
	
	public void calculateSquare(double number){
		double square = number * number; 
		System.out.println("Method with double Argument Called:"+square);
	}
	
	public void calculateSquare(int number){
		int square=number*number;
		System.out.println("Method with Integer Argument Called: "+square);
	}
	
	
	public static void main(String[] args) {
		D32MethodOverloadingExample obj = new D32MethodOverloadingExample();
	
		obj.calculateSquare();
		obj.calculateSquare(5); 
		obj.calculateSquare(2.5);
	}
}
