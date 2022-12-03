package m02FOpOOPs_II_11_25_22;

abstract class Bike{
	abstract void runn();
}

public class D13AbstractionImplementation extends Bike{ 
	void runn(){ 
		System.out.println("Running safely");
	}
	public static void main (String[] args){
		Bike obj=new D13AbstractionImplementation();  
		
		
		//Since the Bike is a abstract class so we will create an obj in bike
		//But the for the Bike obj object the reference will be of non abstract D13AbstractionImplementation
		
		obj.runn();
	}
}