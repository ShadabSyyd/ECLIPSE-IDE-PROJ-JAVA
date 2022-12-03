package m02FOpOOPs_II_11_25_22;



class VehiclePoly{

void run()
{System.out.println("Vehicle is running");
}
}

public class D21PolymorphismImplementation2 extends VehiclePoly{
void run(){
System.out.println("Bike is running safely");
}

public static void main(String args[]){
	D21PolymorphismImplementation2 obj = new D21PolymorphismImplementation2(); 
	
	//Cannot perform ???
	//D21PolymorphismImplementation2 obj = new VehiclePoly(); 

obj.run();
}
}