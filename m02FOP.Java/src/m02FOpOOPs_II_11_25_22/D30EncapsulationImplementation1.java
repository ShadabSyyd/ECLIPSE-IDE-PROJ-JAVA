package m02FOpOOPs_II_11_25_22;

class StudentEncap{
	private int rollno;
	private String name;
	private float fee;

//	int rollno;
//	String name;
//	float fee;
	
	
	StudentEncap (int rollno, String name, float fee){
	this.rollno=rollno;
	this.name=name;
	this.fee=fee;
	
//	rollno=rollno;  //This is required or else it will return 0 and null always
//	name=name;
//	fee=fee;
	}
	
	public void display () { 
	System.out.println(rollno+" "+name+" "+fee);
	}
}


public class D30EncapsulationImplementation1{
	public static void main(String args[]){ 
	
	StudentEncap s1=new StudentEncap (18, "Virat", 5000f);
	
	StudentEncap s2=new StudentEncap (7, "Mahi", 6000f);
	
	s1.display();
	s2.display();
	
	
	
//	System.out.println(s1.rollno); //Error because we cannot access private datatypes without method
//	
//	StudentEncap s3=new StudentEncap (7, "Mahi", 6000f);
//	s3.rollno=22;                  //Error because we cannot Declare private datatypes without method
//	System.out.println(s3.rollno); //Error because of private access if we make all private default, protected or public then it will run
	}
}