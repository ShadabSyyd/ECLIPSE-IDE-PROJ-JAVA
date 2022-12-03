package m02FOpOOPs_II_11_25_22;

class Car{
	public void vehicleType(){ 
		System.out.println("Type: SUV ");
	}
}

class Hyundai extends Car{
	public void brand(){
		System.out.println("Brand: Hyundai");
	}

	public void calculateSpeed(){ 
		System.out.println("Speed: 100 kmph");
	}
}

class Creta extends Hyundai{
	public void model(){
		System.out.println("Model: Creta");
	}
	public void calculateSpeed(){ 
		System.out.println("Speed: 120 kmph");
	}
}

class D04MultiLevelInheritanceExample{	
	public static void main(String[] args){
	Creta obj = new Creta();
	obj.vehicleType();
	obj.brand();
	obj.model();
	obj.calculateSpeed();
	}
}


/*
Output::::

Type: SUV 
Brand: Hyundai
Model: Creta
Speed: 120 kmph
*/