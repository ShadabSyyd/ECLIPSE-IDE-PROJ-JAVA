package m02FOpOOPs_II_11_25_22;

class Animal29 {
	private int age=100;
//	private int age;
	public int getAge () {
		return age;
	}

	public void setAge ( int age) { 
		this. age = age;
	}
}


class D29EncapsulationExample {
	public static void main (String args[]){
		Animal29 a1= new Animal29 (); 
		a1.setAge (12);
		System.out.println(" Animal age is " + a1.getAge());
	}
}