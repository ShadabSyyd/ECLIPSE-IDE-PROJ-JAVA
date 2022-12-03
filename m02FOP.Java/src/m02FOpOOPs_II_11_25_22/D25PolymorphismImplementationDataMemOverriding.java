package m02FOpOOPs_II_11_25_22;

class Bike5{ 
int speedlimit=80;
public void move(){
}
}
public class D25PolymorphismImplementationDataMemOverriding extends Bike5{ 
int speedlimit=160; 

public static void main(String args[]){ 
Bike5 obj=new D25PolymorphismImplementationDataMemOverriding();
System.out.println(obj+" Object ID or Identity HashMap");
System.out.println(obj.speedlimit);
}
}

//We cannot override data members
//Methods can be overridden
