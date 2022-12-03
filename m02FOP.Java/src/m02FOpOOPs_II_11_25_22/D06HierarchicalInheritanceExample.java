package m02FOpOOPs_II_11_25_22;
//
//public class D06HierarchicalInheritanceExample {
//
//}

class Car1{
public void vehicleType(){
	System.out.println("Type: SUV ");
}
}

class Hyundai1 extends Car{
public void brand(){
	System.out.println("Brand: Hyundai");
}
public void calculateSpeed(){
	System.out.println("Speed: 100 kmph");
}
}


class Ford1 extends Car{
	public void brand(){
		System.out.println("Model: Ford");
	} 
	public void calculateSpeed(){
		System.out.println("Speed: 120 kmph");
	}
}

class Main{
	public static void main(String[] args){
		
		Hyundai1 obj1 = new Hyundai1();
		obj1.vehicleType();
		obj1.brand();
		obj1.calculateSpeed();
		
		
		Ford1 obj2 = new Ford1();
		obj2.vehicleType();
		obj2.brand();
		obj2.calculateSpeed();
	}
}

/*
Output:
Type: SUV
Brand: Hyundai
Speed: 100 kmph
Type: SUV
Brand: Ford
Speed: 120 kmph
*/
