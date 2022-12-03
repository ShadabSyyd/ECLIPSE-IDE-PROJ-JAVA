package m01FOP.Java;
class Student{
	int rollno;						//Attributes
	String name;
	static String institute="IITR";
	
	static void change() {			//Method to change Static Variable above
		institute="IITB";			//VV IMP
	}
	Student(int r, String s){		//Parameterized constructor to initialize the variable
		rollno=r;
		name=s;
	}
	void display() {				//Method for displaying values
		System.out.println("Roll No= "+rollno+"\nName= "+name+"\nInstitute= "+institute+"\n");
		
	}
	
}

public class D10_03StaticDemoInMethod {
	public static void main(String[] args) {
		Student.change();						//Calling change method
		Student s1=new Student(101,"Virat");	//Using Parameterized Constructor as Default is not mentioned so its default(somewhat default)
		Student s2=new Student(102,"Rahul");
		Student s3=new Student(103,"Penny");
		s1.display();							//Calling display method
		s2.display();
		s3.display();
		
	}
}
